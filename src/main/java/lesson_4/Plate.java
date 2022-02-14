package lesson_4;

public class Plate {
    private static int food;
    static int count = 0;

   /*// public static int count() {
        return count;
    }*/

    public Plate(int food) {
        this.food = food;
    }

    public static int getFood() {
        return food;
    }

    public void setFood(int food) {
        Plate.food = this.food + food;
        System.out.println("В тарелку добавили еды "+food);
    }

    public void decreaseFood(int n) {
        food -= n;
        count++;
    }

    public void info() {
          System.out.print(" В тарелке осталось : " + food);
    }
}