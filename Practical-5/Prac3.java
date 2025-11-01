public class Prac3 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.calculateInterest(10000, 5);
        bank.calculateInterest(10000, 5, 3);
    }
}
  
class Bank {
    void calculateInterest(double amount, double rate) {
        double interest = (amount * rate) / 100;
        System.out.println("Interest for one year: " + interest);
    }

    void calculateInterest(double amount, double rate, int years) {
        double interest = (amount * rate * years) / 100;
        System.out.println("Interest for " + years + " years: " + interest);
    }
}