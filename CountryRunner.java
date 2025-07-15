class CountryRunner {
    public static void main(String[] args) {
        String countryName = "India";
        int countryCode = Country.getCountryCodes(countryName);
        System.out.println("The country code for " + countryName + " is: " + countryCode);
    }
}
