public class Main {

    public static void main(String[] args) {
        catsApp();
    }

    static void catsApp(){
        Cat cat = new Cat("Barsik", 6);
        Plate plate = new Plate(101);
        plate.info();
        cat.eat(plate);
        plate.info();
        System.out.println(cat.isNotHungry());
        System.out.println();

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Murzik",20);
        cats[1] = new Cat("Kiskis",10);
        cats[2] = new Cat("Friskis",23);
        cats[3] = new Cat("Myou",12);
        cats[4] = new Cat("Funtik",5);

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
            System.out.println(cats[i].isNotHungry());
        }
        System.out.println();

        plate.info();
        plate.addFood(20);
        plate.info();
    }
}
