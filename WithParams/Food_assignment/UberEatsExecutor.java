class UberEatsExecutor {

    public static void main(String[] args) {

        String FoodName = "BBQ Chicken Pizza";

        double ref = UberEats.getFoodPrice(FoodName);

        System.out.println("The Price of the Food " + FoodName + " is : " + ref);
    }
}
