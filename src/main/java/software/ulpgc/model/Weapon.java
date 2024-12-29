package software.ulpgc.model;

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
    @Override
    public String toString() {
        return "Weapon{" +
                ",\n name='" + name + '\'' +
                ",\n type=" + type +
                ",\n physicalDamage=" + physicalDamage +
                ",\n magicDamage=" + magicDamage +
                ",\n fireDamage=" + fireDamage +
                ",\n lightningDamage=" + lightningDamage +
                ",\n holyDamage=" + holyDamage +
                ",\n Strength=" + Strength +
                ",\n Dexterity=" + Dexterity +
                ",\n Intelligence=" + Intelligence +
                ",\n Faith=" + Faith +
                "\n Arcane=" + Arcane +
                '}';
    }
}
