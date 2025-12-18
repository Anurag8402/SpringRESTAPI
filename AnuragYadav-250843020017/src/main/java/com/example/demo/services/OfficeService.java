package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Office;
import com.example.demo.repositories.OfficeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OfficeService {

	@Autowired
	OfficeRepository orepo;
	
	public List<Office> getAll() {
		return orepo.findAll();
	}

	public void saveOfficeDetail(Office office) {
		 orepo.save(office);
	}

	public void deleteData(int officecode) {
		orepo.deleteById(officecode);
	}
	

	 public int getCountCountry(String country) {
	        return orepo.fetchcount(country);
	    }

	 public List<Office> getCountryList(String country) {
		return orepo.getcountryList(country);
	 }

	 public void update(String phone, Integer officecode) {
		orepo.update(phone,officecode);
	 }

}
