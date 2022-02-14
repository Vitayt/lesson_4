package lesson_4;

import java.util.Objects;
import java.util.Scanner;

public class RunPayment {
    public static void main(String[] args) {
        Payment.Products[] foodsArray = new Payment.Products[5];
        foodsArray[0] = new Payment.Products("молоко", 2, 5);
        foodsArray[1] = new Payment.Products("хлеб", 1, 10);
        foodsArray[2] = new Payment.Products("масло", 3, 6);
        foodsArray[3] = new Payment.Products("сахар", 2, 7);
        foodsArray[4] = new Payment.Products("соль", 2, 8);

        System.out.println();
        int cost = 0;
        String name;
        String name1="Вы купили: ";
               int i = 0;
                do {
            System.out.println("Вы можетет купить: молоко, хлеб, масло, сахар, соль");
                    System.out.println("Если вы всё купили напишите 'да' ");
            Scanner scan = new Scanner(System.in);
            System.out.print("Напишите что вы хотите купить: ");
            name = scan.next();
            Payment.payment(foodsArray, name);
            if (!(Objects.equals(name, "да"))) {
                cost = cost + Payment.getCostPayment();
                name1 = name1 +" "+ Payment.getNamePayment();
                i++;
                               }
               System.out.println(" "+name1+" ");
                    System.out.println("Итого " + cost + " р.");
                       }
            while (!(Objects.equals(name, "да"))) ;

            }
        }
