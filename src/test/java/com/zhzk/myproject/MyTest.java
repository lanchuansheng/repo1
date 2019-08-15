package com.zhzk.myproject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhzk.myproject.entity.Company;
import com.zhzk.myproject.entity.QueryVO;
import com.zhzk.myproject.mapper.CompanyMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyprojectApplication.class)
public class MyTest {
    @Autowired
    private CompanyMapper companyMapper;

    private static final ObjectMapper MAPPER = new ObjectMapper();
    CloseableHttpClient httpClient;


    @Test
    public void testFindAll() {
        List<Company> companies = companyMapper.findAll();
        for (Company company : companies) {
            System.out.println(company);
        }


    }
    @Test
    public void testFindCompanyInIds(){
        QueryVO vo = new QueryVO();
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        vo.setIds(list);
        List<Company> companies = companyMapper.findCompanyInIds(vo);
        for (Company company : companies) {
            System.out.println(company);
        }

    }
    @Test
    public void testHttpClient() throws Exception {
        HttpGet request = new HttpGet("http://localhost:8088/yzbManager/company/selectById/1");

        HttpResponse response = httpClient.execute(request);
        System.out.println(response);
       /* Company company = MAPPER.readValue(response, Company.class);
        String value = MAPPER.writeValueAsString(company);
        System.out.println(value);
*/
    }
    @Test
    public void testHttpClient2() throws Exception {
        //采用接口方式获取httpclient
        HttpClient httpClient = HttpClients.createDefault();
        //声明请求方式
        HttpGet httpGet =new HttpGet("http://www.baidu.com");
        //获取相应数据
        HttpResponse httpResponse =httpClient.execute(httpGet);
        //拿到实体
        HttpEntity httpEntity =httpResponse.getEntity();
        //获取结果
        String result="";
        if (httpClient!=null){
            result= EntityUtils.toString(httpEntity,"utf-8");
        }
        System.out.println(result);
        //关闭连接
        httpGet.releaseConnection();

    }
}
