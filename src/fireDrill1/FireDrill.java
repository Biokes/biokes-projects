package fireDrill1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FireDrill{
    public static int getAge2(String day){
            if(LocalDate.now().getDayOfYear() -LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getDayOfYear()>= 0)
               return LocalDate.now().getYear() - LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
            return LocalDate.now().getYear() - LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear()-1;
    }

    public static int[] getDifference(int[] given){
        int min=given[0];
        int max=given[0];
        for( int number : given ){
            if( number<min ) min=number;
            if( number>max ) max=number;
        }
        return new int[]{max-min};
    }


}
