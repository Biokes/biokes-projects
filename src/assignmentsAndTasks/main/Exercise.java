package assignmentsAndTasks.main;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static String reverseSentence(String given){
        String[] output = given.split(" ");
        StringBuilder builder =  new StringBuilder();
        for (int counter = output.length-1; counter >= 0 ; counter++){
            builder.append(output[counter]);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\apps\\src\\apps_class\\main\\drill\\jlile";
        try(FileInputStream inputStream = new FileInputStream(fileLocation);//trying with resources
            DataInputStream dateInputStream = new DataInputStream(inputStream);//read from the current location through the input stream.
            FileOutputStream outputStream = new FileOutputStream(fileLocation, true);//write to the file from this output stream.
            // boolean to append (false by default)
            ){
            byte[] bytes = dateInputStream.readAllBytes();// read all the bytes into a byte array
            System.out.println(new String(bytes));
            String whatIwatnToWrite = "\nwhatever";
            outputStream.write(whatIwatnToWrite.getBytes());//write to thefile by appending

        }catch(IOException error){
            error.printStackTrace();
            System.err.println("Error : "+ error);
        }
    }
}
