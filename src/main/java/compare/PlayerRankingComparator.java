package compare;

import java.util.Comparator;

public class PlayerRankingComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getAge() - o2.getAge();
    }
}
