class TailorRunner {
    public static void main(String[] args) {

        Tailor t = new Tailor();
       
        t.name = "Ramesh Kumar";
        t.shopName = "Perfect Fit Tailors";
        t.experienceYears = 15;
        t.numberOfOrders = 25;
        t.dailyIncome = 4500;
        t.contactNumber = 9876543210L;
        t.rating = 4.6f;
        t.totalEarnings = 1250000.50;
        t.stitchingGrade = 'A';
        t.isAvailable = true;
        t.specialization = "Men's Suits";
        t.takesOnlineOrders = true;
        t.totalClients = 350;
        t.openingHour = 9;
        t.fabricUsage = 12.5f;

        
        System.out.println("Tailor Name : " + t.getName());
        System.out.println("Daily Income : " + t.getDailyIncome());
        System.out.println("Currently Working : " + t.getIsAvailable());
        System.out.println("Total Earnings : " + t.getTotalEarnings());
        System.out.println("Experience : " + t.getExperienceYears());
        System.out.println("Customer Rating : " + t.getRating());
    }
}
