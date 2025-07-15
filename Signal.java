class Signal {
   
    static String signalType;
    static byte strengthLevel;
    static short range;
    static int frequency;
    static long id;
    static float voltage;
    static double power;
    static char grade;
    static boolean isActive;
    static String provider;
    static boolean isEncrypted;
    static int signalCount;
    static short bandwidth;
    static float temperature;
    static double noiseRatio;


    public String getSignalType() {
        return signalType;
    }

    public byte getStrengthLevel() {
        return strengthLevel;
    }
	public int getFrequency(){
		return frequency;
	}
	public long getID(){
	return id;
	}
	public short getBandwidth(){
		return bandwidth;
	}
	public int getSignalCount(){
		return signalCount;
	}

    public boolean getIsActive() {
        return isActive;
    }

    public double getPower() {
        return power;
    }

    public char getGrade() {
        return grade;
    }

    public float getVoltage() {
        return voltage;
    }
}
