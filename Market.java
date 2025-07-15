class Market {
    
    static String marketName;
    static String location;
    static byte openingHour;
    static short numberOfShops;
    static int dailyVisitors;
    static long registrationNumber;
    static float areaInAcres;
    static double monthlyRevenue;
    static char zoneCode;
    static boolean isOpen;
    static String mainProduct;
    static boolean hasParking;
    static int staffCount;
    static short securityLevel;
    static float gstRate;


    public String getMarketName() {
        return marketName;
    }
    public String getLocation(){
		return location;
	}
	
    public boolean getIsOpen() {
        return isOpen;
    }
	public int getStaffCount(){
		return staffCount;
	}
	public short getSecurityLevel(){
		return securityLevel;
	}
	public long getRegistrationNumber(){
		return registrationNumber;
	}

    public double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public int getDailyVisitors() {
        return dailyVisitors;
    }

    public byte getOpeningHour() {
        return openingHour;
    }

    public float getAreaInAcres() {
        return areaInAcres;
    }
}
