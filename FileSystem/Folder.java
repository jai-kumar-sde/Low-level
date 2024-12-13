package Problems.FileSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Folder extends  Directory{

    private Map<String, Directory> folders;


    public Folder(String name) {
        super(name);
        this.folders = new HashMap<>();
    }

    @Override
    public boolean isFile() {
        return false;
    }

    public Directory addFolder(String path){
        if(this.folders.get(path) == null ){
            this.folders.put(path,new Folder(path));
        }
        return this.folders.get(path);
    }

    public Directory addFile(String path,String content){
        if(this.folders.get(path) == null ){
            this.folders.put(path,new File(path,content));
        }
        return this;
    }

    public Directory isAvaiable(String path){
        return this.folders.get(path);
    }



//    Directory createDirectory(String path) {
//        Directory curr = this.folders.get(path);
//        if(curr == null || curr.isFile()){
//
//            this.folders.put(path,new Folder(path));
//        }
//        return this.folders.get(path);
//    }
//
//    public void addFile(String filename){
//        if(this.folders.get(filename) == null){
//            this.folders.put(filename,new File(filename));
//        }
//    }
//
//    public Directory checkDirectory(String path) {
//        return this.folders.get(path);
//    }
//
    @Override
    public List<String> getDirectory() {
        System.out.println(this.folders);
        //return (List<Directory>) this.folders.values();
        return this.folders.values().stream().map(Directory::getName).collect(Collectors.toList());
       // return null;
    }


    @Override
    public String toString() {
        return "Folder{" +
                "folders=" + folders +
                '}';
    }
}
