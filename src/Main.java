public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double pay = service.calculate(1_000_000.00, 12);
        double pay2 = service.calculate(1_000_000.00, 24);
        double pay3 = service.calculate(1_000_000.00, 36);
        System.out.println("Ваш платеж состовляет: " + pay + " рубль(ей)");
        System.out.println("Ваш платеж состовляет: " + pay2 + " рубль(ей)");
        System.out.println("Ваш платеж состовляет: " + pay3 + " рубль(ей)");
    }
}


