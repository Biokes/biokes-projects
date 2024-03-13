package MentrualApp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MenstrualApp {
    private LocalDate nextFlowStart;
    private LocalDate lastFlowStop;



    public String getNextStart(String lastFlowEndDate, int cycleLength){
        try{
            lastFlowEndDate.replaceAll("[.,-=+!@#$%^&*()~`]", "/");
            LocalDate day= LocalDate.parse(lastFlowEndDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            nextFlowStart = day.plusDays(cycleLength);
            return nextFlowStart.toString( ).replaceAll("-","/");
        }catch(Exception error){
            throw new InvalidDateException(error.getMessage());
        }
    }

    public String getNextOvulationDate(){
        return null;
    }

    public void setLastFlowStop(String lastFlowStop){
        try{
            lastFlowStop.replaceAll("[.,-=+!@#$%^&*()~`]", "/");
            LocalDate day= LocalDate.parse(lastFlowStop, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
           this.lastFlowStop = day;
        }catch(Exception error){
            throw new InvalidDateException(error.getMessage());
        }
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
