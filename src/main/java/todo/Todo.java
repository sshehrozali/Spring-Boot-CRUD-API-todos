// Entity
package todo;

public class Todo {

    int ID;
    String Desc;

    // Empty Constructor
    public Todo() {
    }

    // Parameters Constructor
    public Todo(int ID, String desc) {
        this.ID = ID;
        Desc = desc;
    }

    // Getters & Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
