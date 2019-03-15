package project01;

public class Batter {

    private String name;
    private String position;
    private double average;

    public Batter(String name, String position, double average) {

        this.name = name;
        this.position = position;
        this.average = average;

    }
/**
 * gets true if he hits, false if he swung and missed.
 * @return 
 */
    public boolean hit() {

        boolean hit = true;

        int random = (int) (Math.random() * 100);

        if (random <= (average * 100)) {
            hit = true;
        } else {
            hit = false;
        }

        return hit;
    }
    /**
     * gets a batter's name
     * @return 
     */
    public String getName(){
        return name;
    }

}
