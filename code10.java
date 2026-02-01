class College {
    String collegeName;
    String location;

    void display() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location    : " + location);
        System.out.println("-------------------------");
    }
}

public class code10 {
    public static void main(String[] args) {

        College c1 = new College();
        c1.collegeName = "IIT Bombay";
        c1.location = "Mumbai";

        College c2 = new College();
        c2.collegeName = "NIT Surathkal";
        c2.location = "Karnataka";

        College c3 = new College();
        c3.collegeName = "VTU";
        c3.location = "Belagavi";

        c1.display();
        c2.display();
        c3.display();
    }
}
