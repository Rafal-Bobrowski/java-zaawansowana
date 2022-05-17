package generic_types.ex5;

abstract class Animal {
    String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void say();

    abstract void eat(Object food);
}
