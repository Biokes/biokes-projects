package assignmentsAndTasks.src.assignmentsAndTasks.chapter15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

import java.math.BigDecimal;

import static java.lang.System.out;

public class FilesPlays {
    public static void main(String[] args) throws IOException {
        out.println(getTransactions("C:\\Users\\DELL\\IdeaProjects" +
                "\\fireDrills\\src\\assignmentsAndTasks\\src\\assignmentsAndTasks\\drill\\value.js"));
    }
    public static BigDecimal getTransactions(String filePath) {
        BigDecimal total = new BigDecimal("0");
        try{
            ObjectMapper mapper = new ObjectMapper();
            Transaction[] transactions = mapper.readValue(filePath,Transaction[].class);
            for(Transaction transaction : transactions) total= total.add(transaction.getAmount());
            out.println("total = " + total);
        }catch(Exception error){
            System.err.println("Error : " + error.getMessage());
            throw new RuntimeException(error.getMessage());
        }
        return total;
    }
}
