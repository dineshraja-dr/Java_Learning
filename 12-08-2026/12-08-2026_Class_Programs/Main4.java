// First interface
interface Camera {

    void takePhoto();
}

// Second interface
interface MusicPlayer {

    void playMusic();
}

// Class implementing multiple interfaces
class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Smartphone takes a photo.");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone plays music.");
    }

    // Smartphone's own method
    public void makeCall() {
        System.out.println("Smartphone makes a call.");
    }
}

// Main class
public class Main4 {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.playMusic();
        phone.makeCall();
    }
}