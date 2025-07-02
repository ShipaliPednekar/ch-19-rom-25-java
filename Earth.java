class Earth {
	/*static String asia = "ASIA";
	static String africa = "AFRICA";
	static String northamerica = "NORTH AMERICA";
	static String southamerica = "SOUTH AMERICA";
	static String antarctica = "ANTARTICA";
	static String europe= "EUROPE";
	static String australia = "AUSTRALIA";	
    static String continents[] = {"asia", "africa", "northamerica", "southamerica", "antarctica","europe","australia"};*/

public static void main(String[] args) {
     String continents[] = {"asia", "africa", "northamerica", "southamerica", "antarctica","europe","australia"};
     String asia = "ASIA";
	 String africa = "AFRICA";
	 String northamerica = "NORTH AMERICA";
	 String southamerica = "SOUTH AMERICA";
	 String antarctica = "ANTARTICA";
	 String europe= "EUROPE";
	 String australia = "AUSTRALIA";	
   
   System.out.println("Main Started");
   System.out.println(" Earth " +continents.length);
   for(String continent : continents){
	   System.out.println(continent);
   }   
   
  
    System.out.println(continents[0] + " " + continents[1] + " " + continents[2] + " " + continents[3] + " " + continents[4] + " " + continents[5]);
    System.out.println("Main Ended");
	
  }
}
   
