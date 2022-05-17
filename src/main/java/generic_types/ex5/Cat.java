package generic_types.ex5;

class Cat extends Animal{


    public Cat(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println("Miau");
    }

    @Override
    void eat(Object food) {
        System.out.printf("Cat %s ate %s.", super.name, food);
    }
}
