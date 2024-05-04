public class Main {
    public static void main(String[] args) {
        Vegetable carrot = VegetableFactory.getVegetable("carrot");
        Vegetable cabbage = VegetableFactory.getVegetable("cabbage");
        Vegetable pumpkin = VegetableFactory.getVegetable("pumpkin");

        System.out.println(carrot.getInfo());
        System.out.println(cabbage.getInfo());
        System.out.println(pumpkin.getInfo());
    }
}