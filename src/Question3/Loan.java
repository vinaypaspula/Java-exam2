/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Loan {

    private String bank_name;
    private String loan_type;
    private double principal;
    private int time;
    private double rate;

    public Loan(String bank_name, String loan_type, double principal, int time, double rate) {
        this.bank_name = bank_name;
        this.loan_type = loan_type;
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getLoan_type() {
        return loan_type;
    }

    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Loan:\n" + "Bank name: " + getBank_name() + "\nLoan type: " + getLoan_type()
                + "\nPrincipal: $" + getPrincipal() + "\nTime: " + getTime() + "\nRate: " + getRate();
    }

}
