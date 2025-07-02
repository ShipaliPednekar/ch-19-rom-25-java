class Bar {
	//static String whiskey ="WHISKEY";
	//static String vodka = "VODKA";
	//static String rum = "RUM";
	//static String gin = "GIN";
	//static String tequila = "TEQUILA";
	//static String brandy = "BRANDY";
	//static String beer = "BEER";
	//static String wine = "WINE";
	//static String scotch = "SCOTCH";
	//static String cognac = "COGNAC";
	//static String champagne = "CHAMPAGNE";
	//static String absinthe = "ABSINTHE";
	
	//static String alcoholNames[] = {
    //"whiskey",
    //"vodka",
    //"rum",
    //"gin",
    //"tequila",
    //"brandy",
    //"beer",
    //"wine",
    //"scotch",
    //"cognac",
    //"champagne",
    //"absinthe"};

public static void main(String[] args) {
	String whiskey ="WHISKEY";
	String vodka = "VODKA";
	String rum = "RUM";
	String gin = "GIN";
	String tequila = "TEQUILA";
	String brandy = "BRANDY";
	String beer = "BEER";
	String wine = "WINE";
	String scotch = "SCOTCH";
	String cognac = "COGNAC";
	String champagne = "CHAMPAGNE";
	String absinthe = "ABSINTHE";
	
   String alcoholNames[] = {
    "whiskey",
    "vodka",
    "rum",
    "gin",
    "tequila",
    "brandy",
    "beer",
    "wine",
    "scotch",
    "cognac",
    "champagne",
    "absinthe"
  };
System.out.println("Main Started");
System.out.println("Alcohol Shop" +alcoholNames.length);


for(String alcoholName : alcoholNames)
System.out.println(alcoholName);

   System.out.println(alcoholNames[0] + " " + alcoholNames[1] + " " + alcoholNames[2] + " " + alcoholNames[3] + " " + alcoholNames[4] + " " + alcoholNames[5] + " " + alcoholNames[6] + " " + alcoholNames[7] + " " + alcoholNames[8] + " " + alcoholNames[9] + " " + alcoholNames[10] + " " + alcoholNames[11]);
   System.out.println("Main Ended");
  }
}
