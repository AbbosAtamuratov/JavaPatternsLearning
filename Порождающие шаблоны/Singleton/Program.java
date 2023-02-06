public class Program {
    public static void main(String[] args) {
        // Cегмент ниже нужен для того, чтобы удостовериться, что при любом количестве вызовов метода
        // объект вызывается один и тот же, что видно по хэшу объекта
//        System.out.println(Logger.getLogger().toString());
//        System.out.println(Logger.getLogger().toString());
//        System.out.println(Logger.getLogger().toString());
//        System.out.println(Logger.getLogger().toString());

        // Теперь добавляем записи и посмотрим их
        Logger.getLogger().addLogs("initial log");
        Logger.getLogger().addLogs("new log");
        Logger.getLogger().addLogs("latest log");

        Logger.getLogger().showLogs();
    }
}
