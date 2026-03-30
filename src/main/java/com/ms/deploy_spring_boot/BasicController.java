package com.ms.deploy_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {
    @GetMapping
    public String getBasic(){
        long pid=ProcessHandle.current().pid();
        return "basic work Pid: "+pid;
    }
}
