class UberEatsRunner {
    public static void main(String[] args) {
        String foodName = "Ramen";
        double price = UberEats.takeOrder(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
		int quantity =3;
		double priceWithQuantity = UberEats.takeOrder(foodName,quantity);
		System.out.println("The price of " + foodName + " of quantity "  + quantity + " is " + priceWithQuantity);
    }
}
