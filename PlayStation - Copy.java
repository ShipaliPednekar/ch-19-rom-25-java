class PlayStation {
	//static String godofwar = "GOD OF WAR";
	//static String spiderman = "SPIDERMAN";
	//static String horizonzerodawn = "HORIZON ON ZERO DAWN";
	//static String thelastofus = "THE LAST OF US";
	//static String athiefsend= "A THIEF'S SEND";
	//static String granturismo = "GRANT TURISMO";
	//static String riftapart = "RIFT A PART";
	//static String ghostoftsushima = "GHOST OF TSUSHIMA";
	//static String demonsouls = "DEMON SOUL'S";
	//static String residentevilvillage = "RESIDENT EVIL VILLAGE";
	
	static String games[] = {"godofwar","spiderman","horizonzerodawn","thelastofus","athief'send","granturismo","riftapart","ghostoftsushima", "demon'ssouls", "residentevilvillage" };

public static void main(String[] args) {
	 String godofwar = "GOD OF WAR";
	 String spiderman = "SPIDERMAN";
	 String horizonzerodawn = "HORIZON ON ZERO DAWN";
	 String thelastofus = "THE LAST OF US";
	 String athiefsend= "A THIEF'S SEND";
	 String granturismo = "GRANT TURISMO";
	 String riftapart = "RIFT A PART";
	 String ghostoftsushima = "GHOST OF TSUSHIMA";
	 String demonsouls = "DEMON SOUL'S";
	 String residentevilvillage = "RESIDENT EVIL VILLAGE";
  String games[] = {"God of War","Spider-Man: Miles Morales","Horizon Zero Dawn","The Last of Us Part II","A Thief's End","Gran Turismo 7","Rift Apart","Ghost of Tsushima", "Demon's Souls", "Resident Evil Village" };

    System.out.println("Main Started");
    System.out.println("Top 10 PlayStation Games:" +games.length);
	for(String game : games)
		System.out.println(game);
	
    System.out.println(games[0] + "  " + games[1] + "  " + games[2] + "  " + games[3] + "  " + games[4] + "  " + games[5] + "  " + games[6] + "  " + games[7] + "  " + games[8] + "  " + games[9]);
    System.out.println("Main Ended");
  }
}
