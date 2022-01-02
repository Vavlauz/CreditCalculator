public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double total = 1_000_000.00;
        int creditMonths = 12;
        int creditMonths2 = 24;
        int creditMonths3 = 36;
        double pay = service.calculate(total, creditMonths);
        double pay2 = service.calculate(total, creditMonths2);
        double pay3 = service.calculate(total, creditMonths3);
        System.out.println("Ваш платеж состовляет: " + pay + " рубль(ей)");
        System.out.println("Ваш платеж состовляет: " + pay2 + " рубль(ей)");
        System.out.println("Ваш платеж состовляет: " + pay3 + " рубль(ей)");
    }
}


