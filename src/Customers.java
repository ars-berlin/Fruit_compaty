
/** the Class make/rmove a customer add/delete them into/of
 * the db if impotant have a modify func to modify a existed
 * Customer **/

public class Customers {

    private int id;
    private String name;
    private String address;
    private int tel;


    public Customer (int id, String name, String address, int tel){
        this.address = address;
        this.tel = tel;
        this.name = name;
        this.id = id;
    }

    /** add a Customer into the db
     *
     * @return 0 if OK else -1
     */
    public int add (){
        return 0;
    }

    /** remove a Customer from db
     *
     * @return 0 if OK else -1
     */
    public int remove (){
        return 0;
    }

    /** if a Customer need to modify */
    public void modify(){

    }

    /** getter an setter Functions */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTel() {
        return tel;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }



}
