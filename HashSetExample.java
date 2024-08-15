import java.util.*;
import java.util.stream.Collectors;

public class HashSetExample {
    public static void main(String[] args) {
        hashSet();
    }
    static void hashSet(){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(null);

        Iterator itr = hs.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next() + "\n");
        }

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("e");

        System.out.println(hashSet);



        Integer[] arrayNumbers = hs.toArray(new Integer[hs.size()]);

        Random rndm = new Random();

        int rndmNumber = rndm.nextInt(hs.size());

        System.out.println("Random element: "
                + arrayNumbers[rndmNumber]);

        HashSet<Integer> hashSets = new HashSet<>();

        hashSets.add(10);
        hashSets.add(20);
        hashSets.add(30);
        hashSets.add(40);
        hashSets.add(70);

        System.out.println("\nMaximum value of HashSet: " + Collections.max(hashSets));
        System.out.println("Minimum value of HashSet: " + Collections.min(hashSets));

        List<String> stringList = new ArrayList<>();

        stringList.add("Dragon");
        stringList.add("Cat");
        stringList.add("Dog");
        stringList.add("Snake");

        HashSet<String> strings = new HashSet<String>(stringList);

        System.out.println("\nHashSet Elements are: ");

        for(String ob: strings){
            System.out.println(ob);
        }

        String array[] = {"meomeo", "gaugau", "graooo"};
        System.out.println("Array: " + Arrays.toString(array));

        Set<String> set = convertArrayToSet(array);
        System.out.println("Set: " + set);
    }
    public static  <T> Set<T> convertArrayToSet(T array[]){
        return Arrays.stream(array).collect(Collectors.toSet());
    }
}
