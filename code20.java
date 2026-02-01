class Voter {
    private int age;

    // Setter with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }

    // Check eligibility
    public boolean isEligible() {
        return age >= 18;
    }
}

public class code20 {
    public static void main(String[] args) {
        Voter voter = new Voter();

        voter.setAge(20);
        System.out.println("Eligible to vote: " + voter.isEligible());

        voter.setAge(15);
        System.out.println("Eligible to vote: " + voter.isEligible());

        voter.setAge(5); // invalid age
        System.out.println("Eligible to vote: " + voter.isEligible());
    }
}
