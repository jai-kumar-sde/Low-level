package DesignPatterns.Visitor;

public interface Visitor {
    void visit(XmlData processor);
    void visit(JsonData processor);
}
