package MentrualApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualApp {
    private LocalDate nextFlowStart;
    private LocalDate lastFlowStop;
    private int cycleLength;
    private LocalDate ovulationDate;
    private LocalDate fertileDayStart;
    private LocalDate fertileDateEnd;



    public String getNextStart(String lastFlowEndDate, int cycleLength){
        try{
            this.cycleLength = cycleLength;
            lastFlowEndDate.replaceAll("[.,-=+!@#$%^&*()~`]", "/");
            LocalDate day= LocalDate.parse(lastFlowEndDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            nextFlowStart = day.plusDays(cycleLength);
            ovulationDate = lastFlowStop.minusDays((cycleLength/2));
            fertileDayStart = ovulationDate.plusDays(-3);
            fertileDayStart = ovulationDate.plusDays(3);
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
           setOvulationDate();
        }catch(Exception error){
            throw new InvalidDateException(error.getMessage());
        }
    }

}
