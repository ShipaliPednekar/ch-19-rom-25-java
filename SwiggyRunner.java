class SwiggyRunner {
    public static void main(String[] args) {
        String foodName = "Paneer Butter Masala";
        double price = Swiggy.search(foodName);
		 System.out.println("The price of " + foodName + " is: " + price);
		 int quantity =3;
		 double priceWithQuantity = Swiggy.search(foodName,quantity);
        System.out.println("The price of " + foodName + " with quantity : "  + quantity + " is " + priceWithQuantity);
    }
}
