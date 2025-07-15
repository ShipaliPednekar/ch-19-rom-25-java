class UberEatsRunner {
    public static void main(String[] args) {
        String foodName = "Ramen";
        double price = UberEats.takeOrder(foodName);
        System.out.println("The price of " + foodName + " is: ₹" + price);
    }
}
