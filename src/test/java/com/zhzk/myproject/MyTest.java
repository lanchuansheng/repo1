package com.zhzk.myproject;

import com.zhzk.myproject.entity.Company;
import com.zhzk.myproject.entity.QueryVO;
import com.zhzk.myproject.mapper.CompanyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyprojectApplication.class)
public class MyTest {
    @Autowired
    private CompanyMapper companyMapper;


    @Test
    public void testFindAll(){
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
}
