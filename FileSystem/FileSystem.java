package Problems.FileSystem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* createDire mkdir
* ls -> list the files
* addContenttoFile
* chang
* /folder/
*  /folder/file.txt
* ls /folder1/folder2/
*  mkdir /folder/folder2/    or /folder1/folder2/file.txt
*
* */

public class FileSystem {
    Directory fileSystem;

    public FileSystem(Directory fileSystem) {
        this.fileSystem = fileSystem;
    }

    boolean createDirectory(String path,String content){
        Directory curr= this.fileSystem;
        String[] foldersNames = path.split("/");
        Arrays.stream(foldersNames).filter((str) -> str!= "").collect(Collectors.toList());
        for(String folderName:foldersNames){
            if(folderName != ""){
                if(folderName.contains(".")){
                    curr = curr.addFile(folderName,content);
                }
                else {
                    curr = curr.addFolder(folderName);
                }
            }
        }
//        curr.addFile(filename);
        return true;
    }

    List<String> getDirectory(String path){
        Directory curr = this.fileSystem;
        String[] folderNames = path.split("/");
        for(String folderName: folderNames){
            if(folderName != ""){
                curr = curr.isAvaiable(folderName);
                if(curr == null){
                    System.out.println("Path is not exist");
                    return null;
                }
            }
        }
//        if(curr.isFile()){
//            return Arrays.asList(curr.getName());
//        }
//        else{
            return curr.getDirectory();
      //  }
        //return curr.getDirectory();
    }

    public static void main(String[] args) {
        Directory folder = new Folder("root");
        FileSystem fileSystem = new FileSystem(folder);

        fileSystem.createDirectory("c/folder1/folder2/folder3/file1.txt","file1Text");
        fileSystem.createDirectory("c/folder1/folder3/folder4/file1.txt","file1Text");
        fileSystem.createDirectory("c/folder1/folder2/folder3/file1.txt","file1Text");
        fileSystem.createDirectory("c/folder1/folder2/folder3/file1.txt","file1Text");
        System.out.println( fileSystem.getDirectory("c/folder1/folder2/folder3"));
        System.out.println( fileSystem.getDirectory("c/folder1/folder3/folder4/"));
        System.out.println( fileSystem.getDirectory("c/folder1/folder2/folder3/"));
        System.out.println( fileSystem.getDirectory("c/folder1/folder2/"));
        System.out.println( fileSystem.getDirectory("/"));
        System.out.println(fileSystem.fileSystem);

    }
}
