package lesson_4;

public  class Dog extends Animal {
    static int count =0;
    public Dog(){
        count++;
    }

    public static int count(){
        return count;

    }
    @Override
    public void run(int distance_run) {
        int a = distance_run;
        if (a <= 500&& a>0)
            System.out.println("Собачка пробежала "+ distance_run+ " м." );
        else System.out.println("Собачка не может пробежать "+ distance_run+ " м." );
    }
    @Override
    public void swim(int distance_swim) {
        int a = distance_swim;
        if (a <= 10&& a>0)
            System.out.println("Собачка проплыла "+ distance_swim+ " м." );
        else System.out.println("Собачка не может проплыть  "+ distance_swim+ " м." );
    }
}
