package Problems.FileSystem;

import java.util.List;

public abstract class Directory {
//    private boolean isFile;
    private String name;

    public Directory(String name) {
//        this.isFile = isFile;
        this.name=name;
    }
//
//    abstract Directory createDirectory(String path);
//     public Directory checkDirectory(String path){
//         return null;
//     }
//
    public List<String> getDirectory(){
        return null;
    }
    void addFile(String filename){

    }

    abstract public boolean isFile();

    public Directory addFolder(String path){
       return null;
    }

    public Directory addFile(String path,String content){
       return null;
    }

    public Directory isAvaiable(String path){
        return null;
    }
//    public void setFile(boolean file) {
//        isFile = file;
//    }
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
