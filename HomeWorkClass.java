import java.util.Scanner;

public class HomeWorkClass {
    public static void main(String[] args) {
        //First level: Level1:
        //Считывается 2 числа, произвести все арифм. операции с ними
        //(поделить, умножить, сложить, вычесть)
       Scanner s = new Scanner(System.in);
        int one = s.nextInt();
        int two = s.nextInt();
        System.out.println(one + two);
        System.out.println(one - two);
        System.out.println(one * two);
        System.out.println(one / two);
        //Level2:
        //С консоли вводится трехзначное число. Найдите в нем первую,
        // вторую и третью цифры. Используйте при этом / и (или) %
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        System.out.println(number % 10);
        System.out.println(number / 10 % 10);
        System.out.println( number / 100);




    }
}
