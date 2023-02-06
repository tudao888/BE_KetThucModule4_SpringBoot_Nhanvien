package com.example.ketthucmodule4_springboot.service;

import com.example.ketthucmodule4_springboot.model.Staff;
import com.example.ketthucmodule4_springboot.repository.IStaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    IStaffRepo iStaffRepo;
    public List<Staff> findAll() {
        return (List<Staff>) iStaffRepo.findAll();
    }

    public void save(Staff staff) {
        iStaffRepo.save(staff);
    }

    public void delete(int id) {
        iStaffRepo.deleteById(id);
    }

    public Staff findById(int id) {
       return iStaffRepo.findById(id).get();
    }
}
