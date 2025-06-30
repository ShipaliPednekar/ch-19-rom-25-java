class Desktop {

     
	static byte usbPorts;
    static short ramGB;
    static int storageGB;
    static long serialNumber;
    static float screenSizeInches;
    static double price;
    static char processorType; 
    static boolean hasSSD;
    static String graphicscard;
	static String Optionaldrive;
	static int mouse;
	static int keyboard;
	static String CoolingSystem;
	static String SSD;
	static String Operatingsystem;
    static String brand = "HP";
    static String installedSoftware;
    static int usagePerDayHours;
    static String purchaseDate;
    static String warrantyExpiry;
    static String remarks;
	 
public static void main(String[] args) {
	
	 byte usbPorts = 6;
     short ramGB = 16;
     int storageGB = 1024;
     long serialNumber = 123456789012L;
     float screenSizeInches = 24.5f;
     double price = 55999.99;
     char processorType = 'i'; 
     boolean hasSSD = true;
     String graphicscard="For gaming";
	 String Optionaldrive="DVD's";
	 int mouse=1;
	 int keyboard=1;
	 String CoolingSystem="Fans or liquid cooling";
	 String SSD="256GB";
	 String Operatingsystem="Windows";
     String brand = "HP";
     String installedSoftware = "Windows 11";
     int usagePerDayHours = 3;
     String purchaseDate = "21-06-2025";
     String warrantyExpiry = "22-06-2029";
     String remarks = "Used for development";
   

        System.out.println("Desktop Information");
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number : " + serialNumber);
		System.out.println("Mouse: " + mouse);
		System.out.println("keyboard: " + keyboard);
        System.out.println("USB Ports : " + usbPorts);
		System.out.println("OperatingSystem: " + Operatingsystem);
		System.out.println("CoolingSystem: " + CoolingSystem);
		System.out.println("SSD's: " + SSD);
		System.out.println("Graphics Card: " + graphicscard);
        System.out.println("RAM : " + ramGB + " GB");
        System.out.println("Storage : " + storageGB + " GB");
        System.out.println("Screen Size : " + screenSizeInches + " inches");
        System.out.println("Price : ₹" + price);
        System.out.println("Processor Type : " + processorType);
        System.out.println("Has SSD : " + hasSSD);
        System.out.println("Installed Software : " + installedSoftware);
        System.out.println("Usage Per Day : " + usagePerDayHours);
        System.out.println("Purchase Date : " + purchaseDate);
        System.out.println("Warranty Expiry : " + warrantyExpiry);
        
    }

  }