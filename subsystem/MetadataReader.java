package subsystem;

public class MetadataReader {
    public String getFormat(String fileName) {
        String format =  fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println("MetadataReader: Reading " + fileName + "... Identified format is " + format.toUpperCase());
        return format;
    }
}
