public class GardenRunner {
    public static void main(String[] args) {

        Garden g = new Garden();
       
        g.name = "Rosewood Garden";
        g.location = "Hill View Road";
        g.treeCount = 40;
        g.flowerCount = 500;
        g.areaInSqMeters = 1500;
        g.registrationId = 202507131001L;
        g.temperature = 26.5f;
        g.maintenanceCost = 75000.75;
        g.zoneCode = 'B';
        g.isPublic = true;
        g.mainAttraction = "Rose Pavilion";
        g.hasFountain = true;
        g.benchCount = 25;
        g.gardenerCount = 4;
        g.humidityLevel = 60.5f;

        
        System.out.println("Garden Name : " + g.getName());
        System.out.println("Area : " + g.getAreaInSqMeters());
        System.out.println("Open to Public : " + g.getIsPublic());
        System.out.println("Maintenance Cost : ₹" + g.getMaintenanceCost());
        System.out.println("Tree Count  : " + g.getTreeCount());
        System.out.println("Humidity Level : " + g.getHumidityLevel());
    }
}
