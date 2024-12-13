package DesignPatterns.ChainOfResponsibility;

public class InfoLog extends LogProcessor{

    public InfoLog(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public InfoLog() {
    }

    public void log(LogType logType, String message){
        if(logType== LogType.INFO){
            System.out.println("INFO : " + message);
        }
        else{
            this.logProcessor.log(logType,message);
        }
    }
}
