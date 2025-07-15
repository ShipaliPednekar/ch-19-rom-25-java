class MakeupKitRunner {
    public static void main(String[] args) {

        MakeupKit m = new MakeupKit();

        m.brand = "Lakme";
        m.type = "All-in-One";
        m.itemsCount = 12;
        m.mirrorSize = 15;
        m.totalWeight = 500;
        m.productId = 202507131212L;
        m.discount = 10.5f;
        m.price = 1999.99;
        m.qualityGrade = 'A';
        m.isWaterproof = true;
        m.colorTheme = "Nude & Pink";
        m.isAvailable = true;
        m.shelfLifeInMonths = 24;
        m.pouchSize = 18;
        m.rating = 4.7f;

        System.out.println("Brand  : " + m.getBrand());
        System.out.println("Price : " + m.getPrice());
        System.out.println("Waterproof : " + m.getIsWaterproof());
        System.out.println("Total Weight : " + m.getTotalWeight());
        System.out.println("Items Included : " + m.getItemsCount());
        System.out.println("Rating : " + m.getRating());
    }
}
