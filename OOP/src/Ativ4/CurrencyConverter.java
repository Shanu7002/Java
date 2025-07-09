package Ativ4;

public class CurrencyConverter {

    public static double cotacao(double dollarPrice, double dollarAmmount) {
        return dollarPrice * dollarAmmount;
    }
    public static double reaisIOF(double cotacao){
        return (cotacao * 6 / 100) + cotacao;
    }
}
