package java_io.ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UserParser {
    public static void main(String[] args) {
        List<User> listOfUsers = new ArrayList<>();
        UserParser userParser = new UserParser();
        Path path = Paths.get("src/main/java/java_io/ex5/users.txt");
        try {
            for(String strLine : Files.readAllLines(path)){
                listOfUsers.add(userParser.fromCSV(strLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(listOfUsers);
    }

    public User fromCSV(String csvLine){
        String[] data = csvLine.split(",");
        return new User(data[0], data[1], Integer.parseInt(data[2]));
    }
}
