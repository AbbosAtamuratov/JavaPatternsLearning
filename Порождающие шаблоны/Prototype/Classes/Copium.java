package Classes;

public interface Copium {
    Object copy();
    // данный интерфейс возвращает Object для того, чтобы не привязывать интерфейс к копируемому классу
    // В стандартной библиотеке есть более продвинутый интерфейс для клонирования Clonable
}
