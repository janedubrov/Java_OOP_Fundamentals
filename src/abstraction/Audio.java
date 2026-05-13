package abstraction;

public class Audio extends MediaFile{
    String artist;

    public Audio(String title, double size, String artist) {
        super(title, size);
        this.artist = artist;
    }

    @Override
    void play() {
        System.out.println("Playing song " + title + " by artist: " + artist);
    }
}
