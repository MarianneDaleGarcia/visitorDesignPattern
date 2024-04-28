class ShippingCost implements ShippingVisitor {
    private double totalCost = 0;

    @Override
    public void visit(Chair chair) {
        totalCost += 10; 
    }

    @Override
    public void visit(Table table) {
        totalCost += 20; 
    }

    public double getTotalCost() {
        return totalCost;
    }
}