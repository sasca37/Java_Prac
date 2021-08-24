package rambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex3 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1,"a",1000),
                new Employee(2,"b",1200),
                new Employee(3,"c",1500),
                new Employee(4,"d",1100)
        );

        Consumer<Employee> consumer = x -> {
            //salary 2배
            x.setSalary(x.getSalary() * 2);
        };
        doubleSalary(emp, consumer);
    }
    private static void doubleSalary(List<Employee> emp, Consumer<Employee> f) {
        for(Employee e: emp) {
            f.accept(e);
            System.out.println(e);
        }
    }
}

@Data
@AllArgsConstructor
class Employee {
    private int no;
    private String name;
    private double salary;
}

