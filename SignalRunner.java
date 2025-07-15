class SignalRunner {
    public static void main(String[] args) {

        Signal s = new Signal();

        s.signalType = "4G LTE";
        s.strengthLevel = 4;
        s.range = 300;
        s.frequency = 1800;
        s.id = 9876543210L;
        s.voltage = 3.3f;
        s.power = 5.5;
        s.grade = 'A';
        s.isActive = true;
        s.provider = "Jio";
        s.isEncrypted = false;
        s.signalCount = 8;
        s.bandwidth = 120;
        s.temperature = 35.5f;
        s.noiseRatio = 1.05;

        System.out.println("Signal Type : " + s.getSignalType());
        System.out.println("Strength Level : " + s.getStrengthLevel());
        System.out.println("Active Status  : " + s.getIsActive());
        System.out.println("Signal Power : " + s.getPower());
        System.out.println("Signal Grade : " + s.getGrade());
        System.out.println("Voltage  : " + s.getVoltage());
		System.out.println("Frequency : " + s.getFrequency());
		System.out.println("ID : " + s.getID());
		System.out.println("Bandwidth : " + s.getBandwidth());
		System.out.println("Signal Count : " + s.getSignalCount());
    }
}
