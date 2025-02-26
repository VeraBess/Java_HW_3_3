public class CreditPaymentService {

    public int Calculate(int credit, double percent, int month) {

        double percentMonth = percent / month / 100;
        double coefficientAnnuity = (percentMonth * (1 + percentMonth) "здесь надо возмести в степень month") / ((1 + percentMonth) "здесь надо возвести в степень month" - 1);
        double payment = credit * coefficientAnnuity;
        int myPayment = (int) payment;

        return myPayment;
    }

}
