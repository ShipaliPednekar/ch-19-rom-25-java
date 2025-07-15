class Country {
    public static int getCountryCodes(String countryName) {
        int countryCode = 0;

        if (countryName.equals("India")) {
            countryCode = 91;
        } else if (countryName.equals("Australia")) {
            countryCode = 61;
        } else if (countryName.equals("Sri Lanka")) {
            countryCode = 94;
        } else if (countryName.equals("Italy")) {
            countryCode = 39;
        } else if (countryName.equals("Brazil")) {
            countryCode = 55;
        } else if (countryName.equals("Japan")) {
            countryCode = 81;
        } else if (countryName.equals("United Kingdom")) {
            countryCode = 44;
        } else if (countryName.equals("Canada")) {
            countryCode = 1;
        } else if (countryName.equals("United States")) {
            countryCode = 1;
        } else if (countryName.equals("Spain")) {
            countryCode = 34;
        } else if (countryName.equals("Germany")) {
            countryCode = 49;
        } else if (countryName.equals("France")) {
            countryCode = 33;
        } else if (countryName.equals("Russia")) {
            countryCode = 7;
        } else if (countryName.equals("China")) {
            countryCode = 86;
        } else if (countryName.equals("Mexico")) {
            countryCode = 52;
        } else if (countryName.equals("South Korea")) {
            countryCode = 82;
        } else if (countryName.equals("South Africa")) {
            countryCode = 27;
        } else if (countryName.equals("Nigeria")) {
            countryCode = 234;
        } else if (countryName.equals("Egypt")) {
            countryCode = 20;
        } else if (countryName.equals("Argentina")) {
            countryCode = 54;
        } else if (countryName.equals("Bangladesh")) {
            countryCode = 880;
        } else if (countryName.equals("Nepal")) {
            countryCode = 977;
        } else if (countryName.equals("Pakistan")) {
            countryCode = 92;
        } else if (countryName.equals("Indonesia")) {
            countryCode = 62;
        } else if (countryName.equals("Thailand")) {
            countryCode = 66;
        } else if (countryName.equals("Malaysia")) {
            countryCode = 60;
        } else if (countryName.equals("Vietnam")) {
            countryCode = 84;
        } else if (countryName.equals("Philippines")) {
            countryCode = 63;
        } else if (countryName.equals("Turkey")) {
            countryCode = 90;
        } else if (countryName.equals("Iran")) {
            countryCode = 98;
        } else if (countryName.equals("Iraq")) {
            countryCode = 964;
        } else if (countryName.equals("Afghanistan")) {
            countryCode = 93;
        } else if (countryName.equals("UAE")) {
            countryCode = 971;
        } else if (countryName.equals("Saudi Arabia")) {
            countryCode = 966;
        } else if (countryName.equals("Qatar")) {
            countryCode = 974;
        } else if (countryName.equals("Oman")) {
            countryCode = 968;
        } else if (countryName.equals("Kuwait")) {
            countryCode = 965;
        } else if (countryName.equals("Israel")) {
            countryCode = 972;
        } else if (countryName.equals("Ukraine")) {
            countryCode = 380;
        } else if (countryName.equals("Switzerland")) {
            countryCode = 41;
        } else if (countryName.equals("Sweden")) {
            countryCode = 46;
        } else if (countryName.equals("Norway")) {
            countryCode = 47;
        } else if (countryName.equals("Denmark")) {
            countryCode = 45;
        } else if (countryName.equals("Netherlands")) {
            countryCode = 31;
        } else if (countryName.equals("Belgium")) {
            countryCode = 32;
        } else if (countryName.equals("Austria")) {
            countryCode = 43;
        } else if (countryName.equals("Poland")) {
            countryCode = 48;
        } else if (countryName.equals("Greece")) {
            countryCode = 30;
        } else {
            System.out.println(countryName + " is Invalid or not listed.");
        }

        return countryCode;
    }
}
