package DesignPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLog(new ErrorLog(new DebugLog(null)));
        logger.log(LogType.INFO,"Exception");
    }

}
