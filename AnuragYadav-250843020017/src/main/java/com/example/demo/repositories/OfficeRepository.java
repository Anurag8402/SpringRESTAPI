package com.example.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Office;




@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer> {

	
	
	 @Query("SELECT COUNT(o) from Office o where o.country=:country")
	 int fetchcount(String country);

	 @Query("SELECT o from Office o where o.country=:country")
	 List<Office> getcountryList(String country);

	 @Modifying
	 @Query("UPDATE Office o SET o.phone = :phone WHERE o.officecode = :officecode")
	 void update(String phone,Integer officecode);
	}

