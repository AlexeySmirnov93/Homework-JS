package Homework.Hom_1;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

// public class program {
//     public static void main(String[] args) 
//     {
//       Scanner iScanner = new Scanner(System.in, "Cp866");
//       System.out.print("Введите число: ");
//       int a = iScanner.nextInt();
//       iScanner.close();
//       int fact = 1;
//       int t = 0;
//       for (int i = 1; i < a + 1; i++)
//       {
//         fact = fact * i;
//         t = t + i;
//       }
        
      
//       System.out.println("n!" + a + " = " + fact);
//       System.out.println("Треугольное число n" + a + " = " + t);
//     }
        
       
// }


// 2.Вывести все простые числа от 1 до 1000


// public class program {
//   public static void main(String[] args) 
//   {
//     Scanner iScanner = new Scanner(System.in, "Cp866");
//     System.out.print("Введите первое число: ");
//     int a = iScanner.nextInt();
//     System.out.print("Введите последнее число: ");
//     int b = iScanner.nextInt();
//     iScanner.close();
//     if (a <= 1)
//     {
//       a = 2;
//     }
//     for(int i = a; i <b; i++)
//     {
//       int c = 0;
//       for (int j = 1; j <= i; j++) 
//       {
//         if (i % j == 0)
//           c++;
//       }
//         if (c <= 2)
//       {
//         System.out.println(i);
//       }
//     }    
//   }           
// }

// 3. Реализовать простой калькулятор (+ - / *)


// public class program {
//    public static void main(String[] args) {
//       double num1;
//       double num2;
//       double res;
//       char oper;
//       try (Scanner reader = new Scanner(System.in,"Cp866")) {
//         System.out.print("Введите число 1: ");
//         num1 = reader.nextDouble();
//         System.out.print("Введите действие: ");
//         oper = reader.next().charAt(0);
//         System.out.print("Введите число 2: ");
//         num2 = reader.nextDouble(); 
//       }

//       switch(oper) {
//          case '+': res = num1 + num2;
//             break;
//          case '-': res = num1 - num2;
//             break;
//          case '*': res = num1 * num2;
//             break;
//          case '/': res = num1 / num2;
//             break;
//          default:  System.out.printf("Неверный ввод действия");
//             return;
//       }
//       System.out.printf(num1 + " " + oper + " " + num2 + " = " + res);
//    }
// }