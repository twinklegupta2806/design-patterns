package design.patterns.structural.facade;

public class ExternalMPEG4CompressionCodec
{
    public ExternalCodec compressCode(ExternalCodec ec){
        return new ExternalCodec("destinationMPEG4CodecFor"+ec.type);
    }
}
