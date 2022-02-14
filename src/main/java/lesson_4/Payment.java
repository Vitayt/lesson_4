package lesson_4;

import java.util.Objects;
public  class Payment {
     private static int costPayment;
   private static String namePayment;

    public static int getCostPayment() {
        return costPayment;
    }

    public static String getNamePayment() {
        return namePayment;
    }

    public static void payment(Products[] foodsArray, String name) {

           for (int i = 0; i < foodsArray.length; i++) {
            if (Objects.equals(name, foodsArray[i].getNameFood())) {
                costPayment = foodsArray[i].getCostFood();
                namePayment = foodsArray[i].getNameFood();
                System.out.println("Вы купили: " + foodsArray[i].getNameFood());
                System.out.println("Его стоимость: " + foodsArray[i].getCostFood() + " р.");
                           }

        }


    }
      public static class Products {
        private String nameFood;
        private int costFood;
          public Products(String nameFood, int costFood, int totalFood) {
            this.nameFood = nameFood;
            this.costFood = costFood;
                 }

        public String getNameFood() {
            return nameFood;
        }

        public int getCostFood() {
            return costFood;
        }

        }

}
