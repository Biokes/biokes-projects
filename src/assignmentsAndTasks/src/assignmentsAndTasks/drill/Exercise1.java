package assignmentsAndTasks.src.assignmentsAndTasks.drill;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args){
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\apps\\src\\apps_class\\main\\drill\\jlile";
        char [] fileCharacters = new char[500];
        try(FileReader reader = new FileReader(fileLocation)){
            reader.read(fileCharacters);//read specified length of the array passed as arguement
            for(char value: fileCharacters){
                System.out.print(value);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+ e.getMessage());
        }
    }
}
