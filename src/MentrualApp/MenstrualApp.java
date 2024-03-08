package MentrualApp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MenstrualApp {
    private LocalDate lastFlowStop;
    private LocalDate nextFlowStart;
    public boolean validateDate(String dateGiven) {
        try {
            LocalDate date = LocalDate.parse(dateGiven, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return date.isAfter(LocalDate.now());
        } catch (Exception error) {
            throw new InvalidDateException();
        }
    }
    private LocalDate convertDate(String day) {
        if (validateDate(day))
            return LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return null;
    }
    public String getNextStart(String lastDayEnded, int intervalsDate) {
        nextFlowStart = convertDate(lastDayEnded).plusDays(intervalsDate);
        nextFlowStart = nextFlowStart.plusDays(intervalsDate);
        return nextFlowStart.toString();
    }
    public void setLastFlowStop(String date) {
        lastFlowStop = convertDate(date);
    }

    public static void main(String[] args) {
        String name = "abbey";
        String name1 = new String("abbey");
        System.out.println(name == name1);
        String name3 = "abbey";
        System.out.println(name3 == name);
        name.replaceAll("a","r");
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("Hi, ABC, good".matches("ABC "));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",;", "#"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));
        String[] tokens = "A,B;C".split("[,=/-;+]");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + "+");
        int num = 555_550_000;
    }
}
