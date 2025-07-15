class UberEats {
    public static double takeOrder(String foodName) {
        double price = 0.0;
        if (foodName == "Ramen") {
            price = 250.00;
			return price;
        } else if (foodName == "Bibimbap") {
            price = 270.00;
			return price;
        } else if (foodName == "Okonomiyaki") {
            price = 290.00;
			return price;
        } else if (foodName == "Pho") {
            price = 220.00;return price;
        } else if (foodName == "Banh Mi") {
            price = 180.00;
			return price;
        } else if (foodName == "Pad Thai") {
            price = 230.00;
			return price;
        } else if (foodName == "Tom Yum") {
            price = 210.00;
			return price;
        } else if (foodName == "Sushi") {
            price = 320.00;
			return price;
        } else if (foodName == "Dim Sum") {
            price = 240.00;
			return price;
        } else if (foodName == "Khao Suey") {
            price = 250.00;
			return price;
        } else if (foodName == "Teriyaki Chicken") {
            price = 260.00;
			return price;
        } else if (foodName == "Yakitori") {
            price = 190.00;
			return price;
        } else if (foodName == "Miso Udon") {
            price = 210.00;
			return price;
        } else if (foodName == "Kimbap") {
            price = 200.00;
			return price;
        } else if (foodName == "Gyoza") {
            price = 170.00;
			return price;
        } else if (foodName == "Tempura") {
            price = 180.00;
			return price;
        } else if (foodName == "Laksa") {
            price = 230.00;
			return price;
        } else if (foodName == "Chicken Satay") {
            price = 160.00;
			return price;
        } else if (foodName == "Tteokbokki") {
            price = 220.00;
			return price;
        } else if (foodName == "Mochi") {
            price = 140.00;
			return price;
        } else if (foodName == "Daifuku") {
            price = 150.00;
			return price;
        } else if (foodName == "Halo-Halo") {
            price = 200.00;
			return price;
        } else if (foodName == "Chawanmushi") {
            price = 160.00;
			return price;
        } else if (foodName == "Sashimi") {
            price = 330.00;
			return price;
        } else if (foodName == "Bulgogi") {
            price = 270.00;
			return price;
        } else if (foodName == "Chimichanga") {
            price = 280.00;
			return price;
        } else if (foodName == "Tamale") {
            price = 240.00;
			return price;
        } else if (foodName == "Empanada") {
            price = 190.00;
			return price;
        } else if (foodName == "Arepa") {
            price = 220.00;
			return price;
        } else if (foodName == "Ceviche") {
            price = 250.00;
			return price;
        }
        return price;
    }
	 public static double takeOrder(String foodName,int quantity) {
        double price = 0.0;
        if (foodName == "Ramen") {
            price = 250.00 * quantity;
			return price;
        } else if (foodName == "Bibimbap") {
            price = 270.00 * quantity;
			return price;
        } else if (foodName == "Okonomiyaki") {
            price = 290.00 * quantity;
			return price;
        } else if (foodName == "Pho") {
            price = 220.00;return price;
        } else if (foodName == "Banh Mi") {
            price = 180.00 * quantity;
			return price;
        } else if (foodName == "Pad Thai") {
            price = 230.00 * quantity;
			return price;
        } else if (foodName == "Tom Yum") {
            price = 210.00 * quantity;
			return price;
        } else if (foodName == "Sushi") {
            price = 320.00 * quantity;
			return price;
        } else if (foodName == "Dim Sum") {
            price = 240.00 * quantity;
			return price;
        } else if (foodName == "Khao Suey") {
            price = 250.00 * quantity;
			return price;
        } else if (foodName == "Teriyaki Chicken") {
            price = 260.00 * quantity;
			return price;
        } else if (foodName == "Yakitori") {
            price = 190.00* quantity;
			return price;
        } else if (foodName == "Miso Udon") {
            price = 210.00 * quantity;
			return price;
        } else if (foodName == "Kimbap") {
            price = 200.00* quantity;
			return price;
        } else if (foodName == "Gyoza") {
            price = 170.00 * quantity; 
			return price;
        } else if (foodName == "Tempura") {
            price = 180.00 * quantity;
			return price;
        } else if (foodName == "Laksa") {
            price = 230.00 * quantity;
			return price;
        } else if (foodName == "Chicken Satay") {
            price = 160.00 * quantity;
			return price;
        } else if (foodName == "Tteokbokki") {
            price = 220.00 * quantity;
			return price;
        } else if (foodName == "Mochi") {
            price = 140.00 * quantity;
			return price;
        } else if (foodName == "Daifuku") {
            price = 150.00 * quantity;
			return price;
        } else if (foodName == "Halo-Halo") {
            price = 200.00* quantity;
			return price;
        } else if (foodName == "Chawanmushi") {
            price = 160.00 * quantity;
			return price;
        } else if (foodName == "Sashimi") {
            price = 330.00 * quantity;
			return price;
        } else if (foodName == "Bulgogi") {
            price = 270.00 * quantity;
			return price;
        } else if (foodName == "Chimichanga") {
            price = 280.00 * quantity;
			return price;
        } else if (foodName == "Tamale") {
            price = 240.00* quantity;
			return price;
        } else if (foodName == "Empanada") {
            price = 190.00 * quantity;
			return price;
        } else if (foodName == "Arepa") {
            price = 220.00* quantity;
			return price;
        } else if (foodName == "Ceviche") {
            price = 250.00 * quantity;
			return price;
        }
        return price;
    }
}
