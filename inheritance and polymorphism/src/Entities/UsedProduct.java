package Entities;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufacturedDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(Date manufacturedDate) {
        super();
        this.manufacturedDate = manufacturedDate;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag(){
        return getName() + "(used) $" + String.format("%.2f", getPrice()) + "(Manufacture date: " + manufacturedDate + ")";
    }
}
