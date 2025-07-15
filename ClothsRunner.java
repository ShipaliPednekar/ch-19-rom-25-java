class ClothsRunner {
    public static void main(String[] args) {


        Cloths c = new Cloths();

        c.brand = "Nike";
        c.type = "T-Shirt";
        c.sizeCode = 2;
        c.length = 75;
        c.price = 1299;
        c.productId = 987654321234L;
        c.weight = 0.25f;
        c.discountPercent = 15.5;
        c.categoryCode = 'M';
        c.isAvailable = true;
        c.color = "Black";
        c.isCotton = true;
        c.stockQuantity = 50;
        c.sleeveLength = 25;
        c.rating = 4.3f;

       
        System.out.println("Brand : " + c.getBrand());
        System.out.println("Price : " + c.getPrice());
        System.out.println("Available : " + c.getIsAvailable());
        System.out.println("Discount  : " + c.getDiscountPercent());
        System.out.println("Size Code : " + c.getSizeCode());
        System.out.println("Customer Rating  : " + c.getRating());
		System.out.println("Product ID : " + c.getProductId());
		System.out.println("SleeveLength : " +c.getSleeveLength());
    }
}
