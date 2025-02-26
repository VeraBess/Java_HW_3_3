public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
int credit = 1_000_000;
double percent = 9.99;
int month = 12;

int myPayment = service.Calculate(credit, percent, month);

System.out.println(myPayment);

    }
}