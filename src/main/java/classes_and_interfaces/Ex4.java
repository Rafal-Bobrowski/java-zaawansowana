package classes_and_interfaces;

interface Validator<T>{
    boolean validate(T input);
}

public class Ex4 {
    public static void main(String[] args) {
        User user = new User();

        //noinspection Convert2Lambda
        user.setName("Rafal",  new Validator<>() {
            @Override
            public boolean validate(String input) {
                return (input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0)));
                }
        });

        //noinspection Convert2Lambda
        user.setLastname("Bobrowski", new Validator<>() {
            @Override
            public boolean validate(String input) {
                return (input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0)));
            }
        });

        //noinspection Convert2Lambda
        user.setAge(26, new Validator<>() {
            @Override
            public boolean validate(Integer input) {
                return (input >=0 && input <= 150);
            }
        });

        //noinspection Convert2Lambda
        user.setLogin("rafal.bobrowski", new Validator<>(){
            @Override
            public boolean validate(String input){
                return (input.length()==10);
            }
        });

        //noinspection Convert2Lambda
        user.setPassword("rafal.bobrowski!", new Validator<>(){
            @Override
            public boolean validate(String input){
                return input.contains("!");
            }
        });
        System.out.println(user);

    }
}

class User{
    private String name;
    private String Lastname;
    private int age;
    private String login;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name, Validator<String> validator) {
        if (validator.validate(name)) {
            this.name = name;
        }
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String surname, Validator<String> validator) {
        if(validator.validate(surname)) {
            this.Lastname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, Validator<Integer> validator) {
        if(validator.validate(age)) {
            this.age = age;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Validator<String> validator) {
        if(validator.validate(login)) {
            this.login = login;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Validator<String> validator) {
        if(validator.validate(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + Lastname + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


