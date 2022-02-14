package lesson_4;

public class Cat extends Animal {
    static int count =0;
    public static int count()
    {
        return count;
    }

    private String name;
    private  int appetite;
    public Cat(String name, int appetite) {
        count++;
        this.name = name;
        this.appetite = appetite;
        }
    public  int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
    @Override
    public void run(int distance_run) {
        int a = distance_run;
        if (a <= 200&& a>0)
            System.out.println("Котик пробежал "+ distance_run+ " м." );
else System.out.println("Котик не может пробежать "+ distance_run+ " м." );

    }
    @Override
    public void swim(int distance_swim) {
        System.out.println("Котики не плавают(");

    }

  }
