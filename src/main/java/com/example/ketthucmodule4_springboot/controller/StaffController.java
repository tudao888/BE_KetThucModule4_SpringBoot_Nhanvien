package com.example.ketthucmodule4_springboot.controller;

import com.example.ketthucmodule4_springboot.model.Staff;
import com.example.ketthucmodule4_springboot.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/staffs")
public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping
    public List<Staff> getAll() {
        return staffService.findAll();
    }

    @PostMapping
    public Staff create(@RequestBody  Staff staff) {
        staffService.save(staff);
        return staff;
    }

    @GetMapping("/{id}")
    public Staff showEdit(@PathVariable int id) {
        return staffService.findById(id);
    }

    @PutMapping
    public void update(@RequestBody Staff staff) {
        staffService.save(staff);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        staffService.delete(id);
    }
}
