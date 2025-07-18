package Challenge.Entities;

import Challenge.Entities.HourContract;
import Challenge.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;
        for (HourContract c : contracts){
            int c_year = c.getDate().getYear();
            int c_month = c.getDate().getMonthValue();
            if (c_year == year && c_month == month){
                sum += c.totalValue();
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }
}
