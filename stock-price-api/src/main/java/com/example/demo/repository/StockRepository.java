package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StockPrice;



@Repository
public interface StockRepository extends JpaRepository<StockPrice, Serializable> {
	
@Query("select companyStockPrice from StockPrice where companyName=:companyName")
public	Double getByCompanyName(String companyName);

}
