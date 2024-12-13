package DesignPatterns.Template;

public abstract class DocumentMining {
    public void mining(String path){
        openFile(path);
        processFileData();
        analyzeData();
        sendReport();
    }
    public void openFile(String path){
        System.out.println("File is Extract and open");
    }
    public abstract void processFileData();
    public void extractData(){
        System.out.println("Data is extracted from File");
    }
    public void analyzeData(){
        System.out.println("Data is Analyzing");
    }
    public void sendReport(){
        System.out.println("Report is send");
    }
}
