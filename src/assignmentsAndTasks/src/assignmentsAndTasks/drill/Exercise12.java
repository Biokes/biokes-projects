package assignmentsAndTasks.src.assignmentsAndTasks.drill;

import java.io.FileWriter;

public class Exercise12 {
    public static void main(String[] args){
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\apps\\src\\apps_class\\main\\drill\\jlile";
        String content = "what i want to write";
        try(FileWriter reader = new FileWriter(fileLocation)){
            reader.write(content);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+ e.getMessage());
        }
    }
}