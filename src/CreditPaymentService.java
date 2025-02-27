public class CreditPaymentService {

    public int Calculate(int credit, double percent, int month) {



        double percentMonth = percent / month / 100;

        double k = 1 + percentMonth; //переменная (процент в месяц+1) для возведения в степень.
        double y = Math.pow(k, month); //вызов метода возведения в степень

        double coefficientAnnuity = (percentMonth * y) / (y - 1);
        double payment = credit * coefficientAnnuity;
        int myPayment = (int) payment;

        return myPayment;
    }

}
