package composition;

public class Main {
    public static void main(String[] args) {

        Library library = new Library("My family library", 3);

        Shelf shelf01 = new Shelf("Fantasy", 15);
        Shelf shelf02 = new Shelf("Novels", 12);

        Book book01 = new Book(001, "Dune", "Audrey Moss");
        Book book02 = new Book(002, "World", "Kate Jeffrey");

        shelf01.addBook(book01);
        shelf02.addBook(book02);

        library.addShelf(shelf01);
        library.addShelf(shelf02);

        System.out.println(library);

    }
}
