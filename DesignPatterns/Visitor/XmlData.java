package DesignPatterns.Visitor;

public class XmlData implements  Data{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
