package DesignPatterns.ChainOfResponsibility;

public class ErrorLog extends  LogProcessor{

    public ErrorLog(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public ErrorLog() {
    }

    @Override
    public void log(LogType logType, String message) {
        if(logType == LogType.ERROR){
            System.out.println("ERROR: " + message);
        }
        else
            this.logProcessor.log(logType,message);
    }
}
