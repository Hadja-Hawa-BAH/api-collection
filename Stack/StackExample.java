import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {

        Stack<String> fruits = new Stack<>();

        //Ajouter des élements à la pile
        fruits.push("Orange");
        fruits.push("Mango");
        fruits.push("Banana");
        fruits.push("Lemon");
        fruits.push("Peach");

        System.out.println("Pile: " + fruits);
       
        // Supprimer un élément de la pile 
        String element = fruits.pop();
        System.out.println("Element supprimé: " + element);
        System.out.println("Pile: " + fruits);

        //Accéder à un élément depuis le haut
        String top = fruits.peek();
        System.out.println("Element de haut: " + top);

        //Chercher un élément 
        int index = fruits.search("Banana");
        System.out.println("Position de Banana : " + index);

        //Rajouter l'élément supprimé
        fruits.push("Peach");
       // System.out.println("Pile: " + fruits);

       


    }
}