import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            Boolean idVerification = idExist(list, id);
            if(idVerification == true){
                System.out.println("ID already taken!");
                return;
            }

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSelected = sc.nextInt();
        Integer pos = position(list, idSelected);
        if(pos == null){
            System.out.println("This Id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).setPercentage(percent);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for(Employee emp : list){
            System.out.println(emp);
        }


        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static Boolean idExist(List<Employee> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }

}