class DisneyLandRunner {
    public static void main(String[] args) {

        DisneyLand d = new DisneyLand();

       
        d.parkName = "Disneyland Paris";
        d.location = "France";
        d.numberOfZones = 5;
        d.numberOfRides = 50;
        d.dailyVisitors = 50000;
        d.parkId = 2025071312345L;
        d.entryFee = 89.99f;
        d.annualRevenue = 450000000.75;
        d.category = 'A';
        d.isOpen = true;
        d.mainAttraction = "Sleeping Beauty Castle";
        d.hasFireworks = true;
        d.staffCount = 1200;
        d.areaInAcres = 490;
        d.rating = 4.9f;

       
        System.out.println("Park Name  : " + d.getParkName());
        System.out.println("Daily Visitors : " + d.getDailyVisitors());
        System.out.println("Open Today : " + d.getIsOpen());
        System.out.println("Annual Revenue : " + d.getAnnualRevenue());
        System.out.println("Zones Available : " + d.getNumberOfZones());
        System.out.println("Customer Rating : " + d.getRating());
    }
}
