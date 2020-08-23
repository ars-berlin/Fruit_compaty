
/** the Class make/rmove a basket add/delete them into/of the db **/

public class basket {
    private int id;
    private int weight;
    private int number;
    private String entrapped;

    public basket(int id, int weight, int number, String entrapped) {
        this.weight = weight;
        this.entrapped = entrapped;
        this.id = id;
        this.number = number;
    }

    /**
     * getter and setter fuctions
     * @return
     */

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setEntrapped(String entrapped) {
        this.entrapped = entrapped;
    }

    public String getEntrapped() {
        return entrapped;
    }
    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }
}
