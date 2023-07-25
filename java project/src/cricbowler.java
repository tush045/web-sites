class Bowler {

    private String firstName;
    private String lastName;
    private double oversBowled;
    private int maidenOvers;
    private int runsGiven;
    private int wicketsTaken;


    public Bowler(String firstName, String lastName, double oversBowled, int maidenOvers, int runsGiven, int wicketsTaken) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.oversBowled = oversBowled;
        this.maidenOvers = maidenOvers;
        this.runsGiven = runsGiven;
        this.wicketsTaken = wicketsTaken;
    }


    public void updateBowlerInfo(double oversBowled, int maidenOvers, int runsGiven, int wicketsTaken) {
        this.oversBowled = oversBowled;
        this.maidenOvers = maidenOvers;
        this.runsGiven = runsGiven;
        this.wicketsTaken = wicketsTaken;
    }


    public void displayBowlerInfo() {
        System.out.println("Bowler Name: " + firstName + " " + lastName);
        System.out.println("Overs Bowled: " + oversBowled);
        System.out.println("Maiden Overs: " + maidenOvers);
        System.out.println("Runs Given: " + runsGiven);
        System.out.println("Wickets Taken: " + wicketsTaken);
    }

    public static void main(String[] args) {
 
        Bowler bowler1 = new Bowler("Aman", "Singh", 5.2, 1, 30, 2);

        bowler1.displayBowlerInfo();


        bowler1.updateBowlerInfo(8.5, 2, 50, 4);


        bowler1.displayBowlerInfo();
    }

}
