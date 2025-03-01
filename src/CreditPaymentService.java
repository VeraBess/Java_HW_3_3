public class CreditPaymentService {

    public double Calculate(double credit, double percent, double month) {

      double percentMonth = percent / 12 / 100; // расчет процента в месяц
      double k = 1 + percentMonth; //переменная (процент в месяц+1) для возведения в степень.
      double y = Math.pow(k, month); //вызов метода возведения в степень
      double coefficientAnnuity = (percentMonth * y) / (y - 1); //вычисление коэффицента аннуитета

      //  double coefficientAnnuity = (percentMonth * (Math.pow(1 + percentMonth, month))) /
      //   (Math.pow(1 + percentMonth, month) - 1); // та же формула что и выше

      double payment = credit * coefficientAnnuity; // вычисление ежемесячного платежа

    return payment;
    }
}
