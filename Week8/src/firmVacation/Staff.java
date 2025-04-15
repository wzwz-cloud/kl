package firmVacation;

public class Staff {
    private Employee[] staffList;

    public Staff() {
        staffList = new Employee[3];

        staffList[0] = new Executive("Carolye", "Kathmandu", "98456721", 100);
        ((Executive) staffList[0]).awardBonus(50);

        staffList[1] = new Hourly("Alina", "Kathmandu", "982727362", 20.25);
        ((Hourly) staffList[1]).addHours(400);

        staffList[2] = new Employee("Shyam", "Bharatpur", "982315783", 300);
    }

    public void payday() {
        for (Employee emp : staffList) {
            System.out.println(emp);
            System.out.println("Paid: $" + emp.pay());
            System.out.println("----------------------------------");
        }
    }

    public void showVacations() {
        for (Employee emp : staffList) {
            System.out.println(emp.getName() + " vacation: " + emp.vacation());
        }
    }
}
