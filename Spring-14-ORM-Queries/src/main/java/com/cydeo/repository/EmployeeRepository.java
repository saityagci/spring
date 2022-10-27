package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
    // Display all employees with email address
    List<Employee> findByEmail(String email);
    // Display all employees with first name '' and last name '', also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName,String lastName,String email);
    //Display all employees that first name is not ''
    List<Employee> findByFirstNameIsNot(String firstName);
    // Display all employees where last name start with ''
    List<Employee>findByLastNameStartsWith(String lastName);
    // Display all employees with salaries higher than ''
    List<Employee> findBySalaryGreaterThan(Integer salary);
    //Display all employees with salary less than
    List<Employee> findBySalaryLessThanEqual(Integer salary);
    // Display all employees that has been hired between '' and ''
    List <Employee>findByHireDateBetween(LocalDate startDate,LocalDate endDate);
    //Display all employees where salary greater and equal to '' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalarySalaryDesc(Integer salary);
    //Display top unique 3 employees that is making less than ''
    List<Employee>findDistinctTopBy3BySalaryLessThan(Integer salary);
    //Display all employees that not have email address
    List<Employee>findByEmailIsNull(String email);
}
