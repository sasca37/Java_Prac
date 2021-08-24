package rambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex4 {
    public static void main(String[] args) {
        List<Employee1> emp = Arrays.asList(
                new Employee1(1,"a",1000),
                new Employee1(2,"b",1200),
                new Employee1(3,"c",1500),
                new Employee1(4,"d",1100)
        );
        emp.forEach((x) -> {
            x.setSalary(x.getSalary() * 2);
            System.out.println(x);
        });
    }

}

@Data
@AllArgsConstructor
class Employee1 {
    private int no;
    private String name;
    private double salary;
}


