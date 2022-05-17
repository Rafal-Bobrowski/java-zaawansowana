package generic_types.ex5;

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println("Woof");
    }

    @Override
    void eat(Object food) {
        System.out.printf("Dog %s ate %s.", super.name, food);
    }
}
