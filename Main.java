import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>() ;
        empIds.put("John", 12345) ;
        empIds.put("Carl", 54321) ;
        empIds.put("Jerry", 455664455) ;

        System.out.println(empIds) ;
        System.out.println(empIds.containsValue(12345)) ;
        empIds.put("John", 3333) ;
        empIds.replace("Karen", 777) ;

        empIds.putIfAbsent("Steve",222);
        empIds.remove("Steve");
        System.out.println(empIds) ;
    }
}