class PeriodicTable {
	//static String hydrogen = "HYDROGEN";
	//static String helium = "HELIUM ";
	//static String lithium = "LITHIUM";
	//static String beryllium = "BERYLLIUM";
	//static String boron = "BORON";
	//static String carbon = "CARBON";
	//static String nitrogen = "NITROGEN";
	//static String oxygen = "OXYGEN";
	//static String fluorine = "FLUORINE";
	//static String neon = "NEON";
	//static String sodium = "SODIUM";
	//static String magnesium = "MAGNESIUM";
	
//static String elements[] = {"hydrogen", "helium", "lithium", "beryllium", "boron", "carbon", "nitrogen", "oxygen","fluorine", "neon", "sodium", "magnesium"};
public static void main(String[] args) {
	String hydrogen = "HYDROGEN";
	String helium = "HELIUM ";
	String lithium = "LITHIUM";
	String beryllium = "BERYLLIUM";
	String boron = "BORON";
	String carbon = "CARBON";
	String nitrogen = "NITROGEN";
	String oxygen = "OXYGEN";
	String fluorine = "FLUORINE";
	String neon = "NEON";
	String sodium = "SODIUM";
	String magnesium = "MAGNESIUM";
	
   String elements[] = {"hydrogen", "helium", "lithium", "beryllium", "boron", "carbon", "nitrogen", "oxygen","fluorine", "neon", "sodium", "magnesium"};

System.out.println("Main Started");
System.out.println(" Elements in the Periodic Table " + elements.length);

for(String element : elements)
System.out.println(element);

  
    System.out.println(elements[0] + " " + elements[1] + " " + elements[2] + " " + elements[3] + " " + elements[4] + " " + elements[5] + " " + elements[6] + " " + elements[7] + " " + elements[8] + " " + elements[9] + " " + elements[10] + " " + elements[11]);
    System.out.println("Main Ended");
 }
}
