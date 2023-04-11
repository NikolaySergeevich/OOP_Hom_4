/**
 * класс бой. при создании экземпляра будут указываться 2 воина, которые будут между собой питься потом, если
 * применить к этому экземпляру метод batRun()
 */
public class Battle {
    private Warrior atacker;

    private Warrior defenedr;

    public Battle(Warrior attack, Warrior defender) {
        this.atacker = attack;
        this.defenedr = defender;
    }

    /**
     * В бою попробовал реализовать, что персонажи могли использовать щиты и они в свою очнредь получали урон
     * до момента, пока прочность не закончится. Использовать щит не всегда будет возможно. Это зависит от веса
     * щита. Прочность щита изменяется только в бою - локально. Это минус.
     * @return
     */
    public Warrior batRun() {
        int sumDamageForShieldAtacker = 0;
        int sumDamageForShielddefender = 0;
        while (true) {
            System.out.printf("Атакует %s\n",atacker.getName());
            int harm = atacker.harm();
            if (harm == 0){
                System.out.printf("\tВоин %s промахнулся\n", atacker.getName());
            }else {
                if (defenedr.shield.strength() > sumDamageForShielddefender){
                    if (defenedr.YesOrNoProtection()) {
                        System.out.print("\tЩит принял удар на себя. ");
                        sumDamageForShielddefender += defenedr.harmForShiel();
                        System.out.printf("Осталось %s ед. прочности в этом бою\n",defenedr.shield.strength()-sumDamageForShielddefender);
                    }else {
                        System.out.printf("\tВоин %s не успел поднять щит\n", defenedr.getName());
                        System.out.printf("\tВоин %s нанёс урон в %d единиц\n", atacker.getName(), harm);
                        defenedr.reduce(harm);
                        System.out.printf("\tУ воина %s осталось %d hp\n", defenedr.getName(), defenedr.getHp());
                    }
                }
                else {
                    System.out.printf("\tУ воина %s щит разрушен\n", defenedr.getName());
                    System.out.printf("\tВоин %s нанёс урон в %d единиц\n", atacker.getName(), harm);
                    defenedr.reduce(harm);
                    System.out.printf("\tУ воина %s осталось %d hp\n", defenedr.getName(), defenedr.getHp());
                }
            }
            if (!defenedr.isAlive()) {
                System.out.printf("Воин %s погиб\n", defenedr.getName());
                System.out.printf("ПОБЕДИТЕЛЬ:\n%s", atacker);
                return atacker;
            }
            System.out.printf("Атакует %s\n",defenedr.getName());
            int otvetka = defenedr.harm();
            if (otvetka == 0){
                System.out.printf("\tВоин %s промахнулся\n", defenedr.getName());
            }
            else {
                if (atacker.shield.strength() > sumDamageForShieldAtacker){
                    if (atacker.YesOrNoProtection()) {
                        System.out.print("\tЩит принял удар на себя. ");
                        sumDamageForShieldAtacker += atacker.harmForShiel();
                        System.out.printf("Осталось %s ед. прочности в этом бою\n",atacker.shield.strength()-sumDamageForShieldAtacker);
                    }else {
                        System.out.printf("\tВоин %s не успел поднять щит\n", atacker.getName());
                        System.out.printf("\tВоин %s нанёс урон в %d единиц\n", defenedr.getName(), harm);
                        atacker.reduce(harm);
                        System.out.printf("\tУ воина %s осталось %d hp\n", atacker.getName(), atacker.getHp());
                    }
                }
                else {
                    System.out.printf("\tУ воина %s щит разрушен\n", atacker.getName());
                    System.out.printf("\tВоин %s нанёс урон в %d единиц\n", defenedr.getName(), harm);
                    atacker.reduce(harm);
                    System.out.printf("\tУ воина %s осталось %d hp\n", atacker.getName(), atacker.getHp());
                }
            }
            if (!atacker.isAlive()) {
                System.out.printf("Воин %s погиб\n", atacker.getName());
                System.out.printf("ПОБЕДИТЕЛЬ:\n%s", defenedr);
                return defenedr;
            }
        }
    }
}
