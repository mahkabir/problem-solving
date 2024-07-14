import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class LamdaExpression {
    public String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            sb.append(Character.toUpperCase(ch));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
       /* List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       List<Integer> evenNumbers = numbers.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
        String a = "abcdefgh";
        LamdaExpression e = new LamdaExpression();
        String result = e.toUpperCase(a);
        System.out.println("to Upper Case: "+result);*/
       // String upperCaseString = a.chars()
        // .mapToObj(ch -> Character.toUpperCase(ch))
        // .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
        // .toString();
      /*  String upperCaseString = a.chars()
                .mapToObj(ch -> Character.toUpperCase((char) ch))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println("with Lamda toUpper Case: "+ upperCaseString);*/

       /* List<String> words = Arrays.asList("hello", "world");
        words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .forEach(System.out::println);*/
       /* IntStream.rangeClosed(1,9)
                .filter(n -> n%2==0)
                .forEach(System.out::print);*/
       /* int sum= Stream.of("Cognizant", "Infosys", "Amdocs")
                .map(s -> s.length())
                .reduce(0, Integer::sum);

        System.out.println(sum);*/
      /*  Map<String, Integer> ages = new HashMap<>();
        ages.put("Robert", 30);
        ages.put("Mary", 25);
        ages.put("Peterson", 40);
        ages.put("Jinny", 35);

        int result = ages.entrySet().stream()
                .filter(entry -> entry.getValue() > 30)
                .mapToInt(entry -> entry.getValue())
                .sum();
        System.out.println(result);*/
        Stream.of("javascript", "java",  "angular")
                .filter(s -> s.startsWith("j"))
                .findFirst()
                .ifPresent(System.out::println);
    }


    /*    int sum = 0;
        for (int number:numbers) {
            sum+=number;
        }
        System.out.printf("sum:"+sum);
    }
  */
}

