package assignmentsAndTasks.src.assignmentsAndTasks.assignmentsAndTasks;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;

import static assignmentsAndTasks.src.assignmentsAndTasks.assignmentsAndTasks.Gender.MALE;


public class JsonSerialization {
    public static String serialize(Person person){
        try{

            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(person);
        }catch(JsonProcessingException exception){
            System.err.println(exception.getMessage());
            throw new RuntimeException(exception);
        }
    }

    public static void main(String[] args) {
        System.out.println(serialize(new Person("name",
                LocalDate.of(2024,12,10),"09890293780",MALE)));
    }
}
