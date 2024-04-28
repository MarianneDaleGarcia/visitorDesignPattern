class Chair implements Furniture {
    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}