public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // начальный баланс
        int coming = 1100; // пополнение баланса
        int bonus = coming > 1000 ? coming / 100 : 0;

    int totalAmount = initialBalance + coming + bonus;

        System.out.println("Ваш баланс составляет: "+totalAmount);
        System.out.println("Начислено бонусов: "+bonus);

}
}