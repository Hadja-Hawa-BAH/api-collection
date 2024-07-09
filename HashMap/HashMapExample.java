import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> mapTest = new HashMap<>();
        mapTest.put("Orange", 10);
        mapTest.put("Mango", 20);
        mapTest.put("Banana", 15);
        mapTest.put("Lemon", 8);
        mapTest.put("Peach", 25);

        System.out.println("La taille du map est: " + mapTest.size());

        // Parcourir les éléménts du map
        for (Entry<String, Integer> mp : mapTest.entrySet()) {
            System.out.println(mp.getKey() + "" + mp.getValue());

        }
        mapTest.put("Orange", 14);

        mapTest.remove("Peach", 25);
        mapTest.remove("Peach");
        System.out.println(mapTest);
        System.out.println("Après la suppression de peach: " + mapTest);

        // Vérifiaction si la clé existe, si oui, afficher sa valeur
        if (mapTest.containsKey("Lemon")) {
            Integer value = mapTest.get("Lemon");
            System.out.println("la valeur de la clé est: " + " \"Lemon\" est: " + value);
        }

        //Vérification si la valeur existe, si oui, afficher sa clé 
        if (mapTest.containsValue(8)){
            System.out.println("La valeur existe-t-elle? " + mapTest.containsValue(8));

        }

        // methode entrySet
        System.out.println(mapTest.entrySet());

        //Methode clone
        System.out.println("Le map cloné est: " + mapTest.clone());

        //Methode compute
        mapTest.compute("Lemon", (key, val) -> (val == null)? 0: val + 2);
        System.out.println("Le nouveau map est: " + mapTest);
        
        //Suppression
        mapTest.clear();
        System.out.println(mapTest);


    }
}
