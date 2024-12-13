package DesignPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        IDataParser parser = new JsonParser();
        parser.processData("Json String");

        parser = new XmlAdapter();

        parser.processData("Xml String");
    }
}
