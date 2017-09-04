package HW170823;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Yurbly on 25.08.2017.
 */
public class WordFrequency {
    public static void main(String[] args) {
        freq("one two three one three");
    }

    static public void freq(String text){
        HashMap<Object, Object> wordFreq = Arrays.stream(text.split(" ")).map(String::trim).
                collect(HashMap::new, (map, key) -> {
                    if (!map.containsKey(key)) {
                        map.put(key, 1);
                    } else {
                        map.put(key, ((int) map.get(key) + 1));
                    }
                }, HashMap::putAll);
        for (Map.Entry e : wordFreq.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }


    }
}
