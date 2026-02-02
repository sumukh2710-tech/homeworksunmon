interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo using smartphone camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on smartphone");
    }
}

public class code50 {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        phone.takePhoto();
        phone.playMusic();
    }
}
