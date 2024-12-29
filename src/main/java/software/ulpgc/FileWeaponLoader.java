package software.ulpgc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWeaponLoader implements WeaponLoader{
    private final File file;
    private final WeaponDeserializer deserializer;

    public FileWeaponLoader(File file, WeaponDeserializer deserializer) {
        this.file = file;
        this.deserializer = deserializer;
    }


    @Override
    public List<Weapon> load() throws IOException {
        ArrayList<Weapon> weapons=new ArrayList<>();
        try(BufferedReader reader= new BufferedReader(new FileReader(file))) {
            SkipHeaders(reader);
            while (true){
                String weapon = reader.readLine();
                if (weapon==null)break;
                weapons.add(deserializer.deserialize(weapon));
            }
        }
        return weapons;
    }

    private void SkipHeaders(BufferedReader reader) throws IOException {
        reader.readLine();
    }
}
