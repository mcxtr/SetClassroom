import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceExample {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        Set<Integer> result = symmetricDifference(set1, set2);

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("Symmetric Difference: " + result);
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);

        Set<Integer> tmp = new HashSet<>(set1);
        tmp.retainAll(set2); 

        symmetricDiff.removeAll(tmp);

        return symmetricDiff;
    }
}