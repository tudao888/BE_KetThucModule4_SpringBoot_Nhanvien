package com.example.ketthucmodule4_springboot.service;

import com.example.ketthucmodule4_springboot.model.Department;
import com.example.ketthucmodule4_springboot.repository.IDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    IDepartmentRepo iDepartmentRepo;
    public List<Department> findAll() {
        return (List<Department>) iDepartmentRepo.findAll();
    }

    public Department findById(int id) {
        return iDepartmentRepo.findById(id).get();
    }
}
