package com.example.ketthucmodule4_springboot.repository;

import com.example.ketthucmodule4_springboot.model.Department;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepo extends PagingAndSortingRepository<Department, Integer> {
}
