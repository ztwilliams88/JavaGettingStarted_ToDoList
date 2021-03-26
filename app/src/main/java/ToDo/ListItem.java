package ToDo;

public class ListItem {

    String name;
    String dueDate;
    String inProg;
    String completed;

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getInProg() {
        return inProg;
    }

    public String getCompleted() {
        return completed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setInProg(String inProg) {
        this.inProg = inProg;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
