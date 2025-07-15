class HackerRunner {
    public static void main(String[] args) {

        Hacker h = new Hacker();

        
        h.name = "Alex Hunter";
        h.alias = "ShadowFox";
        h.skillLevel = 9;
        h.age = 28;
        h.hacksDone = 145;
        h.hackerId = 202507131999L;
        h.successRate = 92.5f;
        h.bountyAmount = 125000.75;
        h.dangerLevel = 'S';
        h.isActive = true;
        h.country = "Unknown";
        h.isBlackHat = true;
        h.languagesKnown = 8;
        h.yearsOfExperience = 10;
        h.anonymityScore = 97.3f;

        
        System.out.println("Name : " + h.getName());
        System.out.println("Hacks Completed : " + h.getHacksDone());
        System.out.println("Active Status : " + h.getIsActive());
        System.out.println("Bounty Amount : " + h.getBountyAmount());
        System.out.println("Skill Level : " + h.getSkillLevel());
        System.out.println("Anonymity Score : " + h.getAnonymityScore());
    }
}
