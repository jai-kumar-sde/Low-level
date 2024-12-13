package DesignPatterns.Template;

public class Main {
    public static void main(String[] args) {
        DocumentMining wordDocument = new DocxMining();
        DocumentMining pdfDocument = new PdfMining();

        wordDocument.mining("word");
        pdfDocument.mining("pdf");
    }
}

