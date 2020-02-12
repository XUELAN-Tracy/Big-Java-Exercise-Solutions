package chapter5.exercises;

/**
 * A program that can compute the pay needed to pay to employees.
 * @author LanXue
 * @date 2020-02-12 16:45
 */
public class PayCheck {

    double hours;
    double hourlyPay;

    public PayCheck(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double getPay() {
        double pay = 0;
        if (hours > 40) {
            pay = 40 * hourlyPay + (hours - 40) * 1.5 * hourlyPay;
        } else {
            pay = hours * hourlyPay;
        }
        return pay;
    }
}
