import java.util.*;

class Employee{
    String name;
    int age;
    double salary;
    public Employee(String name, int age, double salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}
public  class Question2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Anand Kumar",20,20000));
        employees.add(new Employee("Abhay Sahu",23,35000));
        employees.add(new Employee("Aman Mishra",21,25000));
        employees.add(new Employee("Prashant Dubey",27,32000));
        employees.add(new Employee("Himanshu Singh",30,35000));
        employees.add(new Employee("Dev Mishra",23,40000));
        employees.add(new Employee("Anjali Parihaar",22,25000));
        employees.add(new Employee("Deepak Mishra",20,28000));
        employees.add(new Employee("Aman Dubey",22,30000));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        Iterator<Employee> it=employees.iterator();
        while (it.hasNext()){
            System.out.println(it.next().name);
        }
    }
}