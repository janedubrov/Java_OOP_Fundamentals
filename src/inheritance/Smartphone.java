package inheritance;

public class Smartphone extends Phone {
    String os;

    public Smartphone(String brand, String model, String os){
        super(brand,model);
        this.os = os;
    }

    void browseInternet(){
        System.out.println("You are browsing now using " + brand + " " + model);
    }
}
