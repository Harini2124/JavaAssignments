// FurnitureStore.java
public class FurnitureStore {
    public static void main(String[] args) {
        // Create 3 furniture objects
        Furniture chair = new Furniture("Chair", "Red", "Grade 1", "Outdoor", 1500);
        Furniture table = new Furniture("Table", "Blue", "Grade 2", "Indoor", 2500);
        Furniture cupboard = new Furniture("Cupboard", "Green", "Grade 3", "Outdoor", 5000);

        // Display details
        chair.displayDetails();
        table.displayDetails();
        cupboard.displayDetails();
        System.out.println("hello");
 }
}
