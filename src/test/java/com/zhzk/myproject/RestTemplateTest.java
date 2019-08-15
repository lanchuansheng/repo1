package com.zhzk.myproject;

import com.zhzk.myproject.entity.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyprojectApplication.class)
public class RestTemplateTest {
    //首先在启动类中注册Bean，再注入
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void httpGet(){
        Company company = restTemplate.getForObject("http://localhost:8088/yzbManager/company/selectById/1",Company.class);
        System.out.println(company);
        System.out.println(company.getSuoxie());

    }
}
