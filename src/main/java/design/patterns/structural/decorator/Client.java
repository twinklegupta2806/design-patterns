package design.patterns.structural.decorator;

public class Client
{
    public static void main(String[] args) {
        DataSource ds = new FileDataSource("Switch its high time"); // Creates an extended version of Data Source named as FileDataSource
        ds = new EncryptionDecorator(ds); // Creates a new EncryptionDecorator object who has wrapee named as ds (previous file data source)
        ds = new CompressionDecorator(ds); // Creates a new CompressionDecorator object who has wrapee named as ds (previous EncryptionDecorator)

//        ds.readData();
        ds.writeData("twinkle gupta"); // first call goes to compressiondecorator ds write data which further calls, its wrapee that is encrpytionDecorator,
        // which further calls its wrappee that is filedata source, which works on writedata effectively
    }
}
