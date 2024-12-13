package DesignPatterns.ChainOfResponsibility;

public abstract class  LogProcessor {
    public  LogProcessor logProcessor;

    public LogProcessor() {
        this.logProcessor=null;
    }
    public LogProcessor(LogProcessor logProcessor) {
        this.logProcessor= logProcessor;
    }

    public  void log(LogType logType,String message){
        if(this.logProcessor==null){
            System.out.println("No logger found");
        }
//        else{
//            this.logProcessor.log(logType,message);
//        }
    }
}
