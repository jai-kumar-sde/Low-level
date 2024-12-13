package DesignPatterns.ChainOfResponsibility;

public class DebugLog extends LogProcessor{

    public DebugLog(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public DebugLog() {
    }

    @Override
    public void log(LogType logType, String message) {
        if(logType == LogType.DEBUG){
            System.out.println("DEBUG: " + message);
        }
       else
            this.logProcessor.log(logType,message);
    }

}
