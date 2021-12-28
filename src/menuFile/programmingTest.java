package menuFile;
import java.util.Scanner;
public class programmingTest {

    public static void main(String[] args) {
        int option;
        Scanner input = new Scanner(System.in);
        Record recording = new Record();
        do {
            System.out.println("""
                    1. Add a record
                    2. Edit a record
                    3. Delete a record
                    4. List records
                    5. Quit
                    """);
            option = input.nextInt();
        while ((option != 1) && (option!= 2) && (option != 3) && (option != 4) && (option != 5));
        switch (option) {
            case 1:
                recording.setEmployeeNumber();
                recording.setEmployeeFullName();
                recording.setEmployeeDOB();
                System.out.println(recording.getEmployeeDOB());
                System.out.println(recording.getEmployeeFullName());
                System.out.println(recording.getEmployeeNumber());
                break;

            case 2:
                System.out.println("e");
                break;

            case 3:
                System.out.println("r");
                break;

            case 4:
                System.out.println("t");
                break;
        }

        }while(option != 5);
        System.out.println("program exited");

    }
}
