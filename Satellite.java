class Satellite {

   static byte numSolarPanels;
   static short orbitAltitudeKm;
   static int operationalDays;
   static long satelliteId;
   static float weightInTons;
   static double orbitSpeedKmph;
   static char orbitType; 
   static boolean isActive;
   static String satelliteName;
   static String instruments;
   static int signalStrength;
   static String launchDate;
   static String developedby;
   static String powersource;
   static String scientificsatellites;
   static String nextMaintenance;
   static String communicationsatellite;
   static String Lifespan;
   static String Antenna;
   static String emergencyNote;
   
public static void main(String[] Satellite) {   
   
       System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Satellite ID: " + satelliteId);
        System.out.println("Solar Panels: " + numSolarPanels);
        System.out.println("Orbit Altitude: " + orbitAltitudeKm + " km");
        System.out.println("Operational Days: " + operationalDays);
        System.out.println("Weight: " + weightInTons + " tons");
        System.out.println("Orbit Speed: " + orbitSpeedKmph + " km/h");
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Is Active: " + isActive);
		System.out.println("Life Span: " + Lifespan);
		System.out.println("Use of Antenna: " + Antenna );
		System.out.println("Developer: " + developedby );
		System.out.println("Power Source: " + powersource);
		System.out.println("Strength of the signal: " + signalStrength);
		System.out.println("Instruments: " + instruments);
		System.out.println("Scientific Satellites: " + scientificsatellites);
        System.out.println("Communication Satellite: " + communicationsatellite);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Next Maintenance: " + nextMaintenance);
        System.out.println("Emergency Note: " + emergencyNote);
        
	
	
	byte numSolarPanels = 4;
    short orbitAltitudeKm = 500;
    int operationalDays = 1095;
    long satelliteId = 112233445566L;
    float weightInTons = 1.25f;
    double orbitSpeedKmph = 27600.5;
    char orbitType = 'L'; 
    boolean isActive = true;
    String satelliteName = "INSAT-3DR";
    String instruments = "Imager";
    int signalStrength = 80;
    String launchDate = "01-03-2003";
	String developedby="XYZ";
	String powersource="Mainly Solar panels by batery backup";
	String scientificsatellites="Used for space observations";
    String nextMaintenance = "10-11-2005";
	String communicationsatellite="Used of Telephone and internet and Telivisions";
	String Lifespan="Usually from 5 to 15 years";
	String Antenna="For receiving and transmitting signals";
    String emergencyNote = "Battery overheating detected";
	
	
        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Satellite ID: " + satelliteId);
        System.out.println("Solar Panels: " + numSolarPanels);
        System.out.println("Orbit Altitude: " + orbitAltitudeKm + " km");
        System.out.println("Operational Days: " + operationalDays);
        System.out.println("Weight: " + weightInTons + " tons");
        System.out.println("Orbit Speed: " + orbitSpeedKmph + " km/h");
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Is Active: " + isActive);
		System.out.println("Life Span: " + Lifespan);
		System.out.println("Use of Antenna: " + Antenna );
		System.out.println("Developer: " + developedby );
		System.out.println("Power Source: " + powersource);
		System.out.println("Strength of the signal: " + signalStrength);
		System.out.println("Instruments: " + instruments);
		System.out.println("Scientific Satellites: " + scientificsatellites);
        System.out.println("Communication Satellite: " + communicationsatellite);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Next Maintenance: " + nextMaintenance);
        System.out.println("Emergency Note: " + emergencyNote);
        
  
    }

   
  }