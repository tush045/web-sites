import java.util.Scanner;

 class Batsman {
  
    private String firstName;
    private String lastName;
    private int runsMade;
    private int numberOfFours;
    private int numberOfSixes;


    public Batsman(String firstName, String lastName, int runsMade, int numberOfFours, int numberOfSixes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.runsMade = runsMade;
        this.numberOfFours = numberOfFours;
        this.numberOfSixes = numberOfSixes;
    }

    public void updateRuns(int runsScored) {
        this.runsMade += runsScored;


        int additionalFours = runsScored / 4;
        int additionalSixes = runsScored / 6;

        this.numberOfFours += additionalFours;
        this.numberOfSixes += additionalSixes;
    }


    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Runs Made: " + runsMade);
        System.out.println("Number of Fours: " + numberOfFours);
        System.out.println("Number of Sixes: " + numberOfSixes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.next();

        System.out.print("Enter last name: ");
        String lastName = scanner.next();

        System.out.print("Enter runs made: ");
        int runsMade = scanner.nextInt();

        System.out.print("Enter number of fours: ");
        int numberOfFours = scanner.nextInt();

        System.out.print("Enter number of sixes: ");
        int numberOfSixes = scanner.nextInt();

        Batsman batsman1 = new Batsman(firstName, lastName, runsMade, numberOfFours, numberOfSixes);

        System.out.println("\nBatsman Information:");
        batsman1.displayInfo();

        System.out.print("\nEnter additional runs scored: ");
        int additionalRuns = scanner.nextInt();
        batsman1.updateRuns(additionalRuns);

        System.out.println("\nUpdated Batsman Information:");
        batsman1.displayInfo();

        scanner.close();
    }
}
