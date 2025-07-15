class Cloths {
   
    static String brand;
    static String type;
    static byte sizeCode;
    static short length;
    static int price;
    static long productId;
    static float weight;
    static double discountPercent;
    static char categoryCode;
    static boolean isAvailable;
    static String color;
    static boolean isCotton;
    static int stockQuantity;
    static short sleeveLength;
    static float rating;

    

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public byte getSizeCode() {
        return sizeCode;
    }
	public short getSleeveLength(){
		return sleeveLength;
	}
	public long getProductId() {
		return productId;
	}

    public float getRating() {
        return rating;
    }
}
