package animals;

import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Bird [] birds = new Bird[2];
        birds[0] = new Duck("duck",2,true);
        birds[1] = new Eagle("eagle",4,true);

        Fish [] fishes = new Fish[2];
        fishes [0] = new Shark("shark",true,234);
        fishes[1] = new Carp("carp",true,12);
        System.out.println(Arrays.toString(birds));
        for (Bird b : birds) {
            b.fly();
            b.eat();
            b.say();
        }
        System.out.println();
        System.out.println(Arrays.toString(fishes));
        for (Fish f : fishes) {
            f.swim();
            f.eat();
            f.say();
        }
    }
}
