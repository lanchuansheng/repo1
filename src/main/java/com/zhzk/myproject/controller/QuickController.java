package com.zhzk.myproject.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quick")
@ConfigurationProperties(prefix = "person")
@Data
public class QuickController {
   // @Value("${person.name}")
    private String name;
   // @Value("${person.age}")
    private Integer age;
   // @Value("${person.addr}")
    private String addr;
    @RequestMapping("quickStart")
    public String quickStart(){
        return name+""+age+""+addr;
    }
}
