package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.Company;
import com.khmall.service.CompanyService;

@Controller
public class CompanyController {
	@Autowired
	private CompanyService CompanyService; 
	
	@GetMapping("/allCompany")
	public String getallCompany(Model model) {
		List<Company> companyList = CompanyService.getallCompany();
		model.addAttribute("companyList" , companyList);
		return "companyList";
	}
}
