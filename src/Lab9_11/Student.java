package Lab9_11;

public class Student {
    String nume;
    float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public float getMedie() {
        return medie;
    }

    @Override
    public String toString() {
        return nume + " (" + medie + ")";
    }
}
