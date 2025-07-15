class DominosRunner {
    public static void main(String[] args) {
        String foodName = "Cheesy Garlic Twist";
        double price = Dominos.takeOrder(foodName);
        System.out.println("The price of " + foodName + " is: ₹" + price);
    }
}
