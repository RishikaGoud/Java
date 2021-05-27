package employee;

import java.util.Scanner;

public class Employee {
    String name, address;
    int year;
    double salary;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nName: ");
        name = sc.nextLine();
        System.out.print("Year of joining: ");
        year = sc.nextInt();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
        System.out.print("Address: ");
        address = sc.nextLine();
        address = sc.nextLine();
    }

    void display()
    {
        System.out.println("\nName: "+name);
        System.out.println("Year of joining: "+year);
        System.out.println("Salaary: "+salary);
        System.out.println("Address: "+address);
    }

    public static void main(String[] args)
    {
        Employee emp[] = new Employee[3];
        System.out.println("\n Enter employee details: ");
        for (int i=0; i<3; i++)
        {
            emp[i] = new Employee();
            System.out.print("\n INPUT EMPLOYEE "+(i+1)+" Details");
            emp[i].input();
        }
        for (int i=0; i<3; i++)
        {
            System.out.print("\nDISPLAYING EMPLOYEE "+(i+1)+" Details");
            emp[i].display();
        }
    }
}
