package software.ulpgc.model;

public enum WeaponType {
    GlintstoneStaff,
    Greatsword,
    Bow,
    ThrustingSword,
    Crossbow,
    ColossalWeapon,
    Greataxe,
    CurvedSword,
    Halberd,
    Flail,
    Axe,
    Warhammer,
    Torch,
    CurvedGreatsword,
    Dagger,
    Claw,
    HeavyThrustingSword,
    Spear,
    StraightSword,
    Fist,
    SacredSeal,
    Hammer,
    LightBow,
    Katana,
    Twinblade,
    Greatbow,
    Whip,
    ColossalSword,
    Reaper,
    Ballista,
    GreatSpear;

    public static WeaponType parseWeaponType(String s) {
        String wt ="";
        String[] s1 = s.split(" ");
        for (String line : s1) {
            wt+=line;
        }
        for (WeaponType value : WeaponType.values()) {
            if (wt.equals(value.name())) return value;
        }
        return null;
    }
}
