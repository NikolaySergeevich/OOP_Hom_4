public class Main {
    public static void main(String[] args) {
        Team<Archer> archersTeam = new Team<>();
        Team<Thieh> thiehsTeam = new Team<>();
        archersTeam.addPers(new Archer("Лучник 1", 100, new Bow(15), new ShieldCircle(3)))
                .addPers(new Archer("Лучник 2", 100, new Bow(12), new ShieldDrop(3)));
        thiehsTeam.addPers(new Thieh("Вор 1", 50, new Knife(), new ShieldCircle(1)))
                .addPers(new Thieh("Вор 2", 50, new Knife(), new ShieldCircle(1)));
        System.out.println(archersTeam);
        System.out.println("----------");
        System.out.println(thiehsTeam);
        System.out.println("========");

        Archer pop = new Archer("Лучник 3", 40, new Bow(30), new ShieldCircle(6));
        Archer bob = new Archer("Лучник 4", 40, new Bow(30), new ShieldDrop(2));
        Battle fight = new Battle(pop, bob);
        fight.batRun();
    }
}