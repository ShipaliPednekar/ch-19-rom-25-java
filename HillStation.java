class HillStation {
	//static String theHimalayanResortManali = "THE HIMALAYAN RESORT-MANALI";
	//static String clubMahindraMunnar = "CLUB MAHINDRA-MUNNAR";
	//static String sterlingOotyElkHill = "STERLLING-OOTY ELK HILL";
	//static String welcomHeritageKasmandaPalaceMussoorie = "WELCOME HERITAGE KASMANDA PALACE-MUSSOORIE";
	//static String theKhyberHimalayanResortGulmarg = "THE KYBER HIMALAYAN RESORT GULMARG";
	//static String forestHillsResortCoorg = "FOREST HILL RESORT COORG";
	//static String anandaintheHimalayasRishikesh = "ANANDA IN THE HIMALAYAS-RISHIKESH";
	
//static String resorts[] = {
    //"theHimalayanResortManali",
    //"clubMahindraMunnar",
    ///"sterlingOotyElkHill",
    //"welcomHeritageKasmandaPalaceMussoorie",
    //"theKhyberHimalayanResortGulmarg",
    //"forestHillsResortCoorg",
    //"anandaintheHimalayasRishikesh"};
	
public static void main(String[] args) {
		String theHimalayanResortManali = "THE HIMALAYAN RESORT-MANALI";
	    String clubMahindraMunnar = "CLUB MAHINDRA-MUNNAR";
	    String sterlingOotyElkHill = "STERLLING-OOTY ELK HILL";
	    String welcomHeritageKasmandaPalaceMussoorie = "WELCOME HERITAGE KASMANDA PALACE-MUSSOORIE";
	    String theKhyberHimalayanResortGulmarg = "THE KYBER HIMALAYAN RESORT GULMARG";
	    String forestHillsResortCoorg = "FOREST HILL RESORT COORG";
	    String anandaintheHimalayasRishikesh = "ANANDA IN THE HIMALAYAS-RISHIKESH";

  String resorts[] = {
    "theHimalayanResortManali",
    "clubMahindraMunnar",
    "sterlingOotyElkHill",
    "welcomHeritageKasmandaPalaceMussoorie",
    "theKhyberHimalayanResortGulmarg",
    "forestHillsResortCoorg",
    "anandaintheHimalayasRishikesh"};

    System.out.println("Main Started");
    System.out.println("Top 7 Hill Station Resorts:" +resorts.length);
	
	for(String resort : resorts)
		System.out.println(resort);
	
		
   System.out.println(resorts[0] + " " + resorts[1] + " " + resorts[2] + " " + resorts[3] + " " + resorts[4] + " " + resorts[5] + " " + resorts[6]);
   System.out.println("Main Ended");
  }
}
