package software.ulpgc.app;

import software.ulpgc.io.CsvWeaponDeserializer;
import software.ulpgc.io.FileWeaponLoader;
import software.ulpgc.model.Weapon;
import software.ulpgc.model.WeaponType;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static software.ulpgc.app.ResourceDownloader.download;

public class Main {
    public static void main(String[] args) throws IOException {
        File path = new File("");
        String Path = path.getAbsolutePath();
        String urlInput= "https://raw.githubusercontent.com/Juanelboi/Resources/refs/heads/main/ERW.csv";
        String urlOutputPath = Path+"\\ERWweb.csv";
        download(urlInput, urlOutputPath);
        File filecsv = new File("ERWweb.csv");
        List<Weapon> weapons = new FileWeaponLoader(filecsv, new CsvWeaponDeserializer()).load();

        System.out.println(weapons);

    }
}