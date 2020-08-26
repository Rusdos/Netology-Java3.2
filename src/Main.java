import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double balance = 100.97;
        double replenishmentAmount = 522.37;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = (int)replenishmentAmount/100;
            System.out.println("Ваш бонус: "+bonus);
        } else System.out.println("Пополните баланс более чем на 1000 руб. и полуите от нас бонус 1 руб. за каждые 100 рублей!!!");
        balance = replenishmentAmount+balance;

    }
}
