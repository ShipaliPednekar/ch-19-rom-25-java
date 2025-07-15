class GoldRunner {
    public static void main(String[] args) {
        Gold g = new Gold();
       
        g.purityType = "24K";
        g.originCountry = "India";
        g.caratValue = 24;
        g.weightInGrams = 50;
        g.pricePerGram = 6000;
        g.certificateId = 987654321987L;
        g.makingCharges = 500.75f;
        g.totalPrice = 305000.50;
        g.qualityGrade = 'A';
        g.isHallmarked = true;
        g.jewellerName = "Tanishq";
        g.isAvailable = true;
        g.stockCount = 15;
        g.meltingPoint = 1064;
        g.gstRate = 3.0f;

        
        System.out.println("Purity Type : " + g.getPurityType());
        System.out.println("Price per Gram : " + g.getPricePerGram());
        System.out.println("Is Hallmarked : " + g.getIsHallmarked());
        System.out.println("Total Price : ₹" + g.getTotalPrice());
        System.out.println("Carat Value : " + g.getCaratValue());
        System.out.println("GST Rate : " + g.getGstRate());
		System.out.println("Melting Point: " + g.getMeltingPoint());
		System.out.println("Certificate Id : " + g.getCertificateId());
		System.out.println("Quality Grade : " + g.getQualityGrade());
		
    }
}
