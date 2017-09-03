package homework;

import java.util.Hashtable;

public class Processing {

    // функция принимает знак операции, возвращает лямбда выражение для Calculate
    Calculate expression(String operation) {

        // создаем хеш-таблицу для хранения лямбда выражений, в качестве ключа - знак операции
        Hashtable<String, Calculate> calculateHashtable = new Hashtable<>();

        // записываем значения
        calculateHashtable.put("+", ((var1, var2) -> var1 + var2));
        calculateHashtable.put("-", ((var1, var2) -> var1 - var2));
        calculateHashtable.put("*", ((var1, var2) -> var1 * var2));
        calculateHashtable.put("/", ((var1, var2) -> var1 / var2));

        // возвращаем выражение по заданному ключу
        return calculateHashtable.get(operation);
    }
}
