package DesignPatterns.Composite;

public class File implements  Directory{
    private int size;
    private String name;

    public File(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isFolder() {
        return false;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
