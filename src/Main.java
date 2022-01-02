public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double total = 1_000_000.00;
        int creditMonths = 12;
        double pay = service.calculate(total, creditMonths);
        System.out.println("Ваш платеж состовляет: " + pay + " рубль(ей)");
    }
}


