import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double balance = 100.97;
        double replenishment_amount = 522.37;
        int bonus;
        if (replenishment_amount > 1000) {
            bonus = (int)replenishment_amount/100;
            System.out.println("Ваш бонус: "+bonus);
        } else System.out.println("Пополните баланс более чем на 1000 руб. и полуите от нас бонус 1 руб. за каждые 100 рублей!!!");
        balance = replenishment_amount+balance;
        /////////////////////////////////////////
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String New_balance = decimalFormat.format(balance);
        System.out.println("Ваш текущий баланс "+New_balance);
        //System.out.println("Ваш текущий баланс: "+balance);
    }
}
