package Model;
import java.io.*;

public class TodoList implements Serializable {
    private String item;

    public TodoList(){
        item = "";
    }

    public TodoList(String item){
        this.item = item;
    }

    public String getItem() {return item;}

    public void setItem(String item) {this.item = item;}
}
