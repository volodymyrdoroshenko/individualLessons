package lessons.generics;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void addSingleFruit(T fruit) {
        this.list.add(fruit);
    }

    public void addManyFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            list.add(fruit);
        }
    }

    public float getTotalWeight() {
        if (list.size() == 0) {
            return 0;
        } else {
            return ((list.size()) * list.get(0).getWeight());
        }
    }

    public boolean compare(Box<?> box) {
        if (this.getTotalWeight() == box.getTotalWeight()) {
            return true;
        } else throw new RuntimeException();
    }

    public void merge(Box<T> box1, Box<T> box2) {
        box1.list.addAll(box1.list.size(), box2.list);
        box2.list.clear();
    }
}
