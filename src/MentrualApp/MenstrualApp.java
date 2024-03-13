package MentrualApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualApp {
    private LocalDate nextFlowStart;
    private LocalDate lastFlowStop;
    private int cycleLength;
    private LocalDate ovulationDate;
    private LocalDate fertileDayStart;
    private LocalDate fertileDayEnd;

    public String getFertileDayStart(){
        return fertileDayStart.toString( ).replaceAll("-","/");
    }
    public String getFertileDayEnd(){
        return fertileDayEnd.toString( ).replaceAll("-","/");
    }
public void setCycleLength(int days){
        if(days < 1)
            throw new IllegalArgumentException("Invalid cycle length");
    this.cycleLength = days;
}
private int getCycleLength(){
        return cycleLength;
}
    public String getNextStart(String lastFlowEndDate){
        try{
            lastFlowEndDate.replaceAll("[.,-=+!@#$%^&*()~`]", "/");
            LocalDate day= LocalDate.parse(lastFlowEndDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            nextFlowStart = day.plusDays(getCycleLength());
            setOvulationDate();
            fertileDayStart = ovulationDate.minusDays(3);
            fertileDayEnd = ovulationDate.plusDays(3);
            return nextFlowStart.toString().replaceAll("-","/");
        }catch(Exception error){
            throw new InvalidDateException(error.getMessage());
        }
    }


    public String getNextOvulationDate(){
        return ovulationDate.toString().replaceAll("-", "/");
    }
    private void setOvulationDate(){
        ovulationDate = lastFlowStop.plusDays((cycleLength/2));
    }

    public void setLastFlowStop(String lastFlowStop){
        try{
            lastFlowStop.replaceAll("[.,-=+!@#$%^&*()~`]", "/");
            LocalDate day= LocalDate.parse(lastFlowStop, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
           this.lastFlowStop = day;
           setOvulationDate();
        }catch(Exception error){
            throw new InvalidDateException(error.getMessage());
        }

    }
    private final Scanner scanner = new Scanner(System.in);
    public void date(){
        try{
            System.out.println("Enter your Last Menstruation End Date(dd/mm/yyyy): ");
            String date=scanner.next( );
            setLastFlowStop(date);
        }catch(InvalidDateException exception){
            System.out.println();
            date();
        }
    }
    public String toString(){
     return String.format("""
             According to the details provided::
             Next Flow Starts: %s
             Next Flow Ends : %s
             Ovulation Date : %s
             
             
             """);
    }
    public void appMain(){
        date();
    }


}
