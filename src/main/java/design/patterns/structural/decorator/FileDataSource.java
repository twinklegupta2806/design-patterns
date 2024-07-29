package design.patterns.structural.decorator;

public class FileDataSource implements DataSource
{
    String fileName;
    public FileDataSource(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String readData()
    {
        return "file source reading";
    }

    @Override
    public void writeData(String data)
    {
        System.out.println("incoming data = "+ data);
        System.out.println("FileDataSource writing data "+ data);
    }
}
