
public class Kushwaha {
    private String name;
    private String number;
    private String reason;
    
    /*
     * Default constructor, sets make to "", model to "", year to 0
     */
    public Kushwaha() {
        this("","","");
    }
    
    /*
     * Overloaded constructor, sets make, model and year based on parameter list
     */
    public Kushwaha(String name, String number, String reason) {
        this.name = name;
        this.number = number;
        this.reason = reason;
    }
    
    /*
     * accessor for make
     */
    public String getName() {
        return name;
    }

    /*
     * mutator for make
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * accessor for model
     */
    public String getNumber() {
        return number;
    }

    /*
     * mutator for model
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /*
     * accessor for year
     */
    public String getReason() {
        return reason;
    }

    /*
     * mutator for year
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    /*
     * work method that prints out each property value to console,
     * with labels.
     */
    public void printProperties() {
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Reason: " + reason);
    }
}
