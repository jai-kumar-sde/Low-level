package Problems.FileSystem;

import java.util.List;

public class File extends Directory{

    private String content;

    public File(String name,String content) {
        super(name);
        this.content=content;
    }


    @Override
    public boolean isFile() {
        return true;
    }

    @Override
    public String toString() {
        return "File{" +
                "content='" + content + '\'' +
                '}';
    }
}
