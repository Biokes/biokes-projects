package inheritance;

public class BookUsageClass{
    public static void main(String[] args){
        Book book = new AudioBook("name","2001","me",12.6,
                12.56, "artist");
        Book book2 = new PrintBook("name1", "2000", "me1", "antman", "9013-12");
        Book book3 = new Book("nanme", "9002", "no one");
        System.out.println(book2);
        System.out.println(book);
        System.out.println(book3);
    }
}
