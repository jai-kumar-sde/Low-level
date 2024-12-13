package DesignPatterns.Visitor;

public class JsonData implements Data{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
