public class Main {
    public static void main(String[] args) {
        long balance = 500_000_500;
        long transfer = 700_000_100;
        int bonus = 1;
        int rubles = 100;

        long amount = balance + transfer + transfer / rubles * bonus;
        System.out.println(amount);
    }
}
