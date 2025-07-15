class WalkieTalkieRunner {
    public static void main(String[] args) {
	
        WalkieTalkie w = new WalkieTalkie();

       
        w.brand = "Motorola";
        w.model = "T600";
        w.channelCount = 16;
        w.rangeInMeters = 500;
        w.frequency = 4625625;
        w.serialNumber = 202507131234L;
        w.batteryLevel = 85.5f;
        w.price = 3999.99;
        w.sizeCode = 'M';
        w.isOn = true;
        w.color = "Black & Green";
        w.isWaterResistant = true;
        w.volumeLevel = 7;
        w.antennaLength = 15;
        w.signalStrength = 4.8f;

       
        System.out.println("Brand  : " + w.getBrand());
        System.out.println("Frequency  : " + w.getFrequency());
        System.out.println("Power On  : " + w.getIsOn());
        System.out.println("Price  : ₹" + w.getPrice());
        System.out.println("Channel Count : " + w.getChannelCount());
        System.out.println("Signal Strength : " + w.getSignalStrength());
    }
}
