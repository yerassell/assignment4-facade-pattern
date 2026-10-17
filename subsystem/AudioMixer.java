package subsystem;

public class AudioMixer {
    public String adjustVolume(String convertedData) {
        System.out.println("AudioMixer: Adjusting the volume of the audio");
        return convertedData + " (volume adjusted)";
    }
}
