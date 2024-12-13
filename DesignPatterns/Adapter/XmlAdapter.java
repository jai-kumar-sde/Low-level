package DesignPatterns.Adapter;

public class XmlAdapter implements IDataParser{
    private  XmlParser xmlParser;

    public XmlAdapter() {
        this.xmlParser = new XmlParser();
    }

    @Override
    public void processData(String data) {
        this.xmlParser.processXmlData(data);
    }
}
