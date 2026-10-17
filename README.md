# assignment4-facade-pattern

##
- Name: Assel Yermekkyzy
- Group: SE-2524
- Topic: Option A - Media/File Conversion Facade
- Repository URL: https://github.com/yerassell/assignment4-facade-pattern.git
- Last commit: d3f72cf7a6f2f0920e0bc53a68b8b6f6a37c85c6


## Project purpose
This is an application that uses a MediaConversionFacade that wraps several subsystem classes behind one simple method such as convert(fileName, targetFormat) to convert a file.


## Package structure
- `subsystem/` - contains the subsystem classes (MetadataReader.java, CodecFactory.java, BitrateReader.java, AudioMixer.java)
- `Assignment4_SE-2524_Yermekkyzy_Assel.pdf` - is the report of the assignment
- `Client.java` - contains the Client
- `MediaConversionFacade.java` - contains the Facade
  
  
## Build and run instruction
- Run on Intellij IDEA
1. Click green button `Code` and click `Download ZIP`
2. Extract the ZIP 
3. Open in Intellij IDEA or another Java IDE.
4. Run Client.java
- Run on terminal
1. Click green button `Code` and click `Download ZIP`
2. Extract the ZIP to any folder on your device
3. Open a terminal
   ```bash
   cd path/to/extracted/folder
   javac *.java
   java Client.java
   ```

## Expected Output
passing to Client.java
``` bash
facade.convert("song.mp3", "wav");
```
outputs:
``` bash
MetadataReader: Reading song.mp3... Identified format is MP3
CodecFactory: Selects the MP3 decoder and the WAV encoder.
BitrateReader: Reading song.mp3 using the MP3 Decoder to decode file into raw audio samples
AudioMixer: Adjusting the volume of the audio
BitrateReader: Encoding the processed audio samples into WAV format using WAV Encoder
Output: File saved as song.wav

```
