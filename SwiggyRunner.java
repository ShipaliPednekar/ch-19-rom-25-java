class SwiggyRunner {
    public static void main(String[] args) {
        String foodName = "Paneer Butter Masala";
        double price = Swiggy.takeOrder(foodName);
        System.out.println("The price of " + foodName + " is: ₹" + price);
    }
}
