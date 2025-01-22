package cycles;

public class CyclesOperators {
    public static void main(String[] args) {
        cyclesTask1();
        cyclesTask2();
        cyclesTask3();
        cyclesTask4();
        cyclesTask5();
        cyclesTask6();
        cyclesTask7();
        cyclesTask8();
        cyclesTask9();
        cyclesTask10();

    }

    //for
    //Даны  два  целых  числа  A  и  B  (A  <  B).  
    //Вывести  все целые числа, расположенные между данными числами (включая  сами  эти  числа),  в  порядке  их  возрастания, а также количество N этих чисел.
    private static void cyclesTask1() {
        int a = 2;
        int b = 7;
        int n = 0;
        System.out.print("Задча 1: ");
        if (a < b) {
            for (int i = a; (i <= b); i++) {
                System.out.print(" " + i);
                n++;
            }
        } else {
            System.out.print("А должен быть меньше В");
        }
        System.out.println(" n= " + n);

    }

    //Даны  два  целых  числа  A  и  B  (A  <  B).  
    //Вывести  все целые числа, расположенные между данными числами (не включая сами эти числа), в порядке их убывания, а также количество N этих чисел.
    private static void cyclesTask2() {
        int a = 2;
        int b = 7;
        int n = 0;
        System.out.print("Задча 2: ");
        if (a < b) {
            for (int i = b - 1; (i > a); i--) {
                System.out.print(" " + i);
                n++;
            }
        } else {
            System.out.print("А должен быть меньше В");
        }
        System.out.println(" n= " + n);
    }

    //Дано  целое  число  N  >  0 (N – количество множителей). Найти произведение 1,1 * 1,2 * 1,3 * …
    private static void cyclesTask3() {
        int n = 4;
        double mnoj = 1;
        double num = 1;
        if (n > 0) {
            for (int i = 0; (i < n); i++) {
                num += 0.1;
                mnoj = mnoj * num;
            }
        } else {
            System.out.print("N должен быть больше 0");
        }
        System.out.println("Задача 3: " + mnoj);
    }

    //Дано  целое  число  N  >  0 (N – количество множителей). Найти значение выражения 1,1 – 1,2 + 1,3 – …
    private static void cyclesTask4() {
        int n = 6;
        double mnoj = 0;
        double num = 1;
        if (n > 0) {
            for (int i = 0; (i < n); i++) {
                num += 0.1;
                if (i % 2 == 0) {
                    mnoj = mnoj + num;
                } else {
                    mnoj = mnoj - num;
                }
            }
        } else {
            System.out.print("N должен быть больше 0");
        }
        System.out.println("Задача 4: " + mnoj);
    }

    //Дано  целое  число  N  >  0.  Если  N  —  нечетное,  то вывести  произведение  1·3·...·N;  если  N  —  четное,  то вывести  произведение  2·4·...·N.
    private static void cyclesTask5() {
        int n = 6;
        int mnoj = 1;
        if (n <= 0) {
            System.out.println("N должен быть больше 0");
        }
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                if (i % 2 == 0) {
                    mnoj = mnoj * i;
                } else {
                    continue;
                }
            } else if (n % 2 != 0) {
                if (i % 2 != 0) {
                    mnoj = mnoj * i;
                } else {
                    continue;
                }
            }
        }
        System.out.println("Задача 5: " + mnoj);
    }

    //Вывести на экран равнобедренный треугольник из ^.
    private static void cyclesTask6() {
        int v = 5;
        System.out.println("Задача 6: ");
        for (int i = 0, l = 0; i < v; i++) {
            if (i != 0) {
                l += 2;
            }
            for (int j = v; j > i; j--) {
                System.out.print("_");
            }
            for (int k = 0; k <= l; k++) {
                System.out.print("^");

            }
            System.out.println();
        }

    }

    //Вложенные циклы
    //Даны целые положительные числа N и K. Найти сумму 1^k + 2^k + … + n^k.
    private static void cyclesTask7() {
        double n = 6;
        double k = 3;
        double num = 0;
        int summ = 0;
        double x = 1;
        for (int i = 1; i <= n; i++) {
            for (; x == i; x++) {
                num = Math.pow(x, k);
            }
            summ += num;
        }
        System.out.println("Задача 7: " + summ);
    }

    //Даны целые положительные числа A и B (A < B). 
    //Вывести все числа от A до B включительно. При этом каждое число должно выводиться столько раз, каково его значение (то есть число 3 выводится 3 раза).
    private static void cyclesTask8() {
        int a = 3;
        int b = 8;
        if (a < b) {
            System.out.print("Задача 8: ");
            for (int i = a; i <= b; i++) {
                for (int k = i; k > 0; k--) {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        } else {
            System.out.println("А должен быть меньше В");
        }
    }

    // WHILE
    //Дано целое число N (>1). Найти наименьшее целое число K, при котором выполняется неравенство 3^k > N.
    private static void cyclesTask9() {
        int n = 10;
        int k = n;
        if (n > 1) {
            do {
                k--;
            } while (Math.pow(3, k) > n);
            System.out.println("Задача 9:" + k);
        } else
            System.out.println("N должен быть больше 1");
    }

    //Дано целое число N (>1). Найти наибольшее целое число K, при котором выполняется неравенство 3^k < N.
    private static void cyclesTask10() {
        int n = 10;
        int k = n;
        if (n > 1) {
            do {
                k--;
            } while (Math.pow(3, k) > n);
            System.out.println("Задача 10" + k);
        } else
            System.out.println("N должен быть больше 1");
    }
}
