class Teacher {
    String name;

    void teach() {
        System.out.println(name + " is teaching.");
    }
}

class MathTeacher extends Teacher {
    void solveEquation() {
        System.out.println(name + " is solving a math equation.");
    }
}

class ScienceTeacher extends Teacher {
    void conductExperiment() {
        System.out.println(name + " is conducting a science experiment.");
    }
}

public class code28 {
    public static void main(String[] args) {

        MathTeacher mt = new MathTeacher();
        mt.name = "Anita";
        mt.teach();
        mt.solveEquation();

        System.out.println();

        ScienceTeacher st = new ScienceTeacher();
        st.name = "Ravi";
        st.teach();
        st.conductExperiment();
    }
}
