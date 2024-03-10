package inheritance;

public class Book<T>{
    private String name;
    private String yearOfPublication;
    private String authour;
    public Book(String name, String yearOfPublication, String authour){
        this.name = name;
        this.authour= authour;
        this.yearOfPublication = yearOfPublication;
    }
    public String toString(){
        return String.format("""
%s : %s
%s : %s
%s : %s""", "Book Name", this.name,"Year of Publication", this.yearOfPublication,"Authour", this.authour);
    }
}
