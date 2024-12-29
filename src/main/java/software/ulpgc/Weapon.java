package software.ulpgc;

public record Weapon(
        String name,
        WeaponType type,
        double physicalDamage,
        double magicDamage,
        double fireDamage,
        double lightningDamage,
        double holyDamage,
        Scaling Strength,
        Scaling Dexterity,
        Scaling Intelligence,
        Scaling Faith,
        Scaling Arcane
) {
}
