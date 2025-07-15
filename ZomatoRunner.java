class ZomatoRunner {
    public static void main(String[] args) {
        String foodName = "Chicken Biryani";
        double price = Zomato.takeOrder(foodName);
        System.out.println("The price of " + foodName + " is: ₹" + price);
    }
}
