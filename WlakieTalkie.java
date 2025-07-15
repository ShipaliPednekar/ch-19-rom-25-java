class WalkieTalkie {
    
    static String brand;
    static String model;
    static byte channelCount;
    static short rangeInMeters;
    static int frequency;
    static long serialNumber;
    static float batteryLevel;
    static double price;
    static char sizeCode;
    static boolean isOn;
    static String color;
    static boolean isWaterResistant;
    static int volumeLevel;
    static short antennaLength;
    static float signalStrength;

    public String getBrand() {
        return brand;
    }

    public int getFrequency() {
        return frequency;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public double getPrice() {
        return price;
    }

    public byte getChannelCount() {
        return channelCount;
    }

    public float getSignalStrength() {
        return signalStrength;
    }
}
