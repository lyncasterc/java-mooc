package Part9.PersonSubclassExercise;

public class Student extends Person {
    private byte credits;

    public Student(String address, String name) {
        super(address, name);
        this.credits = 0;
    }

    public byte getCredits() {
        return credits;
    }

    public void study() {
        if (credits < Byte.MAX_VALUE) {
            credits++;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", credits='" + credits + '\'' +
                '}';
    }
}
