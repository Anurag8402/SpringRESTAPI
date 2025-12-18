package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Office;
import com.example.demo.services.OfficeService;

@RestController
@RequestMapping("/office")
public class OfficeController {

	@Autowired
	OfficeService oservice;
	
	@GetMapping("/getAll")
	public List<Office> getAll()
	{
		return oservice.getAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Office office)
	{
		oservice.saveOfficeDetail(office);
	}
	
	@DeleteMapping("/delete/{officecode}")
	public void delete(@PathVariable int officecode)
	{
		oservice.deleteData(officecode);
	}
	
	@GetMapping("/getcount/{country}")
	public int getCount(@PathVariable String country)
	{
		return oservice.getCountCountry(country);
	}
	
	@GetMapping("/getcountrylist/{country}")
	public List<Office> getCountry(@PathVariable String country)
	{
		return oservice.getCountryList(country);
	}
	
	@PutMapping("/update/{phone}/{officecode}")
	public void updatephone(@PathVariable String phone,@PathVariable Integer officecode)
	{
		oservice.update(phone,officecode);
	}
	
}
