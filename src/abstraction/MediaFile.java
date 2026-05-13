package abstraction;

public abstract class MediaFile {
    String title;
    double size;

    public MediaFile(String title, double size) {
        this.title = title;
        this.size = size;

    }

    abstract void play();

    void showInfo() {
        System.out.println("Now playing: " + title + " ," + size + "Mb");
    }
}
