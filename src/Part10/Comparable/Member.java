package Part10.Comparable;

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Member otherMember) {
        // Comparable interface defines .compareTo which allows objs to be used in sorting algs

        // if "this" comes before passed in obj, return negative
        // if the passed in obj comes before, return pos
        // else return 0;

        if (this.height == otherMember.getHeight()) {
            return 0;
        }

        // descending order
        return (this.height > otherMember.getHeight()) ? -1 : 1;
    }
}
