public class CreditPaymentService {

    public double Calculate(double credit, double percent, double month) {



        double percentMonth = percent / month / 100; // расчет процента в месяц

        double k = 1 + percentMonth; //переменная (процент в месяц+1) для возведения в степень.
        double y = Math.pow(k, month); //вызов метода возведения в степень
        double coefficientAnnuity = (percentMonth * y) / (y - 1); //вычисление коэффицента аннуитета

       // double coefficientAnnuity = (percentMonth * (Math.pow(1 + percentMonth, month))) / (Math.pow(1 + percentMonth, month) - 1); // та же формула что и выше
        double payment = credit * coefficientAnnuity; // вычисление ежемесячног платежа

        //double x = Math.pow((1 + percent / 12), month);
        //double payment = credit * (percent / 12 * (x / (x - 1))); // другая формула, получается еще хуже, вообще аномальные цифры

        // int myPayment = (int) payment;

        return payment;
    }

}
