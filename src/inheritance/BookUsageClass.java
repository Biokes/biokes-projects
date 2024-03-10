package inheritance;

public class BookUsageClass{
    public static void main(String[] args){
        Book<String> book= new AudioBook("name","2001","me",12.6,
                12.56, "artist");
        Book<String> book2 = new PrintBook("name1", "2000", "me1", "antman", "9013-12");
        Book<String> book3 = new Book<>("nanme", "9002", "no one");
        System.out.println(book2);
        System.out.println(book);
        System.out.println(book3);
    }
}
