package Part10.Comparable;

import java.util.ArrayList;
import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        Member member1 = new Member("a", 1);
        Member member2 = new Member("b", 2);
        Member member3 = new Member("c", 3);


        ArrayList<Member> members = new ArrayList<>(Arrays.asList(member1, member2, member3));

//        // prints c, b, a
//        members.stream().sorted().forEach(member -> System.out.println(member));
//
//        System.out.println();


        // ascending order
        // if a - b is neg, a comes first,
        // if pos, b comes first
        members.stream().sorted(
                (memberA, memberB) -> {
                    System.out.println("memberA: " + memberA);
                    System.out.println("memberB: " + memberB);

                    return memberA.getHeight() - memberB.getHeight();
                }
        ).forEach(member -> System.out.println(member));
    }
}
