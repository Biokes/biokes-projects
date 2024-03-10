package inheritance;

public class AudioBook extends Book{
    private final double size;
    private final double length;
    private final String artistName;
    public AudioBook(String name, String yearOfPublication, String author, double size,double length,
                     String artistName ){
        super(name, yearOfPublication, author);
        this.size = size;
        this.length = length;
        this.artistName = artistName;
    }
}
