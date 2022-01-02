public class CreditPaymentService {
    public double calculate(double total, int creditMonths) {
        double monthRate = 9.99 / creditMonths / 100;
        if (creditMonths == 12) {
            monthRate = 9.99 / creditMonths / 100;
        }
        if (creditMonths == 24) {
            monthRate = (9.99 / creditMonths / 100) * 2;
        }
        if (creditMonths == 36) {
            monthRate = (9.99 / creditMonths / 100) * 3;
        }
        double amount = 1.00 + monthRate;
        double payMonth = total * (monthRate + (monthRate / ((Math.pow(amount, creditMonths)) - 1)));
        return payMonth;
    }
}

