import java.util.*;

class Employees{
    String name;
    int age;
    String designation;

    public Employees(String name,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }
}

public class Question4 {
    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<Employees>();
        employees.add(new Employees("Akshay Mishra",23,"Technical support"));
        employees.add(new Employees("Abhishek Dubey",24,"Software Engineer"));
        employees.add(new Employees("Shubham Shukla",23,"Technical Engineer"));

        Map<Employees,Double> map=new HashMap<Employees,Double>();
        map.put(employees.get(0),20000.0);
        map.put(employees.get(1),35000.0);
        map.put(employees.get(2),50000.0);
        System.out.println(map);
    }
}