package getter_setter;

public class Account {
    private double money;
    public int number;
    public String name;

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(double money, int number, String name) {
        this.money = money;
        this.name = name;
        this.number = number;
    }

    public double getMoney() {
        return money;
    }

    public void setMoneyDeposit(double money){
        this.money += money;
    }

    public void setMoneyWithdrawal(double money){
        this.money -= money + 5;
    }

    public String toString(){
        return String.format("Account " + number + ", Holder: " + name + ", Balance: $ %.2f", money);
    }
}
