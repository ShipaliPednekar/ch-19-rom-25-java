class AppStore {
	/*static String whatsapp = "WHAT'SAPP";
	static String instagram = "INSTAGRAM";
	static String facebook = "FACEBOOK";
	static String youtube = "YOUTUBE";
	static String snapchat = "SNAPCHAT";
	static String spotify = "SPOTIFY";
	static String amazon = "AMAZON";
	static String googlemaps = "GOOGLEMAPS";
	static String zoom = "ZOOM";
	static String netflix = "NETFLIX";
	static String appNames[] = {"whatsApp","instagram","facebook","youTube","snapchat","spotify","amazon","googlemaps","zoom","netflix"};*/
	

public static void main(String[] args) {
	String whatsapp = "WHAT'SAPP";
    String instagram = "INSTAGRAM";
	String facebook = "FACEBOOK";
	String youtube = "YOUTUBE";
	String snapchat = "SNAPCHAT";
	String spotify = "SPOTIFY";
	String amazon = "AMAZON";
	String googlemaps = "GOOGLEMAPS";
	String zoom = "ZOOM";
	String netflix = "NETFLIX";
	
  
  String appNames[] = {"whatsApp","instagram","facebook","youTube","snapchat","spotify","amazon","google maps","zoom","netflix"};

    System.out.println("Main Started");
    System.out.println("Top 10 Apps on PlayStore:" +appNames.length);
	for(String appName : appNames){
		System.out.println(appName);
	}
    System.out.println(appNames[0] + "  " + appNames[1] + "  " + appNames[2] + "  " + appNames[3] + "  " + appNames[4] + "  " + appNames[5] + "  " + appNames[6] + "  " + appNames[7] + "  " + appNames[8] + "  " + appNames[9]);
    System.out.println("Main Ended");
  }
}
