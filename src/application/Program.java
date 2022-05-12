package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Name: ");
        String name = teclado.nextLine();
        System.out.print("Gross salary: ");
        Double grossSalary = teclado.nextDouble();
        System.out.print("Tax: ");
        Double tax = teclado.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println();
        System.out.print("Employee: " + employee);

        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = teclado.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println();
        System.out.print("Updated data: " + employee);


    }
}
