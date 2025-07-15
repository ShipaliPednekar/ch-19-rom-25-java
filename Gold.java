class Gold {
    
    static String purityType;
    static String originCountry;
    static byte caratValue;
    static short weightInGrams;
    static int pricePerGram;
    static long certificateId;
    static float makingCharges;
    static double totalPrice;
    static char qualityGrade;
    static boolean isHallmarked;
    static String jewellerName;
    static boolean isAvailable;
    static int stockCount;
    static short meltingPoint;
    static float gstRate;

   
    public String getPurityType() {
        return purityType;
    }

    public int getPricePerGram() {
        return pricePerGram;
    }
	public short getMeltingPoint(){
	return meltingPoint;
	}
	
	public long getCertificateId(){
	return certificateId;
	}
	
	public char getQualityGrade(){
	return qualityGrade;
	}

    public boolean getIsHallmarked() {
        return isHallmarked;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public byte getCaratValue() {
        return caratValue;
    }

    public float getGstRate() {
        return gstRate;
    }
}
