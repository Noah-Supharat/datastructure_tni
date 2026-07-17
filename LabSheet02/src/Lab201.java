import java.util.ArrayList;

public class Lab201 {
    static void main() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Emma");
        names.add("Leon");
        names.add("John");

        System.out.println("Length = " + names.size());
        System.out.print("All names in ArrayList = [");
        boolean first_element = true;
        for (String name : names){
            System.out.print((!first_element ? ", " : "") + name);
            first_element = false;
        }
        System.out.println("]");
    }
}
