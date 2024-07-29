package design.patterns.structural.facade;

public class ExternalCodecFactory
{
    public ExternalCodec extract(ExternalVideoFile vf){
        return new ExternalCodec(vf.name);
    }
}
