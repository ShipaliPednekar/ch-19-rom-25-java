class Swiggy {
   public static  double search(String foodName) {
        double price = 0.0;
        if (foodName == "Burger") {
            price = 78.00;
			return price;
        } else if (foodName == "Pizza") {
            price = 250.00;
			return price;
        } else if (foodName == "Fries") {
            price = 60.00;
			return price;
        } else if (foodName == "Pasta") {
            price = 180.00;
			return price;
        } else if (foodName == "Tacos") {
            price = 120.00;
			return price;
        } else if (foodName == "Hot Dog") {
            price = 90.00;
			return price;
        } else if (foodName == "Sandwich") {
            price = 70.00;
			return price;
        } else if (foodName == "Salad") {
            price = 110.00;
			return price;
        } else if (foodName == "Wrap") {
            price = 130.00;
			return price;
        } else if (foodName == "Biryani") {
            price = 200.00;
			return price;
        } else if (foodName == "Noodles") {
            price = 150.00;
			return price;
        } else if (foodName == "Paneer Butter Masala") {
            price = 190.00;
			return price;
        } else if (foodName == "Chole Bhature") {
            price = 100.00;
			return price;
        } else if (foodName == "Masala Dosa") {
            price = 80.00;
			return price;
        } else if (foodName == "Idli Sambar") {
            price = 70.00;
			return price;
        } else if (foodName == "Vada Pav") {
            price = 20.00;
			return price;
        } else if (foodName == "Pav Bhaji") {
            price = 90.00;
			return price;
        } else if (foodName == "Poha") {
            price = 50.00;
			return price;
        } else if (foodName == "Upma") {
            price = 55.00;
			return price;
        } else if (foodName == "Cutlet") {
            price = 45.00;
			return price;
        } else if (foodName == "Kachori") {
            price = 30.00;
			return price;
        } else if (foodName == "Samosa") {
            price = 25.00;
			return price;
        } else if (foodName == "Dhokla") {
            price = 35.00;
			return price;
        } else if (foodName == "Spring Roll") {
            price = 95.00;
			return price;
        } else if (foodName == "Manchurian") {
            price = 105.00;
			return price;
        } else if (foodName == "Fried Rice") {
            price = 140.00;
			return price;
        } else if (foodName == "Hakka Noodles") {
            price = 145.00;
			return price;
        } else if (foodName == "Gobi 65") {
            price = 115.00;
			return price;
        } else if (foodName == "Veg Roll") {
            price = 90.00;
			return price;
        } else if (foodName == "Pani Puri") {
            price = 20.00;
			return price;
        }
        return price;
    }

public static double search(String foodName,int quantity){
	double price=0.0;
	
	  if (foodName == "Burger") {
            price = 78.00 * quantity;
			return price;
        } else if (foodName == "Pizza") {
            price = 250.00 * quantity;
			return price;
        } else if (foodName == "Fries") {
            price = 60.00 * quantity;
			return price;
        } else if (foodName == "Pasta") {
            price = 180.00 * quantity;
			return price;
        } else if (foodName == "Tacos") {
            price = 120.00 * quantity;
			return price;
        } else if (foodName == "Hot Dog") {
            price = 90.00 * quantity;
			return price;
        } else if (foodName == "Sandwich") {
            price = 70.00 * quantity;
			return price;
        } else if (foodName == "Salad") {
            price = 110.00 * quantity;
			return price;
        } else if (foodName == "Wrap") {
            price = 130.00 * quantity;
			return price;
        } else if (foodName == "Biryani") {
            price = 200.00 * quantity;
			return price;
        } else if (foodName == "Noodles") {
            price = 150.00 * quantity;
			return price;
        } else if (foodName == "Paneer Butter Masala") {
            price = 190.00 * quantity;
			return price;
        } else if (foodName == "Chole Bhature") {
            price = 100.00 * quantity;
			return price;
        } else if (foodName == "Masala Dosa") {
            price = 80.00 * quantity;
			return price;
        } else if (foodName == "Idli Sambar") {
            price = 70.00 * quantity;
			return price;
        } else if (foodName == "Vada Pav") {
            price = 20.00 * quantity;
			return price;
        } else if (foodName == "Pav Bhaji") {
            price = 90.00 * quantity;
			return price;
        } else if (foodName == "Poha") {
            price = 50.00 * quantity;
			return price;
        } else if (foodName == "Upma") {
            price = 55.00 * quantity;
			return price;
        } else if (foodName == "Cutlet") {
            price = 45.00 * quantity;
			return price;
        } else if (foodName == "Kachori") {
            price = 30.00 * quantity;
			return price;
        } else if (foodName == "Samosa") {
            price = 25.00 * quantity;
			return price;
        } else if (foodName == "Dhokla") {
            price = 35.00 * quantity;
			return price;
        } else if (foodName == "Spring Roll") {
            price = 95.00 * quantity;
			return price;
        } else if (foodName == "Manchurian") {
            price = 105.00 * quantity;
			return price;
        } else if (foodName == "Fried Rice") {
            price = 140.00 * quantity;
			return price;
        } else if (foodName == "Hakka Noodles") {
            price = 145.00 * quantity;
			return price;
        } else if (foodName == "Gobi 65") {
            price = 115.00 * quantity;
			return price;
        } else if (foodName == "Veg Roll") {
            price = 90.00 * quantity;
			return price;
        } else if (foodName == "Pani Puri") {
            price = 20.00 * quantity;
			return price;
        }
        return price;
    }
	
}