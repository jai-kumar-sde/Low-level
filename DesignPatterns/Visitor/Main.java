package DesignPatterns.Visitor;

public class Main {
        /*
        * using visitor we can process data based on type
        *
        * */
    public static void main(String[] args) {
        Data jsonProcessor = new JsonData();
        Data xmlProcessor = new XmlData();

        Visitor visitor = new Processor();

        jsonProcessor.accept(visitor);
        xmlProcessor.accept(visitor);



    }
}
