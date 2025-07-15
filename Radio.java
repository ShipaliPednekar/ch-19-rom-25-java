class Radio {
   
    static String brand;
    static String type;
    static double frequency;
    static int volume;
    static boolean power;
    static String color;
    static byte bassLevel;
    static short trebleLevel;
    static long serialNumber;
    static float weight;
    static char qualityGrade;
    static int stationCount;
    static double price;
    static boolean hasBluetooth;
    static String countryOfOrigin;

    
    public String getBrand() {
        return brand;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getPowerStatus() {
        return power;
    }

    public byte getBassLevel() {
        return bassLevel;
    }

    public char getQualityGrade() {
        return qualityGrade;
    }
	public float getWeight(){
		return weight;
	}
	public long getSerialNumber(){
		return serialNumber;
	}
}
