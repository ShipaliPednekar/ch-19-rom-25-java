class TyreRunner {
    public static void main(String[] args) {

        Tyre t = new Tyre();

        t.brand = "Michelin";
        t.type = "All-Season";
        t.plyRating = 4;
        t.diameter = 16;
        t.maxLoad = 615;
        t.serialNumber = 20250713888L;
        t.treadDepth = 8.5f;
        t.price = 7499.99;
        t.qualityGrade = 'A';
        t.isTubeless = true;
        t.size = "205/55R16";
        t.isRadial = true;
        t.warrantyYears = 5;
        t.sidewallHeight = 55;
        t.pressure = 32.0f;

        
        System.out.println("Brand   : " + t.getBrand());
        System.out.println("Price   : " + t.getPrice());
        System.out.println("Tubeless  : " + t.getIsTubeless());
        System.out.println("Max Load  : " + t.getMaxLoad());
        System.out.println("Ply Rating  : " + t.getPlyRating());
        System.out.println("Recommended PSI : " + t.getPressure());
    }
}
