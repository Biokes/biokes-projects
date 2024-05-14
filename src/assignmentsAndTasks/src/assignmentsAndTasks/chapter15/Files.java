package assignmentsAndTasks.src.assignmentsAndTasks.chapter15;

import java.io.FileReader;
import java.io.IOException;

public class Files {
    public static int countDigits(String location){
        int value =0;
        char[] chars = new char[2048];
        try(FileReader reader = new FileReader(location)) {
            reader.read(chars);
            for (char counter : chars)
                if(String.valueOf(counter).matches("\\d"))
                    value++;
            return value;
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static int countSentences(String location){
        int value =0;
        char[] chars = new char[2048];
        try(FileReader reader = new FileReader(location)) {
            reader.read(chars);
            for (char counter : chars) if(counter == '.') value++;
            return value;
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static int countParagraphs(String location){
        int value =0;
        try(FileReader reader = new FileReader(location)){
            char [] values = new char[2048];
            reader.read(values);
            String string = new String(values);
            string = string.replaceAll("\\n+", "n");
            String [] splittedValue= string.split("\\n");
            for(String splits : splittedValue)if(splits.isBlank())value++;
        }
        catch(IOException error){
            System.err.println(error.getMessage());
        }
        return value;
    }

}
