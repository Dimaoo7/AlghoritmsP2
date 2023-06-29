package pro.sky.alghoritmsp2;


public interface IntegerList {

        // Добавление элемента.
        // Вернуть добавленный элемент
        // в качестве результата выполнения.
        Integer add(Integer item);

        // Удаление элемента.
        // Вернуть удаленный элемент
        // или исключение, если подобный
        // элемент отсутствует в списке.
        Integer remove(Integer item);

        // Вернуть фактическое количество элементов.
        Integer size();

        // Вернуть true,
        // если элементов в списке нет,
        // иначе false.
        boolean isEmpty();

        // Удалить все элементы из списка.
        void clear();

    }


