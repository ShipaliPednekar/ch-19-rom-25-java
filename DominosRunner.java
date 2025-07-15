class DominosRunner {
    public static void main(String[] args) {
        String foodName = "Cheesy Garlic Twist";
        double price = Dominos.takeOrder(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
		int quantity=4;
		double priceWithQuantity = Dominos.takeOrder(foodName,quantity);
		System.out.println("The Price of " + foodName + " of quantity " + quantity + " is " + priceWithQuantity);
     }
}
