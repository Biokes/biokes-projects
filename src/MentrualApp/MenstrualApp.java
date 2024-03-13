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
            date();
            nextFlowStart = day.plusDays(getCycleLength());
            setOvulationDate();
            fertileDayStart = ovulationDate.minusDays(3);
            fertileDayEnd = ovulationDate.plusDays(3);
            return nextFlowStart.toString().replaceAll("-","/");
        }catch(Exception error){
            System.out.println(error.getMessage());
            throw new InvalidDateException(error.getMessage());
        }
    }
    public String getNextOvulationDate(){
        return ovulationDate.toString().replaceAll("-", "/");
    }
    private void setOvulationDate(){
        int addedValue = (cycleLength/2);
        ovulationDate = lastFlowStop.plusDays(addedValue);
    }

    public void setLastFlowStop(String lastFlowStop){
        try{
            lastFlowStop.replaceAll("[.,-=+!@#$%^&*()~`]", "/");
            this.lastFlowStop =LocalDate.parse(lastFlowStop, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
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
            getNextStart(date);
            length();
            System.out.println(this);
        }catch(InvalidDateException exception){
            System.out.println();
            date();
        }
    }
    public String toString(){
     return String.format("""
             According to the details provided::
             Next Flow Starts: %s
             Ovulation Date : %s
             Fetile Days is Expected to start on : %s.
             And End on : %s
             Disclaimer:: This is just an Assumption based on the provided Details.
             """, nextFlowStart,getNextOvulationDate(),fertileDayStart,fertileDayEnd);
    }
    public void appMain(){
        try{
            System.out.println("Enter your age :");
            int age=scanner.nextInt( );
            if( age>9 )
                date( );
            else{
                System.out.println("You cannot use this app for now pls because you are an underAge.");
            }
        }catch (Exception exception){
            scanner.next();
            System.out.println("invalid input");
            appMain();
        }

    }
    public void length(){
        try{
            System.out.println("Enter your cycle length: ");
            this.cycleLength =scanner.nextInt( );
        }catch(Exception exception){
            System.out.println(exception.getMessage( ));
            length();
        }
    }
    public String getNextFlowStart(){

        return nextFlowStart.toString().replaceAll("-","/");
    }

}
