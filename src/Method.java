import Model.Employee;
import Model.FullTimeEmployee;
import Model.ParttimeEmployee;

import java.util.Scanner;

public class Method {
    public static void displayEmployee(Employee[] employees) {
        for (Employee e : employees
        ) {
            System.out.println(e);
        }
    }

    public static Employee[] addNewEmployee(Employee[] employees, Employee newEmployee) {
        Employee[] newEmployeeList = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newEmployeeList[i] = employees[i];
        }
        newEmployeeList[employees.length] = newEmployee;
        return newEmployeeList;
    }
    public static Employee creatNewParttimeEmployee(){
        System.out.println("Nhập thông tin nhân viên:");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập mã nhân viên:");
        String employeeId= scanner.nextLine();
        System.out.println("Nhập tên:");
        String name= scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age= scanner.nextInt();
        System.out.println("Nhập số điện thoại:");
        String phone = scanner.nextLine();
        System.out.println("Nhập gmail:");
        String mail= scanner.nextLine();
        System.out.println("Nhập số giờ làm việc:");
        int workHour= scanner.nextInt();
        Employee employee= new ParttimeEmployee(employeeId,name,age,phone,mail,workHour);
        return employee;
    }
}


