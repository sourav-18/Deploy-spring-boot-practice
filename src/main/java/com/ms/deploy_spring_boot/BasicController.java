package com.ms.deploy_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/basic")
public class BasicController {
    @GetMapping
    public String getBasic() throws UnknownHostException {
        String host = InetAddress.getLocalHost().getHostName();
        long pid=ProcessHandle.current().pid();
        String instance = System.getenv("INSTANCE_NAME");
        return "instance: "+ instance+" basic work Pid: "+pid+" host: "+host;
    }
}


