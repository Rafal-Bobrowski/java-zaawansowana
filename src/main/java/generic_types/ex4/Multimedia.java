package generic_types.ex4;

abstract class Multimedia {
    private String name;

    public Multimedia(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
