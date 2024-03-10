package inheritance;

import java.util.ArrayList;
import java.util.List;

public class BookNerd{

    private List<Book> booksRead = new ArrayList<>();


    public void readBook(Book<String> givenBook){
        this.booksRead.add(givenBook);
    }
    public String getBooksRead(){
        StringBuilder output = new StringBuilder();
        for( Book value : booksRead ){
            output.append(value.toString( ));
            output.append("\n");
        }
        return output.toString();
    }
    public static void main(String[] args){
        Book<String> book= new AudioBook("name","2001","me",12.6,
                12.56, "artist");
        Book<String> book2 = new PrintBook("name1", "2000", "me1", "antman", "9013-12");
        Book<String> book3 = new Book<>("nanme", "9002", "no one");
        BookNerd user = new BookNerd();
        user.readBook(book);
        user.readBook(book3);
        user.readBook(book2);
        System.out.println(user.getBooksRead( ));
    }
}
