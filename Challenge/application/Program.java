package Challenge.application;

import Challenge.Entities.Department;
import Challenge.Entities.HourContract;
import Challenge.Entities.Worker;
import Challenge.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        Department department = new Department(departmentName);

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level (JUNIOR / MID_LEVEL / SENIOR): ");
        String levelStr = sc.nextLine();
        WorkerLevel level = WorkerLevel.valueOf(levelStr.toUpperCase());
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();
        Worker workerData = new Worker(name, level, baseSalary);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Enter contract number " + (i + 1) + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            String dateStr = sc.nextLine();

            LocalDate date = LocalDate.parse(dateStr, formatter);

            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            sc.nextLine();

            workerData.addContract(new HourContract(value, duration, date));

        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthStr = sc.nextLine();
        LocalDate date = LocalDate.parse("01/" + monthStr, formatter);

        int month = date.getMonthValue();
        int year = date.getYear();

        double income = workerData.income(year, month);

        System.out.println("Name: " + workerData.getName());
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Income for " + monthStr + ": " + String.format("%.2f", income));


        sc.close();
    }
}
