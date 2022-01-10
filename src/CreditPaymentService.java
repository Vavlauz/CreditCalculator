public class CreditPaymentService {
    public double calculate(double total, int creditMonths) {
        double monthRate = 9.99 / (12 * 100);
        double amount = 1.00 + monthRate;
        double payMonth = total * (monthRate + (monthRate / ((Math.pow(amount, creditMonths)) - 1)));
        return payMonth;
    }
}

