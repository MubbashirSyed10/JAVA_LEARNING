package ClassLearnings.Interfaces.multipleinheritance;

public class SmartPhone implements Camera,MusicPlayer,Phone{
    @Override
    public void playMusic() {

    }

    @Override
    public void stopMusic() {

    } // This is how we acheive multiple inheritance


    @Override
    public void makeCall(String number) {

    }

    @Override
    public void endCall() {

    }

    @Override
    public void takePhoto() {

    }

    @Override
    public void recordVideo() {

    }
}
