public class Main {
    public static void main(String[] args) {

        if (Login.authenticate()) {
            BillingSystem.main(args);   // Run Billing System after login
        } else {
            System.out.println("Access Denied!");
        }
    }
}
