package design.patterns.structural.facade;

public class ExternalBitrateReader
{
    public String read(ExternalCodec ec){
        return ec.type+ "readSuccessfully";
    }
}
