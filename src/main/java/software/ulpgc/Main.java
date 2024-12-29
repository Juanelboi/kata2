package software.ulpgc;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("ERW.csv");
        List<Weapon> weapons = new FileWeaponLoader(file, new CsvWeaponDeserializer()).load();

        System.out.println(weapons);

    }
}