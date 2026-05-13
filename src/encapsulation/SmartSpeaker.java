package encapsulation;

public class SmartSpeaker {
    private String brand;
    private int volume = 10;
    private boolean isOn = false;

    public SmartSpeaker(String brand){
        this.brand = brand;
    }

    String getBrand(){
        return this.brand;
    }

    int getVolume(){
        return this.volume;
    }

    boolean getIsOn(){
        return this.isOn;
    }

    void powerSwitch() {
        if(isOn){
            this.isOn = false;
            System.out.println("The device is now OFF");

        } else {
            this.isOn = true;
            System.out.println("The device is ON");
        }
    }

    void increaseVolume(){
        if(isOn){
            this.volume = volume++;
            System.out.println("The volume Level is: " + this.volume);
        }
        if(volume == 100){
            this.volume = volume;
            System.out.println("Max volume is: " + this.volume);
        }
    }

    void decreaseVolume(int volume){
        if(isOn){
            this.volume = volume--;
            System.out.println("The volume level is: " + this.volume);
        }
        if(volume == 0){
            System.out.println("This is the minimal volume level");

        }
    }

    void setVolume(int newVolume) {
        if (newVolume > 0 && newVolume <= 100) {
            this.volume = newVolume;
            System.out.println("The volume level is:" + this.volume);
        }
        else{
            System.out.println("Error, The min Level is 0 and max Level is 100");
        }
    }


}
