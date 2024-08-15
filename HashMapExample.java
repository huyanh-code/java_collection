import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(10, "James");
        hashMap.put(20, "Laval");
        hashMap.put(55, "Romeo");
        hashMap.put(22, "jimmy");
        hashMap.put(99, "Right");

        System.out.println("Initial Mappings are: " + hashMap);
        String return_value = (String)hashMap.put(50, "All");

        System.out.println("Returned value is: " + return_value);
        System.out.println("New map is: " + hashMap);

        String return_values = (String)hashMap.remove(20);
        System.out.println("New map is: " + hashMap);

        String return_valuess = (String)hashMap.remove(50);
        System.out.println("\nReturn value is: " + return_valuess);
        System.out.println("New map is: "+ hashMap);

        HashMap<String, Integer> hashMaps = new HashMap<String, Integer>();
        hashMaps.put("a", 100);
        hashMaps.put("b", 800);
        hashMaps.put("c", 900);
        hashMaps.put("d", 350);
        hashMaps.put("e", 150);

        System.out.println("HashMap: " + hashMaps.toString());

        int k = hashMaps.replace("b", 200);

        System.out.println("Previous value of 'b': " + k);

        System.out.println("New hashMap: " + hashMaps.toString());

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Math", 98);
        map.put("Data structure", 85);
        map.put("Database", 91);
        map.put("Java", 95);
        map.put("Operating System", 79);
        map.put("Networking", 80);

        Map<String, Integer> map1 = sortByValue(map);

        for(Map.Entry<String, Integer> en : map1.entrySet()){
            System.out.println("\nKey: " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
    static HashMap<String, Integer> sortByValue(HashMap<String,Integer> hm){
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> aa: list){
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
