class Zomato {

    public static double getFoodPrice(String FoodName) {

        double price = 0.0;

        if (FoodName == "Tacos") {
            price = 50;

        } else if (FoodName == "Burritos") {
            price = 63;

        } else if (FoodName == "Quesadillas") {
            price = 76;

        } else if (FoodName == "Enchiladas") {
            price = 89;

        } else if (FoodName == "Fajitas") {
            price = 102;

        } else if (FoodName == "Nachos") {
            price = 115;

        } else if (FoodName == "Guacamole") {
            price = 128;

        } else if (FoodName == "Salsa") {
            price = 141;

        } else if (FoodName == "Churros") {
            price = 154;

        } else if (FoodName == "Empanadas") {
            price = 167;

        } else if (FoodName == "Tamales") {
            price = 180;

        } else if (FoodName == "Chimichangas") {
            price = 193;

        } else if (FoodName == "Taquitos") {
            price = 206;

        } else if (FoodName == "Tostadas") {
            price = 219;

        } else if (FoodName == "Arepas") {
            price = 232;

        } else if (FoodName == "Pupusas") {
            price = 245;

        } else if (FoodName == "Ceviche") {
            price = 258;

        } else if (FoodName == "Paella") {
            price = 271;

        } else if (FoodName == "Tapas") {
            price = 284;

        } else if (FoodName == "Gazpacho") {
            price = 297;

        } else if (FoodName == "Tortilla Española") {
            price = 310;

        } else if (FoodName == "Patatas Bravas") {
            price = 323;

        } else if (FoodName == "Croquetas") {
            price = 336;

        } else if (FoodName == "Jamón Ibérico") {
            price = 349;

        } else if (FoodName == "Chorizo") {
            price = 362;

        } else if (FoodName == "Salchichón") {
            price = 375;

        } else if (FoodName == "Lomo") {
            price = 388;

        } else if (FoodName == "Manchego Cheese") {
            price = 401;

        } else if (FoodName == "Roquefort Cheese") {
            price = 414;

        } else if (FoodName == "Brie Cheese") {
            price = 427;

        } else if (FoodName == "Camembert Cheese") {
            price = 440;

        } else if (FoodName == "Gouda Cheese") {
            price = 453;

        } else if (FoodName == "Edam Cheese") {
            price = 466;

        } else if (FoodName == "Swiss Cheese") {
            price = 479;

        } else if (FoodName == "Cheddar Cheese") {
            price = 492;

        } else if (FoodName == "Parmesan Cheese") {
            price = 55;

        } else if (FoodName == "Feta Cheese") {
            price = 68;

        } else if (FoodName == "Mozzarella Cheese") {
            price = 81;

        } else if (FoodName == "Provolone Cheese") {
            price = 94;

        } else if (FoodName == "Ricotta Cheese") {
            price = 107;

        } else if (FoodName == "Mascarpone Cheese") {
            price = 120;

        } else if (FoodName == "Cream Cheese") {
            price = 133;

        } else if (FoodName == "Cottage Cheese") {
            price = 146;

        } else if (FoodName == "Tofu") {
            price = 159;

        } else if (FoodName == "Tempeh") {
            price = 172;

        } else if (FoodName == "Seitan") {
            price = 185;

        } else if (FoodName == "Edamame") {
            price = 198;

        } else if (FoodName == "Seaweed Salad") {
            price = 211;

        } else if (FoodName == "Wakame") {
            price = 224;

        } else if (FoodName == "Kombu") {
            price = 237;

        } else if (FoodName == "Nori") {
            price = 250;

        } else if (FoodName == "Bonito Flakes") {
            price = 263;

        } else if (FoodName == "Katsuobushi") {
            price = 276;

        } else if (FoodName == "Yuzu") {
            price = 289;

        } else if (FoodName == "Wasabi") {
            price = 302;

        } else {
            System.out.println("The Food Name is Not Found.");
        }

        return price;
    }
}
