class SwiggyExecutor {

    public static void main(String[] args) {

        String FoodName = "Rava Dosa";

        double ref = Swiggy.getFoodPrice(FoodName);

        System.out.println("The Price of the Food " + FoodName + " is : " + ref);
    }
}
