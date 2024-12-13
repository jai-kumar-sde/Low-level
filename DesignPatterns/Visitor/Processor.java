package DesignPatterns.Visitor;

public class Processor implements Visitor{
    @Override
    public void visit(XmlData processor) {
        System.out.println("XML Data is process SuccessFully");
    }

    @Override
    public void visit(JsonData processor) {
        System.out.println("Json Data is Process SuccessFully");
    }
}
