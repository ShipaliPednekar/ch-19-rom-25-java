class MarketRunner {
    public static void main(String[] args) {

        Market m = new Market();

        m.marketName = "City Supermarket";
        m.location = "Downtown";
        m.openingHour = 9;
        m.numberOfShops = 120;
        m.dailyVisitors = 2500;
        m.registrationNumber = 20250713001L;
        m.areaInAcres = 2.5f;
        m.monthlyRevenue = 1750000.75;
        m.zoneCode = 'C';
        m.isOpen = true;
        m.mainProduct = "Groceries";
        m.hasParking = true;
        m.staffCount = 85;
        m.securityLevel = 5;
        m.gstRate = 18.0f;

        
        System.out.println("Market Name : " + m.getMarketName());
        System.out.println("Open Now : " + m.getIsOpen());
        System.out.println("Daily Visitors : " + m.getDailyVisitors());
        System.out.println("Monthly Revenue : " + m.getMonthlyRevenue());
        System.out.println("Opening Hour : " + m.getOpeningHour() + " AM");
        System.out.println("Area : " + m.getAreaInAcres());
		System.out.println("Registration Number : " +m.getRegistrationNumber());
		System.out.println("Location : " + m.getLocation());
		System.out.println("Security Level : " + m.getSecurityLevel());
		
    }
}
