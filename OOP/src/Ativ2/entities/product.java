package Ativ2.entities;

public class product{
        public String name;
        public double GrossSalary;
        public double Tax;

        public double netSalary(){
                return GrossSalary - Tax;
        }

        public double IncreaseSalary(double percentage){
                return  GrossSalary += (GrossSalary * percentage) / 100;
        }

        public String toString(){
                return name + ", $ " + netSalary();
        }
}