package inheritance;

public class PrintBook extends Book<String>{
    private String publisher;
    public PrintBook(String name, String yearOfPublication, String author){
        super(name, yearOfPublication, author);
    }
}
