import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.util.Scanner;
public class Helpers {

    public static void testData(Scanner scanner){
        Kitten k1 = new Kitten();
        Kitten k2 = new Kitten("Snickers", "Girl", "2021-04-22", 5, true);
        System.out.print(k1);
        System.out.println(k2);
        UIUtility.pressEntertoContinue(scanner);
    }

    public static LocalDate convertStrToDate(String date){
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate userDate; 
        try{
            userDate = LocalDate.parse(date, formatterInput);
        } catch(DateTimeException e){
            userDate = LocalDate.now();
        }
        return userDate;
    }
}
