package generic_types.ex1;

public class Pair <T, V>{

    private T firstObject;
    private V secondObject;

    public Pair(T firstObject, V secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public T getFirstObject() {
        return firstObject;
    }

    public V getSecondObject() {
        return secondObject;
    }

    public void setFirstObject(T firstObject) {
        this.firstObject = firstObject;
    }

    public void setSecondObject(V secondObject) {
        this.secondObject = secondObject;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstObject=" + firstObject +
                ", secondObject=" + secondObject +
                '}';
    }
}
