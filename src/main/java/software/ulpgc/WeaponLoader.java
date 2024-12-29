package software.ulpgc;

import java.io.IOException;
import java.util.List;

public interface WeaponLoader {
    List<Weapon> load() throws IOException;

}
