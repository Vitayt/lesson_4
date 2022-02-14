package lesson_4;

//  Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//  Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
// У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
public class Animal {
 static int count =0;
 public Animal(){
     count++;
      }

public static int count(){
    return count;

}

       public  void run(int distance_run) {
        System.out.println(distance_run + " м. ");

           }
    public void swim(int distance_swim) {
        System.out.println(distance_swim + " м. ");
    }

}