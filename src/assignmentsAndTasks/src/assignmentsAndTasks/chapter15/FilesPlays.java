package assignmentsAndTasks.src.assignmentsAndTasks.chapter15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FilesPlays {
//    public static void main(String[] args) throws IOException {
//        out.println(getTransactions("C:\\Users\\DELL\\IdeaProjects" +
//                "\\fireDrills\\src\\assignmentsAndTasks\\src\\assignmentsAndTasks\\drill\\value.js"));
//    }
//    public static BigDecimal getTransactions(String filePath) {
//        BigDecimal total = BigDecimal.ZERO;
//        try{
//            FileReader reader = new FileReader(new File(filePath));
//            ObjectMapper mapper = new ObjectMapper();
//            Transaction[] transactions = mapper.readValue(reader,Transaction[].class);
//            for(Transaction transaction : transactions) total= total.add(transaction.getAmount());
//        }catch(Exception error){
//            System.err.println("Error : " + error.getMessage());
//            throw new RuntimeException(error.getMessage());
//        }
//        return total;
//    }
    public static List<Transaction> getAllTransactionsOn(String date, String filePath){
        try(FileReader reader = new FileReader(filePath)){
            ObjectMapper mapper = new ObjectMapper();
            Transaction[] transactions = mapper.readValue(reader,Transaction[].class);
            LocalDate realDate = LocalDate.parse(date);
            return Arrays.stream(transactions)
                    .filter(transaction -> (transaction.getDate().isEqual(realDate)))
                    .toList();
        }
        catch(Exception exception){
            throw new RuntimeException(exception.getMessage());
        }
    }
    public static List<Transaction> getTransactionsWithin(String startDate, String endDate, String filePath) throws IOException {
        LocalDate date1 = parseDate(startDate);
        LocalDate date2 = parseDate(endDate);
        List<Transaction> transactions = List.of(new ObjectMapper()
                .readValue(new FileReader(filePath), Transaction[].class));
        return transactions.stream()
                .filter(data->!data.getDate()
                        .isBefore(date1)&& !data.getDate().isAfter(date2)).toList();
    }
    public static BigDecimal getAverageTransaction(String date, String filePath){
        try(FileReader reader = new FileReader(new File(filePath))){
           List<Transaction> transactions = Arrays.stream(new ObjectMapper().readValue(reader, Transaction[].class))
                    .filter(transaction -> transaction.getDate().isEqual(parseDate(date))).toList();
           BigDecimal output = BigDecimal.ZERO;
           for(Transaction records : transactions) {
               if (records.getType().equals("CREDIT")) output = output.add(records.getAmount());
               else output = output.subtract(records.getAmount());
           }
           return output.divide(BigDecimal.valueOf(transactions.size()), 2);
        }
        catch(Exception error){
            throw new RuntimeException(error.getMessage());
        }

    }
    private static LocalDate parseDate(String date){
        return LocalDate.parse(date);
    }
    private static List<Transaction> getAllTransaction(String filePath){
        try(FileReader reader = new FileReader(new File(filePath))){
            ObjectMapper mapper = new ObjectMapper();
            return  Arrays.stream(mapper.readValue(reader,Transaction[].class)).toList();
        }catch(Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }

}
