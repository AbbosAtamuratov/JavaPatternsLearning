public class Logger {
    private static Logger logger;  // ! static
    private static String logFile = "These are our logs\n"; // ! static

    public static synchronized Logger getLogger(){ // метод делается синхронизированным для многопотчности
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public Logger() {  } // Пустой конструктор

    public void addLogs(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogs(){
        System.out.println(logFile);
    }
}
