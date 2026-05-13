package abstraction;

public class Video extends MediaFile {
    String resolution;

    public Video(String title, double size, String resolution ) {
        super(title, size);
        this.resolution = resolution;
    }

    @Override
    void play() {
        System.out.println("Playing video " + title + " in " + resolution + "p" );
    }
}
