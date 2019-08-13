package com.zhzk.myproject.service.impl;

import com.zhzk.myproject.entity.Company;
import com.zhzk.myproject.entity.QueryVO;
import com.zhzk.myproject.mapper.CompanyMapper;
import com.zhzk.myproject.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @create 2019-07-08-9:33
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public int insert(Company company) {
        return companyMapper.insert(company);
    }

    @Override
    public List<Company> findAll() {

        return companyMapper.findAll();
    }

    @Override
    public List<Company> selectByCondition(Company company) {
        return companyMapper.selectByCondition(company);
    }

    @Override
    public List<Company> findCompanyInIds(QueryVO vo) {
        return companyMapper.findCompanyInIds(vo);
    }

    @Override
    public List<Company> selectById(Integer id) {
        return companyMapper.selectById(id);
    }

    @Override
    public List<Company> selectCpyInv() {
        return companyMapper.selectCpyInv();
    }


}
