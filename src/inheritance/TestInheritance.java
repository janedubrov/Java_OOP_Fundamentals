package inheritance;

public class TestInheritance {
    public static void main(String[] args) {

        Smartphone myPhone = new Smartphone("Samsung", "15S", "Android");
        myPhone.makeCall("888888888");
        myPhone.browseInternet();

        Iphone myIphone = new Iphone("Iphone", "17 Pro max", "Ios");
        myIphone.faceId();
    }
}

