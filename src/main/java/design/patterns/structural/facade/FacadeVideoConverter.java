package design.patterns.structural.facade;

public class FacadeVideoConverter
{
    public Video convert(String fileName, String format){
        ExternalVideoFile vf = new ExternalVideoFile(fileName);
        ExternalCodec ec = new ExternalCodecFactory().extract(vf);
        ExternalCodec desEc;
        if(format.equals("mp4")){
            desEc = new ExternalMPEG4CompressionCodec().compressCode(ec);
        }
        else {
            desEc = new ExternalOGGCompressionCodec().compressCode(ec);
        }
        String br= new ExternalBitrateReader().read(desEc);
        String am = new ExternalAudioMixer().fix(br);
        return new Video(am);
    }
}
