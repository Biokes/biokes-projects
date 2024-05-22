package assignmentsAndTasks.src.assignmentsAndTasks.chapter15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class FilesPlays {
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
    public static double getAverageTransaction(String startDate,String endDate, String filePath){
        try{
           List<Transaction> transactionList = getTransactionsWithin(startDate,endDate,filePath);
           return transactionList.stream()
                   .flatMapToDouble(data-> DoubleStream.of(data.getAmount().doubleValue()))
                   .average().getAsDouble();
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
