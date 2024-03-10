package inheritance;

public class Book<T>{
    private final T name;
    private final T yearOfPublication;
    private final T author;
    public Book(T name, T yearOfPublication, T author){
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
