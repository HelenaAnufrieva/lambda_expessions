package homework;

@FunctionalInterface
public interface Calculate {

    Integer getAnswer(Integer var1, Integer var2);

    /*
    * Функции для вычисления математических операций по умолчанию
    */
    default Integer sum(Integer var1, Integer var2){
        return var1 + var2;
    }
    default Integer sub(Integer var1, Integer var2){
        return var1 - var2;
    }
    default Integer mul(Integer var1, Integer var2){
        return var1 * var2;
    }
    default Integer div(Integer var1, Integer var2){
        return var1 / var2;
    }

}
