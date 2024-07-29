package design.patterns.structural.facade;

public class ExternalOGGCompressionCodec
{
    public ExternalCodec compressCode(ExternalCodec ec){
        return new ExternalCodec("destinationOGGCodecFor"+ec.type);
    }
}
