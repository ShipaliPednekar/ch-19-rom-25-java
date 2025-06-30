class StockMarket {
public static void main(String[] args) {
  String stockNames[] = {
    "Reliance Industries",
    "Tata Consultancy Services (TCS)",
    "Infosys",
    "HDFC Bank",
    "ICICI Bank",
    "Bharti Airtel",
    "State Bank of India (SBI)",
    "Larsen & Toubro (L&T)",
    "Hindustan Unilever (HUL)",
    "Bajaj Finance"
  };
System.out.println("Names of Stock");
for(String stockName : stockNames){
	System.out.println(stockName);
}
  
    //System.out.println(stockNames[0] + ", " + stockNames[1] + ", " + stockNames[2] + ", " + stockNames[3] + ", " + stockNames[4]);
    //System.out.println(stockNames[5] + ", " + stockNames[6] + ", " + stockNames[7] + ", " + stockNames[8] + ", " + stockNames[9]);
  }
}
