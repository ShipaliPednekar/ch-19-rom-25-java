class Library {
	//static String tokillaMockingbird = "TO KILL MOCKING BIRD";
	//static String itendswithus = "IT END'S IT US";
	//static String prideandprejudice = "PRIDE AND PREJUDICE";
	//static String thgreatgats = "THE GREAT GATS ";
	//static String harrypotterandthesorcererstone = "HARRYPOTTER AND THE SORCERERS STONE";
	//static String thehobbit = "THE HOBBIT"; 
	//static String thealchemist= "THE ALCHEMIST";
	//static String thecatcherintherye = "THE CATCHER IN THE RYE";
	//static String bookNames[] = {"tokillaMockingbird","itendswithus","prideandprejudice","thgreatgats", "harrypotterandthesorcererstone","thehobbit","thealchemist","thecatcherintherye" };

public static void main(String[] args) {
	String tokillaMockingbird = "TO KILL MOCKING BIRD";
	String itendswithus = "IT END'S IT US";
	String prideandprejudice = "PRIDE AND PREJUDICE";
	String thgreatgats = "THE GREAT GATS ";
	String harrypotterandthesorcererstone = "HARRYPOTTER AND THE SORCERERS STONE";
	String thehobbit = "THE HOBBIT"; 
	String thealchemist= "THE ALCHEMIST";
	String thecatcherintherye = "THE CATCHER IN THE RYE";
   String bookNames[] = {"tokillaMockingbird","1984","prideandprejudice","thgreatgats", "harrypotterandthesorcererstone","thehobbit","thealchemist","thecatcherintherye" };

System.out.println("Main Started");   
System.out.println(" Books available in library " +bookNames.length);

for(String bookName : bookNames)
System.out.println(bookName);
    
    System.out.println(bookNames[0] + " " + bookNames[1] + " " + bookNames[2] + " " + bookNames[3] + " " + bookNames[4] + " " + bookNames[5] + " " + bookNames[6] + " " + bookNames[7]);
    System.out.println("Main Ended");  
  }
}
