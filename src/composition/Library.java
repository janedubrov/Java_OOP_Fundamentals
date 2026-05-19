package composition;

public class Library {
    private String name;
    private Shelf[] shelves;
    private int totalShelves;
    private int index;

    public Library(String name,int totalShelves) {
        this.name = name;
        this.totalShelves = totalShelves;
    }

    public void addShelf(Shelf shelf) {
        if(this.shelves == null) {
            this.shelves = new Shelf[totalShelves];

        }
        if(this.index < this.shelves.length) {
            this.shelves[index] = shelf;
            index++;
        } else {
            System.out.println("Library is full!");
        }
    }

    @Override
    public String toString() {
        String libraryString = "";
        libraryString += "==============\n";
        libraryString += "\tLibrary\n";
        libraryString += "==============";
        libraryString += "\nname = " + name;

        for(int i = 0; i < index; i++) {
            libraryString += this.shelves[i].toString();
        }

        return libraryString;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getTotalShelves() {
        return totalShelves;
    }

    public void setTotalShelves(int totalShelves) {
        this.totalShelves = totalShelves;
    }

}
