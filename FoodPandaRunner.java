class FoodPandaRunner {
    public static void main(String[] args) {
        String foodName = "Avocado Toast";
        double price = FoodPanda.takeOrder(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
		int quantity =8;
		double priceWithQuantity = FoodPanda.takeOrder(foodName,quantity);
		System.out.println("The Price of " + foodName + " of quantity " + quantity + " is " + priceWithQuantity); 
    }
}
