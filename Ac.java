class Ac{

static int currentTemperature;
static boolean isConnected;
static int maxTemperature=30;
static int minTemperature=0;

public static void onOrOff(){
     if(isConnected == false){
		isConnected = true;
		 System.out.println("The Ac is turned on");
	 }
	 else if(isConnected == true){
		 isConnected = false;
		 System.out.println("The Ac is turned off");
	 }
}

public static void increaseTemperature(){
   if(isConnected = true){
   
    if(currentTemperature < maxTemperature){
    currentTemperature = currentTemperature+ 1;
    System.out.println("The Current Temperature is : " +currentTemperature);
	}
	else
	{
		System.out.println("The Ac has reach its max temperature");
	}
   }
	else{
		System.out.println("Please turn on the Ac");
	}
   }	
public static void decreaseTemperature(){
	if(isConnected = true){
		if(currentTemperature > minTemperature){
			currentTemperature = currentTemperature- 1;
			System.out.println("The Current temperature is : " +currentTemperature);
		}
		else
		{
			System.out.println("The Ac has reached its min temperature : ");
		}
	}
		else
		{
			System.out.println("Please turn off the Ac");
		}
	}
}
	