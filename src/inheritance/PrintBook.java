package inheritance;

public class PrintBook extends Book<String>{
    private final String publisher;
    private final String ISBN;
    public PrintBook(String name, String yearOfPublication, String author, String publisher,String ISBN){
        super(name, yearOfPublication, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }
}
