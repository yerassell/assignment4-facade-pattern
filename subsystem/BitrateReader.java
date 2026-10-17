package subsystem;

public class BitrateReader {
    public String read(String fileName, String decoderName) {
        System.out.println("BitrateReader: Reading " + fileName + " using the " + decoderName + " to decode file into raw audio samples");
        return "Raw audio samples from " + fileName;
    }

    public String encode(String rawData, String targetFormat, String encoderName) {
        System.out.println("BitrateReader: Encoding the processed audio samples into " + targetFormat.toUpperCase() + " format using " + encoderName);
        return "Encoded data";
    }

}
