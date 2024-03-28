package com.jalaramcwa.java;
import com.jalaramcwa.java.tables.Employee2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class StreamFunction {
    public static void main(String[] args) {
        List<Employee2> employeeList = new ArrayList<Employee2>();
        //id, name, age,gender,department, year of joining,salary
        employeeList.add(new Employee2(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee2(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee2(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee2(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee2(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

        //return the employee names and there department having salary greater then the avg salary
        double d = 0;
        for(Employee2 e : employeeList){
            d += e.getSalary();
        }


        double avg = d/employeeList.size();
        System.out.println(avg);

        Map<String, String> collect = employeeList.stream().filter(i -> i.getSalary() > avg)
                .collect(Collectors.toMap(Employee2::getName, Employee2::getDepartment));
        System.out.println(collect);

    }
}
