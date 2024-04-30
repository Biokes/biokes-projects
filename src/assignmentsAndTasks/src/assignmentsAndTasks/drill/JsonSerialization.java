package assignmentsAndTasks.src.assignmentsAndTasks.drill;


public class JsonSerialization {
    public static String serialize(Person person){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.vwriteValueAsString();
            return json;
        }catch(JsonProcessingException exception){
            System.err.println(exception.getMessage());
            throw new RuntimeException(exception);
        }
    }
}
