package inheritance;

public class PrintBook extends Book<String>{
    private String publisher;
    public PrintBook(String name, String yearOfPublication, String author, String publisher){
        super(name, yearOfPublication, author);
        this.publisher = publisher;
    }
}