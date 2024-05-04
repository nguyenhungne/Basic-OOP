class VegetableFactory {
    public static Vegetable getVegetable(String type) {
        switch (type.toLowerCase()) {
            case "carrot":
                return new Carrot("Nantes");
            case "cabbage":
                return new Cabbage("Savoy", 1.5);
            case "pumpkin":
                return new Pumpkin(4.0);
            default:
                throw new IllegalArgumentException("Unknown vegetable type: " + type);
        }
    }
}