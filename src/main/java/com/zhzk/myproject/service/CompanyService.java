package com.zhzk.myproject.service;

import com.zhzk.myproject.entity.Company;
import com.zhzk.myproject.entity.QueryVO;

import java.util.List;

/**
 * @author
 * @create 2019-07-08-9:42
 */
public interface CompanyService {

    int insert(Company company);
    List<Company> findAll();
    List<Company> selectByCondition(Company company);
    List<Company> findCompanyInIds(QueryVO vo);
    List<Company> selectById(Integer id);


    List<Company> selectCpyInv();
}
