package inheritance;

public class Iphone extends Smartphone {

    public Iphone(String brand, String model, String os){
        super(brand, model, os);

    }
    void faceId(){
        System.out.println("Your face is being scanned by " + brand + " " + model);
    }
}
