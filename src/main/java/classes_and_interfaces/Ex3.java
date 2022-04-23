package classes_and_interfaces;

public class Ex3 {
    public static void main(String[] args) {
        Car car = new Car("VW", "sport");
        System.out.println(car);
    }
}

class Car {
    private String name;
    private String type;
    private Engine engine;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        engine = new Car.Engine();
        engine.setEngineType();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private class Engine {
        private String engineType;

        public void setEngineType() {
            switch (type) {
                case "economy" -> engineType = "diesel";
                case "luxury" -> engineType = "electric";
                default -> engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }


}
