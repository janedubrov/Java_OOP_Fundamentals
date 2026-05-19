package composition.library;

public class Shelf {
    private String name;
    private Book[] books;
    private int capacity;
    private int index = 0;

    public Shelf(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        if(this.books == null) {
            this.books = new Book[this.capacity];
        }
        if (this.index < this.books.length) {
            this.books[index] = book;
            index++;

        } else {
            System.out.println("There is no free space on this shelf");
        }
    }

    @Override
    public String toString() {
        String shelfString = " ";
        shelfString += "\n==============\n";
        shelfString += "\tShelf\n";
        shelfString += "==============";
        shelfString += "\nname = " + name;
        shelfString += "\ncapacity = " + capacity;
//        shelfString += " ";

        for (int i = 0 ; i < index; i++) {
            shelfString += this.books[i].toString();
        }

        return shelfString;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
