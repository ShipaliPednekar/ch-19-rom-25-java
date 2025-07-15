class RadioRunner {
    public static void main(String[] args) {
        Radio r = new Radio();

       
        r.brand = "Sony";
        r.type = "FM/AM";
        r.frequency = 102.5;
        r.volume = 8;
        r.power = true;
        r.color = "Black";
        r.bassLevel = 5;
        r.trebleLevel = 9;
        r.serialNumber = 1234567890123L;
        r.weight = 1.8f;
        r.qualityGrade = 'A';
        r.stationCount = 20;
        r.price = 2999.99;
        r.hasBluetooth = true;
        r.countryOfOrigin = "India";

        
        System.out.println("Brand: " + r.getBrand());
        System.out.println("Frequency: " + r.getFrequency());
        System.out.println("Volume: " + r.getVolume());
        System.out.println("Power On: " + r.getPowerStatus());
        System.out.println("Bass Level: " + r.getBassLevel());
        System.out.println("Quality Grade: " + r.getQualityGrade());
		System.out.println("Weight : " + r.getWeight());
		System.out.println("Serial Number : " + r.getSerialNumber());
		
    }
}
