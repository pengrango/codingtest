package compare;

public class Player implements Comparable<Player>{
    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Player o) {
        if (this.ranking > o.ranking) {
            return 1;
        }else if (this.ranking < o.ranking) {
            return -1;
        } else {
            return 0;
        }

    }

    public int getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
// constructor, getters, setters
}