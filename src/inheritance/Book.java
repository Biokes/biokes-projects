package inheritance;

public class Book<T>{
    private final String name;
    private final String yearOfPublication;
    private final String author;
    public Book(String name, String yearOfPublication, String author){
        this.name = name;
        this.author= author;
        this.yearOfPublication = yearOfPublication;
    }
    public String toString(){
        return String.format("""
%s : %s
%s : %s
%s : %s""", "Book Name", this.name,"Year of Publication", this.yearOfPublication,"Authour", this.author);
    }
}
