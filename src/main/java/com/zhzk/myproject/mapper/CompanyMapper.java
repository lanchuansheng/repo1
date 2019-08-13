package com.zhzk.myproject.mapper;


import com.zhzk.myproject.entity.Company;
import com.zhzk.myproject.entity.QueryVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author
 * @create 2019-07-08-9:02
 */
@Mapper
@Component
public interface CompanyMapper {

   int insert(Company company);
   List<Company> findAll();
   List<Company> selectByCondition(Company company);
   List<Company> findCompanyInIds(QueryVO vo);
   List<Company> selectById(Integer id);


    List<Company> selectCpyInv();
}
