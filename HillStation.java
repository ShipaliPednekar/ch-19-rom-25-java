class HillStation {
	
 public static void main(String[] args) {
  String resorts[] = {
    "The Himalayan Resort, Manali",
    "Club Mahindra, Munnar",
    "Sterling Ooty Elk Hill",
    "WelcomHeritage Kasmanda Palace, Mussoorie",
    "The Khyber Himalayan Resort, Gulmarg",
    "Forest Hills Resort, Coorg",
    "Ananda in the Himalayas, Rishikesh"};

 
    System.out.println("Top 7 Hill Station Resorts:");
	
	for(String resort : resorts){
		System.out.println(resort);
	}
		
    //System.out.println(resorts[0] + " " + resorts[1] + " " + resorts[2] + " " + resorts[3] + " " + resorts[4] + " " + resorts[5] + " " + resorts[6]);
  }
}
