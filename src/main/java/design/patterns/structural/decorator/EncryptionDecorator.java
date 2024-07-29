package design.patterns.structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator
{

    public EncryptionDecorator(DataSource ds)
    {
        super(ds);
    }
    @Override
    public void writeData(String data)
    {
        System.out.println("recieved data in encryption "+ data);
        data = "Encrypted "+ data;
        super.writeData(data);
    }

    @Override
    public String readData()
    {
        return super.readData() + "decrypted totally";
    }
}
