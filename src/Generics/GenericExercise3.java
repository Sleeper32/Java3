package Generics;

import java.util.ArrayList;

public class GenericExercise3 {
    public static void main(String[] args) {
        Box<Orange> b1, b3;
        Box<Apple> b2;

        b1 = new Box<>();
        b2 = new Box<>();
        b3 = new Box<>();
        for (int i = 0; i < 10; i++) {
            b1.addFruit(new Orange());
        }
        for (int i = 0; i < 10; i++) {
            b2.addFruit(new Apple());
        }
        for (int i = 0; i < 10; i++) {
            b3.addFruit(new Orange());
        }

        System.out.println("box1: weight: " + b1.getWeight());
        System.out.println("box2: weight: " + b2.getWeight());
        System.out.println("box3: weight: " + b3.getWeight());
        System.out.println();

        //  Compare test
        System.out.println("------ Compare test ------");
        System.out.println("b1 == b2: " + b1.compareTo(b2));
        System.out.println("empty(Orange) == empty(Apple): " + new Box<Orange>()
                .compareTo(new Box<Apple>()));
        System.out.println("b1 == b3: " + b1.compareTo(b3));
        System.out.println();

        //  Drop test
        System.out.println("------ Drop test ------");
        b1.dropFruits(b3);
        System.out.println("b3: weight: " + b3.getWeight());
        System.out.println("b1: weight: " + b1.getWeight());
    }
}

abstract class Fruit {
    abstract public float getWeight();
}

class Apple extends Fruit {

    @Override
    public float getWeight() {
        return 1.0f;
    }
}

class Orange extends Fruit {

    @Override
    public float getWeight() {
        return 1.5f;
    }
}

class Box <T extends Fruit> {

    ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;

        if (fruits.size() > 0) {
            weight = fruits.size() * fruits.get(0).getWeight();
        }

        return weight;
    }

    public boolean compareTo(Box<?> box) {
        return (getWeight() == box.getWeight());
    }

    public void dropFruits(Box<T> box) {
        while (fruits.size() > 0) {
            box.addFruit(fruits.remove(0));
        }
    }
}
