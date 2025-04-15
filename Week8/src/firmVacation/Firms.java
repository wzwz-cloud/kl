package firmVacation;


public class Firms {
    public static void main(String[] args) {
        Staff personnel = new Staff();
        personnel.payday();
        System.out.println("\n--- Vacation Info ---");
        personnel.showVacations();
    }
}
