package homework;

public class Main {

    public static void main(String[] args) {

        Processing p = new Processing();
        Calculate calculate;

        calculate = p.expression("+"); // передаем знак операции
        // ответ через обе функции getAnswer и sum должны быть одинаковыми
        System.out.println("2 + 5 = " + calculate.getAnswer(2,5));
        System.out.println("2 + 5 = " + calculate.sum(2,5));

        calculate = p.expression("-");
        System.out.println("9 - 6 = " + calculate.getAnswer(9,6));
        System.out.println("9 - 6 = " + calculate.sub(9,6));

        calculate = p.expression("*");
        System.out.println("12 * 1 = " + calculate.getAnswer(12,1));
        System.out.println("12 * 1 = " + calculate.mul(12,1));

        calculate = p.expression("/");
        System.out.println("56 / 8 = " + calculate.getAnswer(56,8));
        System.out.println("56 / 8 = " + calculate.div(56,8));
    }

}
