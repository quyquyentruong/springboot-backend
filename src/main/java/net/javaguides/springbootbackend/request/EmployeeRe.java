package net.javaguides.springbootbackend.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeRe {
    private String firstName;

    private String lastName;

    private String emailId;

    private EmployeeDetailRe employeeDetailRe;

    private List<ListPointRe> listPointRe;
}
