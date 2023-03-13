package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.model.EmployeeDetail;
import net.javaguides.springbootbackend.repository.EmployeeDetailRepository;
import net.javaguides.springbootbackend.request.EmployeeDetailRe;
import net.javaguides.springbootbackend.request.EmployeeRe;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import net.javaguides.springbootbackend.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeDetailRepository empDetailRepo;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/create")
    Employee newEmployee(@RequestBody EmployeeRe newEmployee) {
// Tạo mapper object
        ModelMapper mapper = new ModelMapper();
        EmployeeDetail employee = mapper.map(newEmployee.getEmployeeDetailRe(), EmployeeDetail.class);
        empDetailRepo.save(employee);
        employee.getId();
        return null;
    }

}
