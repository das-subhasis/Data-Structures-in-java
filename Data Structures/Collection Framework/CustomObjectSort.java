import java.util.Arrays;

class Employee implements Comparable <Employee>{
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int compareTo(Employee e) {
        if(age == e.age){
           return salary - e.salary;
        }
        return age - e.age;
    }

    public String toString(){
        return String.format("{%s, %d, %d}",name,salary,age);
    }

}

public class CustomObjectSort {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Rohan",24,30000);
        employees[1] = new Employee("Shubham",31,60000);
        employees[2] = new Employee("Laxmi",24,90000);
        employees[3] = new Employee("Kritika",29,50000);

        System.out.println("Before sorting: "+Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println("After sorting: "+Arrays.toString(employees));
    }
}
