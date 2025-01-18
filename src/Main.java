
public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();


        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefense("Physical");

        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Defense Type: " + boss.getDefense());
        System.out.println("-------------------------------------");

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero Health: " + hero.getHealth());
            System.out.println("Hero Damage: " + hero.getDamage());
            System.out.println("Hero Superpower: " + hero.getSuperPower());
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 50, "Invisibility");
        Hero hero2 = new Hero(400, 60);
        Hero hero3 = new Hero(250, 40, "Flight");

        return new Hero[]{hero1, hero2, hero3};
    }
}


