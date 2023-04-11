import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends  Personage> implements Iterable<T>{
    List<T> personages = new ArrayList<>();
    @Override
    public Iterator iterator() {
        return  personages.iterator();
    }
    public  Team<T> addPers (T personage){
        this.personages.add(personage);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res  =new StringBuilder();
        for (T person: this) {//this потому что есть Iterable<T>
            res.append(person)
                    .append("\n");
        }
        res.append(String.format("Максимальное дальность: %d\n", maxRange()));
        res.append(String.format("Максимальное прочность щита: %s",maxProch()));
        return res.toString();
    }

    /**
     * максимальная дальность лучников. Именно персонажей, а не возможности лука.
     * @return
     */
    public int maxRange(){
        int max = 0;
        for (T pers:this) {
            if (pers instanceof  Archer){
                Archer archer = (Archer) pers;//До этой строки в этом методе pers был типа T. Если персонаж является
                //типом Archer, то мы его кастомим в Archer и дальше с ним можем обращаться как с лучником.
                if (archer.renge()>max){
                    max = archer.renge();
                }
            }

        }
        return max;
    }
    public int maxProch(){
        int max = 0;
        for (T pers:this) {
            if (pers instanceof Warrior<?,?>){
                Warrior warrior = (Warrior) pers;
                if (warrior.shield.strength() > max){
                    max = warrior.shield.strength();
                }
            }
        }
        return max;
    }
}
