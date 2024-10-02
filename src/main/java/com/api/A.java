package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "mike"),
                new Employee(2, "stallin"),
                new Employee(3, "adam")
        );                       //employess takes the 1st object address and gives it to e and cals maptodtotaking that addtess inside(e)
        List<EmployeeDto> dtos = employees.stream().map(e -> mapToDto(e)).collect(Collectors.toList());// takes the object address and gives to the stream and stream passes
//to e and e call mapToDto method.
    }
     static EmployeeDto mapToDto(Employee employee){
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        return dto;
    }
}
