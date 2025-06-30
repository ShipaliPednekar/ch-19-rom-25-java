class Court {
	
   static byte courtRooms;
   static short workingHours;
   static int totalCases;
   static long courtId;
   static float areaInAcres;
   static double budget;
   static char courtGrade; 
   static boolean isOnlineFilingAvailable;
   static int noofworkinghours;
   static int totalnooflawyers;
   static String SupremeCourt;
   static String Specializedcourt;
   static String lawyername;
   static long helplineno;
   static String courtName;
   static String judges;
   static int casesPerMonth;
   static String establishedDate;
   static String nextHearing;
   static String remarks;
   
public static void main(String[] args) {
	    System.out.println(" Court Information ");
        System.out.println("Court Name: " + courtName);
        System.out.println("Court ID: " + courtId);
        System.out.println("Total Cases: " + totalCases);
		System.out.println("Total no of Lawyers: " + totalnooflawyers);
        System.out.println("Court Rooms: " + courtRooms);
		System.out.println("No of Working Hours: " + noofworkinghours);
		System.out.println("Lawyer Name: " + lawyername);
		System.out.println("Contact us: " + helplineno);
		System.out.println("Specialization of the Court: " + Specializedcourt);
        System.out.println("Working Hours/Day: " + workingHours);
        System.out.println("Area: " + areaInAcres + " acres");
        System.out.println("Budget: ₹" + budget);
        System.out.println("Court Grade: " + courtGrade);
        System.out.println("Online Filing Available: " + isOnlineFilingAvailable);
        System.out.println("Judges: " + judges);
        System.out.println("Cases Per Month: " + casesPerMonth);
        System.out.println("Established Date: " + establishedDate);
        System.out.println("Next Hearing Date: " + nextHearing);
        System.out.println("Remarks: " + remarks);
	
	courtRooms = 6;
    workingHours = 8;
    totalCases = 3200;
    courtId = 20240621123L;
    areaInAcres = 4.75f;
    budget = 87500000.25;
    courtGrade = 'A';
    isOnlineFilingAvailable = true;
	noofworkinghours=8;
	totalnooflawyers=30;
	SupremeCourt="Highest Court in Country";
	Specializedcourt="Family courts and consumer court";
	lawyername="PQR";
	helplineno=9876543210L;
    courtName = "High Court of Bangalore";
    judges = "ABC";
    casesPerMonth = 295;
    establishedDate = "22-06-2025";
    nextHearing = "27-06-2025";
    remarks = "Renovation completed recently";

   
        System.out.println(" Court Information ");
        System.out.println("Court Name: " + courtName);
        System.out.println("Court ID: " + courtId);
        System.out.println("Total Cases: " + totalCases);
		System.out.println("Total no of Lawyers: " + totalnooflawyers);
        System.out.println("Court Rooms: " + courtRooms);
		System.out.println("No of Working Hours: " + noofworkinghours);
		System.out.println("Lawyer Name: " + lawyername);
		System.out.println("Contact us: " + helplineno);
		System.out.println("Specialization of the Court: " + Specializedcourt);
        System.out.println("Working Hours/Day: " + workingHours);
        System.out.println("Area: " + areaInAcres + " acres");
        System.out.println("Budget: ₹" + budget);
        System.out.println("Court Grade: " + courtGrade);
        System.out.println("Online Filing Available: " + isOnlineFilingAvailable);
        System.out.println("Judges: " + judges);
        System.out.println("Cases Per Month: " + casesPerMonth);
        System.out.println("Established Date: " + establishedDate);
        System.out.println("Next Hearing Date: " + nextHearing);
        System.out.println("Remarks: " + remarks);
	}
}

   