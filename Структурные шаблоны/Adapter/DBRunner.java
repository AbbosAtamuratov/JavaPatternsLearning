public class DBRunner {
    public static void main(String[] args) {
        /* Допустим у нас есть интерфейс базы данных и класс приложения, в какой-то
           момент нам нужно чтобы эти сущности взаимодействовали, однако у них методы
           по смыслу совпадают и поэтому прямое имплементирование не подходит.
           вот тут-то и нужен Адаптер */
        Database db = new AdapterJavaToDatabase();
        db.insert();
        db.update();
        db.select();
        db.remove();
        // и вот теперь всё работает как надо
    }
}
