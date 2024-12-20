package command.devices;

public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo is on!");
    }

    public void off() {
        System.out.println(location + " Stereo is off!");
    }

    public void setCD() {
        System.out.println(location + " Stereo is set for CD input!");
    }

    public void setDVD() {
        System.out.println(location + " Stereo is set for DVD input!");
    }

    public void setRadio() {
        System.out.println(location + " Stereo is set for Radio!");
    }

    public void setVolume(int volume) {
        System.out.println(location + " Stereo volume set to " + volume);
    }
}
