package stream.employee_prog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * 	1. Program to print Max/Min employee salary from the given collection
 * 	2. Program to print the max salary of an employee from each department
 * 	3. program to print active and inactive emp from the given collection
 * 	4. program to print employee details working in each department
 *  5. program to print employee count working in each department
 *  6. program to print employee total salary in each department
 */

public class EmployeeQA {
     public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        EmployeeQA obj = new EmployeeQA();
        obj.createEmployeeList(list);

        System.out.println("=======================================");

        // Max Salary
        Employee maxSalary = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
        System.out.println("Max Salary from all department : " + maxSalary);

        System.out.println("=======================================");
        // max salary from each dept
        System.out.println("Print Max Employee Salary from each dept:");
        System.out.println("=======================================");
        list.stream().collect(Collectors.groupingBy(
                Employee::getDept,
                Collectors.reducing(
                        BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))))
                .forEach((k,v) -> System.out.println("Department: "+ k + " \t|\t Name: " + v.get().getName() +" \t|\t Salary: " + v.get().getSalary()) );
        System.out.println("=======================================");
        // print active and inactive employee
        System.out.println("Print active and inactive employee count");
        System.out.println("=======================================");

        list.stream().collect(Collectors.groupingBy(
                                                Employee::getActive,
                                                Collectors.counting()
                                        ))
                                        .forEach((k,v) -> System.out.println(k+  "\t|\t" +v) );
        System.out.println("=======================================");
        // print employee details working in each department
        System.out.println("Print employee details working in each department");
        System.out.println("=======================================");
        list.stream().collect(Collectors.groupingBy(Employee::getDept)).forEach((k,v)-> System.out.println(k+" \t|\t" + v));
        System.out.println("=======================================");
        // print employee count working in each department
        System.out.println("Print employee count working in each department");
        System.out.println("=======================================");
        list.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+" \t|\t" + v));
        System.out.println("=======================================");
        System.out.println("Print employee total Salary in each department");
        list.stream().collect(Collectors.groupingBy(
	                        Employee::getDept,
	                        Collectors.summingDouble(Employee::getSalary)
	                ))
	                .forEach((k,v) -> System.out.println(k+  "\t|\t" +v) );

    }

    private void createEmployeeList(List<Employee>list){
        list.add(new Employee(11,"Naveen",32,"no","HR",2011,25000));
        list.add(new Employee(22,"Bobby",25,"yes","Sales And Marketing",2015,13500));
        list.add(new Employee(33,"Lucky",29,"yes","Infrastructure",2012,18000));
        list.add(new Employee(44,"Jeet",28,"yes","Product Development",2014,32500));
        list.add(new Employee(55,"Riya",27,"no","HR",2013,22700));
        list.add(new Employee(66,"Niraj",43,"yes","Security And Transport",2016,10500));
        list.add(new Employee(77,"Abhishek",35,"yes","Account And Finance",2010,27000));
        list.add(new Employee(88,"Roop",31,"yes","Product Development",2015,34500));
        list.add(new Employee(99,"Amit",24,"no","Sales And Marketing",2016,11500));
        list.add(new Employee(00,"Pramod",38,"yes","Security And Transport",2015,11000));
        list.add(new Employee(11,"Mohit",27,"no","Infrastructure",2014,15700));
        list.add(new Employee(22,"Nitin Joshi",25,"yes","Product Development",2016,28200));
        list.add(new Employee(33,"Jyothi Reddy",27,"no","Account And Finance",2013,21300));
        list.add(new Employee(44,"Nithin",24,"yes","Sales And Marketing",2017,10700));
        list.add(new Employee(55,"Anmol",23,"yes","Infrastructure",2018,12700));
        list.add(new Employee(66,"Sanvi Pandey",26,"no","Product Development",2015,28900));
        list.add(new Employee(77,"Anuj Chettiar",31,"yes","Product Development",2012,35700));

    }


    class Employee {
        private int id;
        private String name;
        private int age;
        private String active;
        private String dept;
        private int yearOfJoining;
        private double salary;
        Employee(){}

        public Employee(int id, String name, int age, String active, String dept, int yearOfJoining, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.active = active;
            this.dept = dept;
            this.yearOfJoining = yearOfJoining;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getActive() {
            return active;
        }

        public void setActive(String active) {
            this.active = active;
        }

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public int getYearOfJoining() {
            return yearOfJoining;
        }

        public void setYearOfJoining(int yearOfJoining) {
            this.yearOfJoining = yearOfJoining;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", active='" + active + '\'' +
                    ", dept='" + dept + '\'' +
                    ", yearOfJoining=" + yearOfJoining +
                    ", salary=" + salary +
                    '}';
        }
    }

}
