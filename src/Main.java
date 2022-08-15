import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        // Задача 1
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.


        int[] container = new int[3];
        container[0] = 1;
        container[1] = 2;
        container[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        int[] lemon = new int[]{5, 6, 8, 12, 27};

        // Задача 2
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива
        // и первым элементом следующего не нужна.
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i]);
            if (i != container.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();

        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.print(fractionalNumbers[i]);
            if (i != fractionalNumbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < lemon.length; i++) {
            System.out.print(lemon[i]);
            if (i != lemon.length - 1) {
                System.out.print(",");





                // Задача 3
                //Теперь ваша задача – распечатать все элементы всех трех массивов,
                // но начинать нужно не с первого элемента массива, а с последнего.
                //Элементы должны быть распечатаны через запятую,
                // при этом элементы одного массива располагаются на одной строчке,
                // а элементы другого массива – на другой.
                //Запятая между последним элементом одного массива и первым элементом следующего не нужна.

               for ( int a = container.length - 1; a >= 0; a--) {
                    System.out.print(container[a]);
                    if (a != 0) {
                        System.out.print(",");
                   }
               }
                System.out.println();
                for ( int a = fractionalNumbers.length - 1; a >= 0; a--) {
                    System.out.print(fractionalNumbers[a]);
                    if (a != 0) {
                        System.out.print(",");
                    }
               }
                System.out.println();
                for ( int a = lemon.length - 1; a >= 0; a--) {
                    System.out.print(lemon[a]);
                    if (a != 0) {
                        System.out.print(",");
                    }
                    }

                System.out.println();
               System.out.println();

               // Задача 4
                //Пройдитесь по первому целочисленному массиву и все нечетные
                // числа в нем сделайте четными (нужно прибавить 1).
                //Важно: код должен работать с любым целочисленным массивом,
                // поэтому для решения задания вам нужно использовать циклы.
                //Распечатайте результат преобразования в консоль.

                for ( int b = 0 ; b<container.length; b++ ){
                    if (container[b] % 2 == 1) {
                        container [ b ]++;

                    }
                    System.out.print( container[b]);
                    if ( b!= container.length - 1) {
                        System.out.print(",");
                    }
                }

            }

        }
    }
}

















