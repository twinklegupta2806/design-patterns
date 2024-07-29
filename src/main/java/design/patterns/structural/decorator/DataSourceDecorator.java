package design.patterns.structural.decorator;

public class DataSourceDecorator implements DataSource
{
    protected DataSource wrapee;

    public DataSourceDecorator(DataSource ds){
        this.wrapee = ds;
    }
    @Override
    public void writeData(String data)
    {
        wrapee.writeData(data);
    }

    @Override
    public String readData()
    {
        return wrapee.readData();
    }
}
