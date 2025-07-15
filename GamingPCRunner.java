class GamingPCRunner {
    public static void main(String[] args) {

        GamingPC pc = new GamingPC();
      
        pc.brand = "Alienware";
        pc.processor = "Intel Core i9";
        pc.ramInGB = 32;
        pc.ssdInGB = 1024;
        pc.graphicsCardMemory = 8192;
        pc.serialNumber = 20250713777L;
        pc.cpuClockSpeed = 3.8f;
        pc.price = 159999.99;
        pc.performanceGrade = 'S';
        pc.isRGBEnabled = true;
        pc.cabinetColor = "Black + Neon Blue";
        pc.isAvailable = true;
        pc.usbPorts = 6;
        pc.fansCount = 4;
        pc.temperature = 38.6f;

        
        System.out.println("Brand  : " + pc.getBrand());
        System.out.println("Price : " + pc.getPrice());
        System.out.println("RGB Lighting  : " + pc.getIsRGBEnabled());
        System.out.println("Graphics Memory : " + pc.getGraphicsCardMemory());
        System.out.println("RAM Size : " + pc.getRamInGB());
        System.out.println("CPU Clock Speed : " + pc.getCpuClockSpeed());
    }
}
