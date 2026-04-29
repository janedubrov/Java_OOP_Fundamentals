package Encapsulation;

public class Constr_SmartSpeaker {
    public static void main(String[] args) {
        SmartSpeaker smartSpeaker = new SmartSpeaker("Marshall");
        smartSpeaker.increaseVolume();
        smartSpeaker.powerSwitch();
        smartSpeaker.setVolume(35);
        smartSpeaker.setVolume(150);
        System.out.println("The brand is " + smartSpeaker.getBrand() + ", " + "Volume: " + smartSpeaker.getVolume() + "is playing " + smartSpeaker.getIsOn());


    }
}
