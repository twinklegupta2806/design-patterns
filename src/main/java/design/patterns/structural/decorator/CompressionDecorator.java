package design.patterns.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator
{
    public CompressionDecorator(DataSource ds)
    {
        super(ds);
    }

    @Override
    public void writeData(String data)
    {
        System.out.println("recived data in compression = "+ data);
        data = "Compressed "+ data;
        super.writeData(data);
    }

    @Override
    public String readData()
    {
        return super.readData() + "expanded totally";
    }
}
