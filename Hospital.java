class Hospital {
public static void main(String[] args) {
   String doctorNames[] = {
    "Dr. Ayesha Khan - Cardiologist",
    "Dr. Rajeev Menon - Neurologist",
    "Dr. Sneha Patil - Pediatrician",
    "Dr. Arjun Mehta - Orthopedic Surgeon",
    "Dr. Priya Desai - Dermatologist",
    "Dr. Sanjay Reddy - General Physician",
    "Dr. Meera Iyer - Gynecologist",
    "Dr. Kiran Rao - ENT Specialist",
    "Dr. Rakesh Sharma - Urologist",
    "Dr. Anjali Verma - Psychiatrist"};
 
  
    System.out.println("Doctors Available in Hospital:");
	for(String doctorName : doctorNames){
		System.out.println(doctorName);
	}
    //System.out.println(doctorNames[0] + " " + doctorNames[1] + " " + doctorNames[2] + " " + doctorNames[3] + " " + doctorNames[4] + " " + doctorNames[5] + " " + doctorNames[6] + " " + doctorNames[7] + " " + doctorNames[8] + " " + doctorNames[9]);
  }
}
