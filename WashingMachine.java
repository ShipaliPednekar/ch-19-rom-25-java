class WashingMachine{

static int currentSpeed;
static boolean isConnected;
static int maxSpeed=20;
static int minSpeed=0;

public static void onOrOff(){
     if(isConnected == false){
		 isConnected = true;
		 System.out.println("The washing machine is turned on");
	 }
	 else if(isConnected == true){
			 isConnected = false;
			 System.out.println("The washing machine is turned off");
		 }
	 }
	 
public static void increaseSpeed(){
	System.out.println("Increase Speed started");
	if(isConnected == true){
		if(currentSpeed < maxSpeed){
			
		currentSpeed= currentSpeed+ 1;
		System.out.println(" The current Speed is : " +currentSpeed);
		}
        else
		{			
		System.out.println("The washing machine has reached max Speed");
		}
	}
		else{
			System.out.println("Please turn on the washing machine");
			
		}
	}
public static void decreaseSpeed(){
	if (isConnected ==true){
		if(currentSpeed > minSpeed){
			currentSpeed=currentSpeed- 1;
			System.out.println("The Current Speed is : " +currentSpeed);
		}
		else
		{
			System.out.println("The washing machine has reached min Speed");
		}
	}
		else
		{
			System.out.println("Please turn off the washing machine as it is not in use");
			
}
}
}	