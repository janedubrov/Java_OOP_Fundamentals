package composition.library;

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        String bookString = " ";

        bookString += "\n---------------\n";
        bookString += "\tBook\n";
        bookString += "---------------\n";
        bookString += "id = " + id;
        bookString += "\ntitle  = " + title;
        bookString += "\nauthor  = " + author;
        bookString += "\n---------------";
//        bookString += " ";
//        bookString += "\n==============";

        return bookString;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
