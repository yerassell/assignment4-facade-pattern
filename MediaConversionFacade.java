import subsystem.*;

public class MediaConversionFacade {

    private MetadataReader metadataReader;
    private CodecFactory codecFactory;
    private BitrateReader bitrateReader;
    private AudioMixer audioMixer;

    public MediaConversionFacade(MetadataReader metadataReader, CodecFactory codecFactory, BitrateReader bitrateReader, AudioMixer audioMixer) {
        this.metadataReader = metadataReader;
        this.codecFactory = codecFactory;
        this.bitrateReader = bitrateReader;
        this.audioMixer = audioMixer;
    }

    public void convert(String fileName, String targetFormat) {

        String sourceFormat = metadataReader.getFormat(fileName);

        String decoderName = codecFactory.createDecoder(sourceFormat);
        String encoderName = codecFactory.createEncoder(targetFormat);

        String rawData = bitrateReader.read(fileName, decoderName);

        String processedData = audioMixer.adjustVolume(rawData);

        bitrateReader.encode(processedData, targetFormat, encoderName);

        String baseName = fileName.substring(0, fileName.lastIndexOf("."));
        String newFileName = baseName + "." + targetFormat;

        System.out.println("Output: File saved as " + newFileName + "\n");
    }
}
