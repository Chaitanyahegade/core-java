class Swiggy {

    public static double getFoodPrice(String FoodName) {

        double price = 0.0;

        if (FoodName == "Masala Dosa") {
            price = 50;

        } else if (FoodName == "Rava Dosa") {
            price = 63;

        } else if (FoodName == "Idli") {
            price = 76;

        } else if (FoodName == "Vada") {
            price = 89;

        } else if (FoodName == "Sambar Rice") {
            price = 102;

        } else if (FoodName == "Coconut Chutney") {
            price = 115;

        } else if (FoodName == "Pongal") {
            price = 128;

        } else if (FoodName == "Uttapam") {
            price = 141;

        } else if (FoodName == "Medu Vada") {
            price = 154;

        } else if (FoodName == "Puttu") {
            price = 167;

        } else if (FoodName == "Chicken 65") {
            price = 180;

        } else if (FoodName == "Paneer Tikka") {
            price = 193;

        } else if (FoodName == "Fish Curry") {
            price = 206;

        } else if (FoodName == "Prawns Fry") {
            price = 219;

        } else if (FoodName == "Mutton Chops") {
            price = 232;

        } else if (FoodName == "Egg Parotta") {
            price = 245;

        } else if (FoodName == "Keema Parotta") {
            price = 258;

        } else if (FoodName == "Chicken Korma") {
            price = 271;

        } else if (FoodName == "Veg Thali") {
            price = 284;

        } else if (FoodName == "NonVeg Thali") {
            price = 297;

        } else if (FoodName == "Rajma Chawal") {
            price = 310;

        } else if (FoodName == "Chole Bhature") {
            price = 323;

        } else if (FoodName == "Aloo Paratha") {
            price = 336;

        } else if (FoodName == "Paneer Paratha") {
            price = 349;

        } else if (FoodName == "Lassi") {
            price = 362;

        } else if (FoodName == "Buttermilk") {
            price = 375;

        } else if (FoodName == "Gulab Jamun") {
            price = 388;

        } else if (FoodName == "Rasgulla") {
            price = 401;

        } else if (FoodName == "Jalebi") {
            price = 414;

        } else if (FoodName == "Kheer") {
            price = 427;

        } else if (FoodName == "Falooda") {
            price = 440;

        } else if (FoodName == "Chocolate Brownie") {
            price = 453;

        } else if (FoodName == "Vanilla Icecream") {
            price = 466;

        } else if (FoodName == "Strawberry Shake") {
            price = 479;

        } else if (FoodName == "Mango Shake") {
            price = 492;

        } else if (FoodName == "Banana Shake") {
            price = 55;

        } else if (FoodName == "Cold Coffee") {
            price = 68;

        } else if (FoodName == "Filter Coffee") {
            price = 81;

        } else if (FoodName == "Masala Chai") {
            price = 94;

        } else if (FoodName == "Lemon Tea") {
            price = 107;

        } else if (FoodName == "Green Salad") {
            price = 120;

        } else if (FoodName == "Caesar Salad") {
            price = 133;

        } else if (FoodName == "Greek Salad") {
            price = 146;

        } else if (FoodName == "Veg Sandwich") {
            price = 159;

        } else if (FoodName == "Grilled Sandwich") {
            price = 172;

        } else if (FoodName == "Club Sandwich") {
            price = 185;

        } else if (FoodName == "BLT Sandwich") {
            price = 198;

        } else if (FoodName == "Veg Burger") {
            price = 211;

        } else if (FoodName == "Chicken Burger") {
            price = 224;

        } else if (FoodName == "Fish Burger") {
            price = 237;

        } else if (FoodName == "Fries") {
            price = 250;

        } else if (FoodName == "Cheese Fries") {
            price = 263;

        } else if (FoodName == "Onion Rings") {
            price = 276;

        } else if (FoodName == "Garlic Bread") {
            price = 289;

        } else if (FoodName == "Pizza Margherita") {
            price = 302;

        } else {
            System.out.println("The Food Name is Not Found.");
        }

        return price;
    }
}
