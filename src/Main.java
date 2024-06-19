public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);// в 9 строке при вычитании в перемонной b  получается 0

          /* Чтобы избежать этой ошибки, необходимо добавить проверку на то,
         что делитель не равен нулю перед выполнением операции деления.
         */
         /* Например для решения проблемы я бы добавил  в операцию деления условие с проверкой деления на 0
          BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
          и использовал бы  предикат isPositive, чтобы проверить результат деления c на положительность. Если результат положительный,
          то выводим его, иначе выводим сообщение о том, что на ноль делить нельзя.
           */

        int c = calc.devide.apply(a, b);
        if (calc.isPositive.test(c)){
            calc.println.accept(c);
        } else {
            System.out.println("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ");
        }



    }
}
