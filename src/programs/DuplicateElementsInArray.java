package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInArray {

    public static void main(String[] args) {

        String names[] = {"Java", "JS", "C", "Ruby", "Python", "Java"};

        //1. using HashMap
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<names.length; i++){
            if(map.containsKey(names[i])){
                map.put(names[i], map.get(names[i]) + 1);
            }else {
                map.put(names[i], 1);
            }
        }

        for(String key : map.keySet()){
            if(map.get(key) >1){
                System.out.println(key);
            }
        }

        //2. using HashSet

        Set<String> set = new HashSet<>();
        for(String name: names){
            if(!set.add(name)){
                System.out.println(name);
            }
        }

    }
}
