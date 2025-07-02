class SocialMedia {
	static String facebook = "FACEBOOK";
	static String instagram = "INSTAGRAM";
	static String twitterx = "TWITTER(x)";
	static String snapchat = "SNAPCHAT";
	static String whatsapp = "WHAT'SAPP";
	static String youtube = "YOUTUBE";
	static String linkedin = "LINKEDIN";
	static String telegram = "TELEGRAM";
	static String pinterest = "PINTEREST";
	static String reddit = "REDDIT";
	
static String mediaNames[] = {"facebook","instagram","twitter(X)","snapchat","whatsApp","youTube","linkedin","telegram","pinterest","reddit"};	
 public static void main(String[] args) {
   String mediaNames[] = {"facebook","instagram","twitter(X)","snapchat","whatsApp","youTube","linkedIn","telegram","pinterest","reddit" };

    String facebook = "FACEBOOK";
	String instagram = "INSTAGRAM";
    String twitterx = "TWITTER(x)";
	String snapchat = "SNAPCHAT";
	String whatsapp = "WHAT'SAPP";
	String youtube = "YOUTUBE";
	String linkedin = "LINKEDIN";
	String telegram = "TELEGRAM";
	String pinterest = "PINTEREST";
	String reddit = "REDDIT";
	
System.out.println("Main Started");
System.out.println("Apps on Social Media" +mediaNames.length);

for(String mediaName : mediaNames){
System.out.println(mediaName);
 }
 
    System.out.println(mediaNames[0] + " " + mediaNames[1] + " " + mediaNames[2] + " " + mediaNames[3] + " " + mediaNames[4] + " " + mediaNames[5] + " " + mediaNames[6] + " " + mediaNames[7] + " " + mediaNames[8] + " " + mediaNames[9]);
    System.out.println("Main Ended");
  }
}
