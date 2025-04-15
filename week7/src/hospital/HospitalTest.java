package hospital;

//Driver class
public class HospitalTest {
 public static void main(String[] args) {
     Doctor doc = new Doctor(1, "Dr. Carolye");
     Nurse nurse = new Nurse(2, "Alina");
     Receptionist receptionist = new Receptionist(3, "Shyam");
     Cleaner cleaner = new Cleaner(4, "Hari");

     doc.diagnose();
     nurse.assist();
     receptionist.answerCalls();
     cleaner.clean();
 }
}


