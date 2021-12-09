import sun.plugin.cache.CacheUpdateHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntListOperation {
    public int search(Integer n, Integer[] list, BiFunction<Integer, List<Integer>, Integer> biFunction){
        List<Integer> integerList = new ArrayList<>(Arrays.asList(list));
        return biFunction.apply(n, integerList);
    }

    public Integer maximum(Integer[] list, Function<List<Integer>, Integer> function){
        List<Integer> integerList = new ArrayList<>(Arrays.asList(list));
        return function.apply(integerList);

    }

    public Double average (Integer[] list, Function<List<Integer>, Double> function){
        List<Integer> integerList = new ArrayList<>(Arrays.asList(list));
        return function.apply(integerList);
    }

    public String reverse (String s, Function<List, String> function){
        char[] chars;
        chars = s.toCharArray();
        Character[] characters = IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i])
                .toArray(Character[]::new);
        List<Character> characterList = new ArrayList<>(Arrays.asList(characters));
        return function.apply(characterList);

    }

    public List<String> searchWorld (List<String> list, Function <List<String>, List<String>> function){
       return function.apply(list);

    }

}
