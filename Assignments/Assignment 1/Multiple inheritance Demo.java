interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Smartphone takes photos");
    }

    public void playMusic() {
        System.out.println("Smartphone plays music");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();

        s.takePhoto();
        s.playMusic();
    }
}