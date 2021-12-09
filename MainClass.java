import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class MainClass {

    public static Integer[] initArray = {1, 2, 3, 3, 5, 6};
    public static String str = "java interview";
    public static String[] initStringArray = {
            "asd", "ret", "get", "Arc", "apptr", "azz", "bobq", "fen", "voc"
    };

    public static List<String> stringList = new ArrayList<>(Arrays.asList(initStringArray));


    public static void main(String[] args) {
        int numOfIndex;
        Integer maxElementOfArray;
        Double averageElementOfArray;
        String reverseString;
        List<String> searchWorld;
        List<String> outList = new ArrayList<>();


        IntListOperation intListOperation = new IntListOperation();
        numOfIndex = intListOperation.search(6, initArray, (a, b) -> {
            return b.indexOf(a);
        });
        System.out.println(numOfIndex);


        maxElementOfArray = intListOperation.maximum(initArray, a -> {
            return Collections.max(a);
        });
        System.out.println(maxElementOfArray);


        averageElementOfArray = intListOperation.average(initArray, a -> {
           Double sum = 0.0;
          for (Integer e:a){
              sum = sum+e;
          }
          return sum/a.size();
        });
        System.out.println(averageElementOfArray);


        reverseString = intListOperation.reverse(str, a -> {
            Collections.reverse(a);
            return Arrays.toString(a.toArray());
        });
        System.out.println(reverseString);


        intListOperation.searchWorld(stringList, e -> {
            e.forEach(q ->
            {
                if (q.length()==3&&q.charAt(0)=='a'){
                outList.add(q);
            }});
           return outList;
        });
        System.out.println(outList);

    }
}
