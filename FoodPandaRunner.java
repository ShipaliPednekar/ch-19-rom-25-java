class FoodPandaRunner {
    public static void main(String[] args) {
        String foodName = "Avocado Toast";
        double price = FoodPanda.takeOrder(foodName);
        System.out.println("The price of " + foodName + " is: ₹" + price);
    }
}
