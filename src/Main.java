import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        // Задача 1
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.


        int[] containers = new int[3];
        containers[0] = 1;
        containers[1] = 2;
        containers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        int[] lemons = new int[]{5, 6, 8, 12, 27};

        // Задача 2
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива
        // и первым элементом следующего не нужна.
        for (int i = 0; i < containers.length; i++) {
            System.out.print(containers[i]);
            if (i != containers.length - 1) {
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
        for (int i = 0; i < lemons.length; i++) {
            System.out.print(lemons[i]);
            if (i != lemons.length - 1) {
                System.out.print(",");

            }
        }
        System.out.println();

        // Задача 3
        //Теперь ваша задача – распечатать все элементы всех трех массивов,
        // но начинать нужно не с первого элемента массива, а с последнего.
        //Элементы должны быть распечатаны через запятую,
        // при этом элементы одного массива располагаются на одной строчке,
        // а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        for (int a = containers.length - 1; a >= 0; a--) {
            System.out.print(containers[a]);
            if (a != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int a = fractionalNumbers.length - 1; a >= 0; a--) {
            System.out.print(fractionalNumbers[a]);
            if (a != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int a = lemons.length - 1; a >= 0; a--) {
            System.out.print(lemons[a]);
            if (a != 0) {
                System.out.print(",");
            }
        }

        System.out.println();
        System.out.println();
    }

}
               // Задача 4
                //Пройдитесь по первому целочисленному массиву и все нечетные
                // числа в нем сделайте четными (нужно прибавить 1).
                //Важно: код должен работать с любым целочисленным массивом,
                // поэтому для решения задания вам нужно использовать циклы.
                //Распечатайте результат преобразования в консоль.

     //for ( int i = 0 ; i < containers.length; i++ ){
    //if (containers[i] % 2 == 1) {
   //   containers [ i ]++;

              //     }
        //System.out.print(containers[i]);
     //   if (i != containers.length - 1) {
     //       System.out.print(",");
    //    }

   //      }

  //     }



















