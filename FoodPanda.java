class FoodPanda {
    public static double takeOrder(String foodName) {
        double price = 0.0;
        if (foodName == "Avocado Toast") {
            price = 160.00;
			return price;
        } else if (foodName == "Chia Pudding") {
            price = 140.00;
			return price;
        } else if (foodName == "Tofu Stir Fry") {
            price = 180.00;
			return price;
        } else if (foodName == "Vegan Burrito") {
            price = 200.00;
			return price;
        } else if (foodName == "Lentil Soup") {
            price = 120.00;
			return price;
        } else if (foodName == "Zucchini Noodles") {
            price = 190.00;
			return price;
        } else if (foodName == "Quinoa Salad") {
            price = 170.00;
			return price;
        } else if (foodName == "Hummus Wrap") {
            price = 150.00;
			return price;
        } else if (foodName == "Kale Chips") {
            price = 110.00;
			return price;
        } else if (foodName == "Stuffed Bell Peppers") {
            price = 200.00;
			return price;
        } else if (foodName == "Pumpkin Risotto") {
            price = 210.00;
			return price;
        } else if (foodName == "Eggplant Parmesan") {
            price = 220.00;
			return price;
        } else if (foodName == "Spaghetti Squash") {
            price = 180.00;
			return price;
        } else if (foodName == "Mushroom Stroganoff") {
            price = 200.00;
			return price;
        } else if (foodName == "Black Bean Patty") {
            price = 170.00;
			return price;
        } else if (foodName == "Tempeh Salad") {
            price = 190.00;
			return price;
        } else if (foodName == "Roasted Cauliflower") {
            price = 160.00;
			return price;
        } else if (foodName == "Couscous Bowl") {
            price = 140.00;
			return price;
        } else if (foodName == "Spinach Quiche") {
            price = 200.00;
			return price;
        } else if (foodName == "Green Detox Smoothie") {
            price = 130.00;
			return price;
        } else if (foodName == "Grilled Asparagus") {
            price = 150.00;
			return price;
        } else if (foodName == "Oatmeal Delight") {
            price = 120.00;
			return price;
        } else if (foodName == "Berry Blast Bowl") {
            price = 140.00;
			return price;
        } else if (foodName == "Cabbage Steaks") {
            price = 170.00;
			return price;
        } else if (foodName == "Fruit Yogurt Parfait") {
            price = 110.00;
			return price;
        } else if (foodName == "Sweet Potato Fries") {
            price = 160.00;
			return price;
        } else if (foodName == "Herb Lentil Loaf") {
            price = 180.00;
			return price;
        } else if (foodName == "Broccoli Stir Fry") {
            price = 150.00;
			return price;
        } else if (foodName == "Mango Chia Bowl") {
            price = 190.00;
			return price;
        } else if (foodName == "Beetroot Cutlet") {
            price = 160.00;
			return price;
        }
        return price;
    }
	 public static double takeOrder(String foodName , int quantity) {
        double price = 0.0;
        if (foodName == "Avocado Toast") {
            price = 160.00 * quantity;
			return price;
        } else if (foodName == "Chia Pudding") {
            price = 140.00 * quantity;
			return price;
        } else if (foodName == "Tofu Stir Fry") {
            price = 180.00 * quantity;
			return price;
        } else if (foodName == "Vegan Burrito") {
            price = 200.00* quantity;
			return price;
        } else if (foodName == "Lentil Soup") {
            price = 120.00 * quantity;
			return price;
        } else if (foodName == "Zucchini Noodles") {
            price = 190.00 * quantity;
			return price;
        } else if (foodName == "Quinoa Salad") {
            price = 170.00 * quantity;
			return price;
        } else if (foodName == "Hummus Wrap") {
            price = 150.00 * quantity;
			return price;
        } else if (foodName == "Kale Chips") {
            price = 110.00 * quantity;
			return price;
        } else if (foodName == "Stuffed Bell Peppers") {
            price = 200.00 * quantity;
			return price;
        } else if (foodName == "Pumpkin Risotto") {
            price = 210.00 * quantity;
			return price;
        } else if (foodName == "Eggplant Parmesan") {
            price = 220.00 * quantity;
			return price;
        } else if (foodName == "Spaghetti Squash") {
            price = 180.00 * quantity;
			return price;
        } else if (foodName == "Mushroom Stroganoff") {
            price = 200.00 * quantity;
			return price;
        } else if (foodName == "Black Bean Patty") {
            price = 170.00 * quantity;
			return price;
        } else if (foodName == "Tempeh Salad") {
            price = 190.00 * quantity;
			return price;
        } else if (foodName == "Roasted Cauliflower") {
            price = 160.00 * quantity;
			return price;
        } else if (foodName == "Couscous Bowl") {
            price = 140.00 * quantity;
			return price;
        } else if (foodName == "Spinach Quiche") {
            price = 200.00 * quantity;
			return price;
        } else if (foodName == "Green Detox Smoothie") {
            price = 130.00 * quantity;
			return price;
        } else if (foodName == "Grilled Asparagus") {
            price = 150.00 * quantity;
			return price;
        } else if (foodName == "Oatmeal Delight") {
            price = 120.00 * quantity;
			return price;
        } else if (foodName == "Berry Blast Bowl") {
            price = 140.00 * quantity;
			return price;
        } else if (foodName == "Cabbage Steaks") {
            price = 170.00 * quantity;
			return price;
        } else if (foodName == "Fruit Yogurt Parfait") {
            price = 110.00 * quantity;
			return price;
        } else if (foodName == "Sweet Potato Fries") {
            price = 160.00 * quantity;
			return price;
        } else if (foodName == "Herb Lentil Loaf") {
            price = 180.00 * quantity;
			return price;
        } else if (foodName == "Broccoli Stir Fry") {
            price = 150.00 * quantity;
			return price;
        } else if (foodName == "Mango Chia Bowl") {
            price = 190.00 * quantity;
			return price;
        } else if (foodName == "Beetroot Cutlet") {
            price = 160.00 * quantity; 
			return price;
        }
        return price;
    }
	
}
