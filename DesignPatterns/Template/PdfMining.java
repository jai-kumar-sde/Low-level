package DesignPatterns.Template;

public class PdfMining extends DocumentMining{

    @Override
    public void processFileData() {
        System.out.println("File Data is process by Pdf Processor");
    }
}
