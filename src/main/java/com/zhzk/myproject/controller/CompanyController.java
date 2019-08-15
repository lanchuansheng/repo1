package com.zhzk.myproject.controller;


import com.zhzk.myproject.common.Result;
import com.zhzk.myproject.entity.Company;
import com.zhzk.myproject.entity.CompanyAndInv;
import com.zhzk.myproject.entity.QueryVO;
import com.zhzk.myproject.enums.ErrorEnum;
import com.zhzk.myproject.service.CompanyService;
import com.zhzk.myproject.service.CpyInvService;
import com.zhzk.myproject.utils.ResultUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author
 * @create 2019-07-08-9:47
 */
@RestController
@RequestMapping("company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private CpyInvService cpyInvService;


    @GetMapping("save")
    public int savaCompanyAndInv(@RequestBody CompanyAndInv companyAndInv){
        companyService.insert(companyAndInv.getCompany());
        cpyInvService.insert(companyAndInv.getCpyInv());

        return 1;
    }

    @GetMapping("findAll")
    public List<Company> findAll(){
        List<Company> companies = companyService.findAll();
        for (Company company : companies) {
           //System.out.println(company.toString());
            //System.out.println(company.getName());

        }
        return companies;
    }
    @PostMapping("selectByCondition")
    public List<Company> selectByCondition(@RequestBody Company company){
        List<Company> companies = companyService.selectByCondition(company);
        System.out.println(companies);
        return companies;
    }



    @GetMapping("findCompanyInIds")
    public List<Company> findCompanyInIds(QueryVO vo){
        List<Company> companies = companyService.findCompanyInIds(vo);
        //System.out.println(companies);
        return companies;

    }
    @GetMapping("selectById/{id}")
    @ResponseBody
    public Company selectById(@PathVariable(value = "id") Integer id){
        List<Company> companies = companyService.selectById(id);
        for (Company company : companies) {
            return company;

        }
        return null;

    }

    @GetMapping("selectAll")
    public Result selectAll(){
        List<Company> companies = companyService.findAll();
        for (Company company : companies) {
            //System.out.println(company.toString());
            //System.out.println(company.getName());
        }
        System.out.println(companies);

        return ResultUtils.result(ErrorEnum.SUCCESS,companies);
    }

    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam(value = "id",required = true) Integer id){
        ModelAndView mv = new ModelAndView();
        companyService.selectById(id);
        return mv;
    }

    @GetMapping("selectCpyInv")
    public ModelAndView selectCpyInv(){
        ModelAndView mv = new ModelAndView();
        List<Company> companies = companyService.selectCpyInv();
        for (Company company : companies) {
            //System.out.println(company);
        }
       mv.addObject("companies",companies);
       mv.setViewName("hello.html");

        return mv;
    }
}
