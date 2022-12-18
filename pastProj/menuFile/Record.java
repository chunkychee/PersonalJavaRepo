package pastProj.menuFile;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Record {
    Scanner input = new Scanner(System.in);
    private long inputNum;
    private long employeeNumber;
    private String employeeFullName;

    String DOB;

    public void setEmployeeNumber() {
        long dummynum = 1010101010;
        String dummyNum = String.valueOf(dummynum);
        System.out.println("input 10-digit employee number");
        inputNum = input.nextLong();
        String numString = String.valueOf(inputNum);

        while ((numString.length() != dummyNum.length())) {
            System.out.println("invalid entry, input 10-digit employee number");
            inputNum = input.nextLong();
            numString = String.valueOf(inputNum);
        }
        employeeNumber = inputNum;
    }
    public void setEmployeeFullName(){
        System.out.println("input employee FullName");
        employeeFullName = input.next();

    }
    public void setEmployeeDOB(){
        int year;
        int month;
        int day;
        String yearString;
        String monthString;
        String dayString;
        System.out.println("input employee DOB in YYYY/MM/DD");
        year = input.nextInt();
        yearString = String.valueOf(year);
        month = input.nextInt();
        monthString = String.valueOf(month);
        day = input.nextInt();
        dayString = String.valueOf(day);
        DOB = (yearString + monthString + dayString);
    }

    public void setEmployeeSex(){
        System.out.println("input employee Gender");

    }
    public long getEmployeeNumber(){
        return employeeNumber;

    }
    public String getEmployeeFullName(){
        return employeeFullName;

    }
    public String getEmployeeDOB(){
        return DOB;
    }
    public void getEmployeeSex(){


    }

}
