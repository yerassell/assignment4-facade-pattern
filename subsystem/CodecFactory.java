package subsystem;

public class CodecFactory {
    public String createDecoder(String format) {
        System.out.print("CodecFactory: Selects the " + format.toUpperCase() + " decoder");
        if (format.equalsIgnoreCase("mp3")) {
            return "MP3 Decoder";
        } else if (format.equalsIgnoreCase("wav")) {
            return "WAV Decoder";
        }
        return "Unknown Decoder";
    }

    public String createEncoder(String targetFormat) {
        System.out.println(" and the " + targetFormat.toUpperCase() + " encoder.");
        if (targetFormat.equalsIgnoreCase("mp3")) {
            return "MP3 Encoder";
        } else if (targetFormat.equalsIgnoreCase("wav")) {
            return "WAV Encoder";
        }
        return "Unknown Encoder";
    }
}
