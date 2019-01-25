package com.schoolofnet.entity.repository;

import org.springframework.data.repository.CrudRepository;

import com.schoolofnet.entity.Customer;

// parametros: nome da classe e o id que será serializado, nesse caso Customer e Long
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	public Customer findByName(String name);

}
