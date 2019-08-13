package com.zhzk.myproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhzk.myproject.entity.Company;
import com.zhzk.myproject.mapper.CompanyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyprojectApplication.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 使用Redis查询数据
     * */
    @Test
    public void test() throws JsonProcessingException {
        String companyListJson = redisTemplate.boundValueOps("company.findAll").get();
        //System.out.println(companyListJson);
        if(null==companyListJson){
            List<Company> companies = companyMapper.findAll();
            ObjectMapper objectMapper = new ObjectMapper();
            companyListJson=objectMapper.writeValueAsString(companies);
            redisTemplate.boundValueOps("company.findAll").set(companyListJson);
            System.out.println("======从数据库中查询获得company数据=========");
        }else {
            System.out.println("======从redis中查询获得company数据=========");
        }
        System.out.println(companyListJson);

    }
}
