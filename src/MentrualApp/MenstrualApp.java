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
    private int cycleLength;
    private LocalDate ovulationDate;


    public String getNextStart(String lastFlowEndDate, int cycleLength){
        try{
            this.cycleLength = cycleLength;
            lastFlowEndDate.replaceAll("[.,-=+!@#$%^&*()~`]", "/");
            LocalDate day= LocalDate.parse(lastFlowEndDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            nextFlowStart = day.plusDays(cycleLength);
            return nextFlowStart.toString( ).replaceAll("-","/");
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
        }catch(Exception error){
            throw new InvalidDateException(error.getMessage());
        }
    }

}
