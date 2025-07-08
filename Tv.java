class Tv{

static int currentVolume;
static int maxVolume=50;
static int minVolume=0;
static boolean isConnected;
 public static void onOrOff(){
		
	    if (isConnected == false){
		//if (false == false)	{
			isConnected = true;
			System.out.println("The Tv is Turned on");
		}
				else if( isConnected == true)
				{
						isConnected = false;
						System.out.println("The Tv is Turned off");
					}
	            }
		   // IncreaseVolume 
		   public static void increaseVolume(){
			   System.out.println("Increase volume Started");
			   if(isConnected ==true){
				   
				   
				   if(currentVolume < maxVolume){
					 currentVolume = currentVolume+ 1;
					 System.out.println(" The current Volume is : " +currentVolume);
				  
				    }else{
					   System.out.println("Max Volume Reached");
				  }
			   }
			   else {
					   System.out.println("Please turn on the Tv");
				   }
				
				}
 
		public static void decreaseVolume(){
			System.out.println("Decrease Volume Started");
			if(isConnected ==true){
				if (currentVolume > minVolume){
					currentVolume = currentVolume- 1;
					System.out.println("The current volume is:" +currentVolume);
			}
			else
			{
				System.out.println("Please turn off the Tv");
			}
			
		}			
         
	
	}
 }

 