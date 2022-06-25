package lessons.generics;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();

        box1.addSingleFruit(apple);
        box2.addSingleFruit(apple);
        box3.addSingleFruit(orange);

        box1.addManyFruit(apple, 119);
        box2.addManyFruit(apple, 49);
        box3.addManyFruit(orange, 79);

        System.out.println("\nTotal weight of box1 (apples) is: " + box1.getTotalWeight());
        System.out.println("Total weight of box2 (apples) is: " + box2.getTotalWeight());
        System.out.println("Total weight of box3 (oranges) is: " + box3.getTotalWeight());

        try {
            box1.compare(box2);
            box1.compare(box3);
        } catch (Exception e) {
            System.out.println("\nSome boxes are not equally by weight!\n");
        }

        box1.merge(box1, box2);
//        box1.merge(box1, box3); - compilation error, as expected

        System.out.println("Total weight of box1 (apples) after merging is: " + box1.getTotalWeight());
        System.out.println("Total weight of box2 (apples) after merging is: " + box2.getTotalWeight());
    }
}
