package ficha;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {

        //Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»),
        // давайте посмотрим как её можно обрабатывать используя методы filter,
        // findFirst, findAny, skip и count:



//        streamFromCollection.findFirst().orElse("0");

        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a3");
        Stream<String> streamFromCollection = collection.stream();
        System.out.println(streamFromCollection);
        //System.out.println("streamFromCollection = " + streamFromCollection.collect(Collectors.toList()));
        //System.out.println(streamFromCollection.filter("a3"::equals).count());
        //System.out.println(streamFromCollection.findFirst().orElse("3"));// первый элемент или 3 если коллекция пуста
        //System.out.println(collection.stream().skip(collection.size() - 1).findAny().orElse("empty")); // последний элемент или empty
        //System.out.println(collection.stream().filter("a3"::equals).findFirst().get());
        //System.out.println(collection.stream().skip(2).findFirst().get());
        //System.out.println(Arrays.toString(collection.stream().skip(1).limit(2).toArray()));
        System.out.println(collection.stream().filter((s) -> s.contains("a")).collect(Collectors.toList()));
    }
}
