// Furniture.java

public class Furniture {
    private String type; // Table,Chair,Cupboard,Stool
    private String color; // Red,Blue,Green
    private String grade; // Grade1,Grade2,Grade3
    private String use; // Indoor / Outdoor
    private double price;
    public Furniture(String type,String color, String grade, String use, double price) {
        this.type=type;
        this.color=color;
        this.grade=grade;
        this.use=use;
        this.price=price;
    }

    // Method to calculate final price
    public double calculateFinalPrice() {
        if(use.equalsIgnoreCase("Outdoor")) {
            return price-(price*0.05);
        }
        return price;
    }

    // Method to display furniture details
    public void displayDetails() {
        System.out.println("------Furniture Details------");
        System.out.println("Type          :"+type);
        System.out.println("Color         :"+color);
        System.out.println("Grade         :"+grade);
        System.out.println("Use           :"+use);
        System.out.println("Price         :Rs"+price);
        System.out.println("FinalPrice    :Rs"+calculateFinalPrice());
    }
}
