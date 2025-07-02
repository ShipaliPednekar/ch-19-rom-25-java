class Ipl{
   
   //static String rcb = "RCB";
   //static String csk = "CSK";
   //static String mi = "MI";
   //static String rr = "RR";
   //static String dc = "DC";
   //static String kkr = "KKR";
   //static String gt = "GT";
   //static String lsg = "LSG";
   //static String pbks = "PBKS";
   //static String srh = "SRH";
  static String iplTeamNames[]={"rcb","csk","mi","rr","dc","kkr","gt","lsg","pbks","srh"};
  //static String iplTeamCaptain[]={"Rajat Patidar","Rohit Sharma"};

public static void main(String args[]){
	
    String rcb = "RCB";
    String csk = "CSK";
    String mi = "MI";
    String rr = "RR";
    String dc = "DC";
    String kkr = "KKR";
    String gt = "GT";
    String lsg = "LSG";
    String pbks = "PBKS";
    String srh = "SRH";
   
   System.out.println("Main started");
   System.out.println("Team" +iplTeamNames.length);
   
   for(String iplTeamName : iplTeamNames){
	   System.out.println(iplTeamName);
   }

  System.out.println(iplTeamNames[0] + " " + iplTeamNames[1] + " " + iplTeamNames[2] + " " + iplTeamNames[3] + " " + iplTeamNames[4] + " " + iplTeamNames[5] + " " + iplTeamNames[6] + " " + iplTeamNames[7] + " " +iplTeamNames[8] + " " +iplTeamNames[9]);
  
  System.out.println("Main Ended");
}

}  