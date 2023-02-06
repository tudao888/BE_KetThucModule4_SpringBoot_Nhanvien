package com.example.ketthucmodule4_springboot.repository;

import com.example.ketthucmodule4_springboot.model.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStaffRepo extends PagingAndSortingRepository<Staff, Integer> {
}
