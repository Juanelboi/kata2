package software.ulpgc.app;

import software.ulpgc.io.CsvWeaponDeserializer;
import software.ulpgc.io.FileWeaponLoader;
import software.ulpgc.io.TsvWeaponDeserializer;
import software.ulpgc.model.Weapon;
import software.ulpgc.model.WeaponType;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static software.ulpgc.io.ResourceDownloader.download;

public class Main {
    public static void main(String[] args) throws IOException {
        File path = new File("");
        String Path = path.getAbsolutePath();
        File filecsv = getCsvFile(Path);
        File filetsv = getTsvFile(Path);
        List<Weapon> weaponscsv = new FileWeaponLoader(filecsv, new CsvWeaponDeserializer()).load();
        List<Weapon> weaponstsv = new FileWeaponLoader(filetsv, new TsvWeaponDeserializer()).load();

        List<Weapon> swordcsv = weaponscsv.stream().filter(w -> w.type() == WeaponType.ColossalSword && (w.physicalDamage() > 400 || w.name().equals("Starscourge Greatsword"))).toList();
        List<Weapon> swordtsv = weaponstsv.stream().filter(w -> w.type() == WeaponType.ColossalSword && (w.physicalDamage() > 400 || w.name().equals("Starscourge Greatsword"))).toList();

        System.out.println(swordcsv);
        System.out.println(" ");
        System.out.println(swordtsv);



    }

    private static File getTsvFile(String Path) {
        String urltsvInput= "https://raw.githubusercontent.com/Juanelboi/Resources/refs/heads/main/ERW.tsv";
        String urltsvOutputPath = Path +"\\ERWweb.tsv";
        download(urltsvInput, urltsvOutputPath);
        File filetsv = new File("ERWweb.tsv");
        return filetsv;
    }

    private static File getCsvFile(String Path) {
        String urlcsvInput= "https://raw.githubusercontent.com/Juanelboi/Resources/refs/heads/main/ERW.csv";
        String urlcsvOutputPath = Path +"\\ERWweb.csv";
        download(urlcsvInput, urlcsvOutputPath);
        File filecsv = new File("ERWweb.csv");
        return filecsv;
    }
}