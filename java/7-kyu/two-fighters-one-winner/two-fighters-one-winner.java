import java.util.Arrays;
​
public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter[] fighters = {fighter1, fighter2};
​
        // could use iterators to handle the index values?
        int currentAttackerIndex = firstAttacker.equals(fighters[0].name) ? 0 : 1;
        int currentAttackedIndex = currentAttackerIndex == 0 ? 1 : 0;
        
        boolean isSomeoneDead;
​
        do {
            fighters[currentAttackedIndex].health -= fighters[currentAttackerIndex].damagePerAttack;
​
            int tempCurrentAttackerIndex = currentAttackerIndex;
            currentAttackerIndex = currentAttackedIndex;
            currentAttackedIndex = tempCurrentAttackerIndex;
​
            isSomeoneDead = Arrays.stream(fighters).anyMatch(f -> f.health < 1);
        } while (!isSomeoneDead);
​
        return fighters[currentAttackedIndex].name;
    }
}