class RiverRunner {
    public static void main(String[] args) {

        River r = new River();

        r.name = "Ganga";
        r.origin = "Gangotri Glacier";
        r.pollutionLevel = 3;
        r.depth = 60;
        r.length = 2525;
        r.riverCode = 20250713999L;
        r.flowRate = 12.4f;
        r.waterVolume = 5_600_000.50;
        r.qualityGrade = 'B';
        r.isNavigable = true;
        r.country = "India";
        r.isPerennial = true;
        r.tributariesCount = 25;
        r.width = 300;
        r.temperature = 18.5f;

        System.out.println("River Name : " + r.getName());
        System.out.println("Length : " + r.getLength());
        System.out.println("Navigable : " + r.getIsNavigable());
        System.out.println("Water Volume : " + r.getWaterVolume());
        System.out.println("Pollution Level : " + r.getPollutionLevel());
        System.out.println("Water Temperature : " + r.getTemperature());
    }
}
