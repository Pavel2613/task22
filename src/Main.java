public class Main {
    public static void main(String[] args) {

        int InitialBalance = 0; // начальный баланс
        int coming = 1100; // пополнение баланса
        int bonus; // кол-во бонусов
        if (coming > 1000){
            bonus = coming / 100;
        } else {
            bonus = 0;
        }
        int TotalAmount = InitialBalance + coming + bonus;

        System.out.println("Ваш баланс составляет: " + TotalAmount);
        System.out.println("Начислено бонусов: " + bonus);

    }
}