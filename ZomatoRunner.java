class ZomatoRunner {
    public static void main(String[] args) {
        String foodName = "Chicken Biryani";
        double price = Zomato.takeOrder(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
		int quantity = 5;
		double priceWithQuantity = Zomato.takeOrder(foodName,quantity);
		System.out.println("The price of " + foodName + " of " + quantity + " is " +priceWithQuantity);
	}
}
