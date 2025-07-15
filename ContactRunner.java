class ContactRunner {
    public static void main(String args[]) {
        String contactName = "Shipali";  
        String phoneNumber = Contact.getPhoneNumber(contactName);
        System.out.println("Phone number of " + contactName + " is: " + phoneNumber);
    }
}
