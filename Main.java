import subsystem.*;

public class Main {
    public static void main(String[] args) {
        MetadataReader meta = new MetadataReader();
        CodecFactory codec = new CodecFactory();
        BitrateReader bitrate = new BitrateReader();
        AudioMixer mixer = new AudioMixer();

        MediaConversionFacade facade = new MediaConversionFacade(meta, codec, bitrate, mixer);

        facade.convert("song.mp3", "wav");
        facade.convert("interview.wav", "mp3");
    }
}
