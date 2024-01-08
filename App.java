import java.time.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth date:  ");
        String birthdate = scan.nextLine();
        
        LocalDate myLocalDate;
        myLocalDate = LocalDate.parse(birthdate);    
        
        System.out.println("Age is : "+calcAge(myLocalDate));
    }
    
    static int calcAge(LocalDate myLocalDate)
    {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(myLocalDate,currentDate).getYears();
        return age;
    }
}