import Model.Employee;
import Model.FullTimeEmployee;
import Model.ParttimeEmployee;

public class Main {
    public static Employee[] employees;
    public static void main(String[] args) {
        employees = new Employee[0];
        Employee nv1= new ParttimeEmployee("001","nv1",18,"012015487","nv1@gmail.com",20);
        Employee nv2= new ParttimeEmployee("002","nv2",20,"014582058","nv2@gmail.com",25);
        Employee nv3= new FullTimeEmployee("003","nv3",24,"0214852154","nv3@gmail.com",100000,20000,300000);
        Employee nv4= new FullTimeEmployee("004","nv4",22,"021485863","nv4@gmail.com",30000,10000,500000);
        employees= Method.addNewEmployee(employees,nv1);
        employees= Method.addNewEmployee(employees,nv2);
        employees= Method.addNewEmployee(employees,nv3);
        employees= Method.addNewEmployee(employees,nv4);
        Method.displayEmployee(employees);
    }
}
