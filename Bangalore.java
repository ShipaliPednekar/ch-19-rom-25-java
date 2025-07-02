class Bangalore {
	static String koramangala = "KORAMANGALA";
	static String whitefield = "WHITEFILED";
	
static String areaNames[] = {"koramangala","whitefield"};
public static void main(String[] args) {
	String koramangala = "KORAMANGALA";
	String whitefield = "WHITEFILED";
   String areaNames[] = {"koramangala","whitefield"};
   
   System.out.println("Main Started");
   System.out.println("The area names of bangalore are:" +areaNames.length);
   for(String areaName : areaNames)
	   System.out.println(areaName);
   
  System.out.println(areaNames[0] + " " + areaNames[1]);
  System.out.println("Main Ended");
}
}