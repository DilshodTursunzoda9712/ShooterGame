import weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new RPG(),
                new Slingshot(),
                new MachineGun(),
                new WaterGun(),
                new Rifle()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithwWapon(int slot) {
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}