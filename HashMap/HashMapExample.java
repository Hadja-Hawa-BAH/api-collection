import java.util.HashMap;
import java.util.Map;

public class HashMapExample{
    public static void main(String[] args) {
        HashMap<String, Integer> mapTest = new HashMap<>();
        mapTest.put("Orange ", 10);
        mapTest.put("Mango ", 20);
        mapTest.put("Banana ", 15);
        mapTest.put("Lemon ", 8);
        mapTest.put("Peach ", 25);

        System.out.println("La taille du map est: " + mapTest.size());

        //Parcourir les éléménts du map
        for (Map.Entry mp: mapTest.entrySet()){
            System.out.println(mp.getKey() +" "+ mp.getValue());
    
        }

        assert mapTest.remove("Peach", 25);
        System.out.println("Après la suppression : " + mapTest);
    }
}
