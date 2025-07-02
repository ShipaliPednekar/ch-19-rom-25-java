class StockMarket {
	//static String relianceindustries = "RELIANCE INDUSTRIES";
	//static String tataconsultancyservices = "TATA CONSULTANCY SERVICES (TCS)";
	//static String infosys = "INFOSYS";
	//static String hdfcCbank = "HDFC BANK";
	//static String icicibank = "ICICI BANK";
	//static String bhartiairtel = "BHARTI AIRTEL";
	//static String statebankofindia = "STATE BANK OF INDIA (SBI)";
	//static String larsenandtoubro = "LARSEN AND TOURBO";
	//static String hindustanilever = "HINDUSTANI LEVER";
	//static String bajajfinance = "BAJAJ FINANCE";
	
/* static String stockNames[] = {
    "relianceindustries",
    "tataconsultancyservices",
    "infosys",
    "hdfcCbank",
    "icicibank",
    "bhartiairtel",
    "statebankofindia",
    "larsenandtoubro",
    "hindustanunilever",
    "bajajfinance"}; */
	
public static void main(String[] args) {
	String relianceindustries = "RELIANCE INDUSTRIES";
	String tataconsultancyservices = "TATA CONSULTANCY SERVICES (TCS)";
	String infosys = "INFOSYS";
	String hdfcCbank = "HDFC BANK";
	String icicibank = "ICICI BANK";
	String bhartiairtel = "BHARTI AIRTEL";
	String statebankofindia = "STATE BANK OF INDIA (SBI)";
	String larsenandtoubro = "LARSEN AND TOURBO";
	String hindustanilever = "HINDUSTANI LEVER";
	String bajajfinance = "BAJAJ FINANCE";
  String stockNames[] = {
    "relianceindustries",
    "tataconsultancyservices",
    "infosys",
    "hdfcbank",
    "icicibank",
    "bhartiairtel",
    "statebankofindia",
    "larsenandtoubro",
    "hindustanunilever",
    "bajajfinance"};

System.out.println("Main Started");	
System.out.println(" Names of Stock " +stockNames.length);
for(String stockName : stockNames)
	System.out.println(stockName);

  
    System.out.println(stockNames[0] + ", " + stockNames[1] + ", " + stockNames[2] + ", " + stockNames[3] + ", " + stockNames[4]);
    System.out.println(stockNames[5] + ", " + stockNames[6] + ", " + stockNames[7] + ", " + stockNames[8] + ", " + stockNames[9]);
    System.out.println("Main Ended");
  }
}
