class Policestation {

   static byte numberOfCells;
   static short yearsInService;
   static int totalCases;
   static long contactNumber;
   static float areaInSqKm;
   static double budget;
   static char grade; 
   static boolean isActive;
   static String noofConstable;
   static String location;
   static boolean isparkingavailable;
   static String Stationopening;
   static boolean iswaitingareaavailable;
   static int CCTV;
   static String stationName;
   static String officers;
   static int solvedCasesPerYear;
   static String establishedDate;
   static String inspectionDate;
   static String additionalNote;
  
public static void main(String[] args) {  

        System.out.println(" Police Station Information ");
        System.out.println("Name: " + stationName);
        System.out.println("Grade: " + grade);
        System.out.println("Years in Service: " + yearsInService);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Area (sq.km): " + areaInSqKm);
		System.out.println("Total no of CCTV: " + CCTV);
		System.out.println("Availabilty of waiting room: " + iswaitingareaavailable);
		System.out.println("Location of the Station: " + location);
        System.out.println("Active: " + isActive);
		System.out.println("Parking of vechiles: " + isparkingavailable);
		System.out.println("Total no of Constable: " + noofConstable);
        System.out.println("Budget: ₹" + budget);
        System.out.println("Total Cases: " + totalCases);
        System.out.println("Number of Cells: " + numberOfCells);
        System.out.println("Officers: " + officers);
        System.out.println("Solved Cases per Year: " + solvedCasesPerYear);
        System.out.println("Established: " + establishedDate);
        System.out.println("Next Inspection: " + inspectionDate);
        System.out.println("Additional Note: " + additionalNote);
		
    byte numberOfCells = 8;
    short yearsInService = 25;
    int totalCases = 1475;
    long contactNumber = 9876543210L;
    float areaInSqKm = 3.5f;
    double budget = 1540000.50;
    char grade = 'A'; 
    boolean isActive = true;
	String noofConstable="40";
	String location="MG road";
	boolean isparkingavailable=true;
	String Stationopening="24/7";
	boolean iswaitingareaavailable=true;
	int CCTV=10;
    String stationName = "MG Road Police Station";
    String officers = "ABC";
    int solvedCasesPerYear = 150;
    String establishedDate = "22-07-2024";
    String inspectionDate = "25-07-2024";
    String additionalNote = "Surveillance cameras installed";

        System.out.println(" Police Station Information ");
        System.out.println("Name: " + stationName);
        System.out.println("Grade: " + grade);
        System.out.println("Years in Service: " + yearsInService);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Area (sq.km): " + areaInSqKm);
		System.out.println("Total no of CCTV: " + CCTV);
		System.out.println("Availabilty of waiting room: " + iswaitingareaavailable);
		System.out.println("Location of the Station: " + location);
        System.out.println("Active: " + isActive);
		System.out.println("Parking of vechiles: " + isparkingavailable);
		System.out.println("Total no of Constable: " + noofConstable);
        System.out.println("Budget: ₹" + budget);
        System.out.println("Total Cases: " + totalCases);
        System.out.println("Number of Cells: " + numberOfCells);
        System.out.println("Officers: " + officers);
        System.out.println("Solved Cases per Year: " + solvedCasesPerYear);
        System.out.println("Established: " + establishedDate);
        System.out.println("Next Inspection: " + inspectionDate);
        System.out.println("Additional Note: " + additionalNote);
       
	}
 }

    