package Ativ3;

public class Product {
    public double first;
    public double second;
    public double third;

    public double FinalGrade(){
        return first + second + third;
    }

    public double missing(){
        return 60.00 - FinalGrade();
    }

    public String toString(){
        if(FinalGrade() >= 60){
            return "FINAL GRADE = " + String.format("%.2f", FinalGrade()) +  "\nPASS";
        } else {
            return "FINAL GRADE = " + String.format("%.2f", FinalGrade()) + "\nFAILED" + "\nMISSING " + String.format("%.2f", missing()) + " POINTS";
        }
    }
}
