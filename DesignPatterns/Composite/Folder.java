package DesignPatterns.Composite;

import java.util.List;

public class Folder implements Directory{
    private String name;
    private List<Directory> directorys;

    public Folder(String name, List<Directory> directorys) {
        this.name = name;
        this.directorys = directorys;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for(Directory folders:directorys){
            totalSize += folders.getSize();
        }
        return totalSize;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}
