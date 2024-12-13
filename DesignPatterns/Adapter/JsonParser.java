package DesignPatterns.Adapter;

public class JsonParser implements IDataParser{
    @Override
    public void processData(String data) {
        System.out.println("Data is process by Json Parser: " + data);
    }
}
