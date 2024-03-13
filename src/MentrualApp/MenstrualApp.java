package MentrualApp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MenstrualApp {
    public void setLastFlowStop(String number2){

    }

    public String getNextStart(String lastFlowEndDate, int cycleLength){
        lastFlowEndDate.replaceAll("[.,-=+!@#$%^&*()~`]", "/");
        LocalDate day = LocalDate.parse(lastFlowEndDate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
       return day.plusDays(cycleLength).toString();
    }

//    private LocalDate lastFlowStop = LocalDate.now();
//    private LocalDate nextFlowStart = LocalDate.now();
//

//    public static void main(String[] args) {
//        String name = "abbey";
//        String name1 = new String("abbey");
//        System.out.println(name == name1);
//        String name3 = "abbey";
//        System.out.println(name3 == name);
//        name.replaceAll("a","r");
//        System.out.println("\n\n\n\n\n\n\n\n\n");
//        System.out.println("Hi, ABC, good".matches("ABC "));
//        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
//        System.out.println("A,B;C".replaceAll(",;", "#"));
//        System.out.println("A,B;C".replaceAll("[,;]", "#"));
//        String[] tokens = "A,B;C".split("[,=/-;+]");
//        for (int i = 0; i < tokens.length; i++)
//            System.out.print(tokens[i] + "+");
//        int num = 555_550_000;
//    }
}
