package Challenge.Entities;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class HourContract {
    private Double valuePerHour;
    private Integer hours;
    private LocalDate date;

    public HourContract(Double valuePerHour, Integer hours, LocalDate date) {
        this.valuePerHour = valuePerHour;
        this.hours = hours;
        this.date = date;
    }

    public HourContract() {

    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }
}
