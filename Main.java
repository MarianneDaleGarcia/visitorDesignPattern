public class Main {
    public static void main(String[] args) {
        Furniture chair = new Chair();
        Furniture table = new Table();

 
        ShippingVisitor shippingCostCalculator = new ShippingCost();

 
        chair.accept(shippingCostCalculator);
        table.accept(shippingCostCalculator);


        double totalShippingCost = ((ShippingCost) shippingCostCalculator).getTotalCost();
        System.out.println("Total shipping cost: " + totalShippingCost);
    }
}