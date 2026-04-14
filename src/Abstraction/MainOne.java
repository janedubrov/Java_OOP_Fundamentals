package Abstraction;

public class MainOne {
    public static void main(String[] args) {

        MediaFile[] playlist = new MediaFile[2];

        playlist[0] = new Video("love", 55, "1080");
        playlist[1] = new Audio("why" , 3, "Koka");

        for (MediaFile a : playlist) {
            a.showInfo();
            a.play();
            System.out.println("----");
        }


    }
}
