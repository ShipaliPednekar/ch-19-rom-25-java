class Faceb{
public static String login(String email,String password){
System.out.println("Please provide valid EmailId : " +email);
System.out.println("Please provide valid Password: " +password);
System.out.println("Login Successful");

return "Login Successful";
}
public static String login(long phoneNumber ,int otp){
System.out.println("Please provide valid Phone Number : " +phoneNumber);
System.out.println("Please provide valid Otp: " +otp);
System.out.println("Login Successful");
return "Login Successful";
}
}