package assignmentsAndTasks.src.assignmentsAndTasks.drill;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Excercise3 {
    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\IdeaProjects\\apps\\src\\apps_class\\main\\drill";
        Path path = Paths.get(location);
        try(BufferedWriter writer= Files.newBufferedWriter(path)){
            writer.write("Happy Married Life, Asakebey");
        }catch(IOException error){
            error.printStackTrace();
            System.err.println(error);
        }

    }
}
