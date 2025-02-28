public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
double credit = 1_000_000;
double percent = 9.99;
double month;

int myPayment = (int) service.Calculate(credit, percent, 12);
System.out.println("Ежемесячный платеж: " + myPayment);

int myPayment1 = (int) service.Calculate(credit, percent, 24);
System.out.println("Ежемесячный платеж: " + myPayment1);

int myPayment2 = (int) service.Calculate(credit, percent, 36);
System.out.println("Ежемесячный платеж: " + myPayment2);

    }
}