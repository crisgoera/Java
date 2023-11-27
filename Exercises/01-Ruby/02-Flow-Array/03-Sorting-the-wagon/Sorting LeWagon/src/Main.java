import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = nameInput();
        ArrayList<String> sortedList = sort(nameList);
        printNames(sortedList);
    }

    // Retrieves alumni names from user.
    public static ArrayList<String> nameInput() {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the student name: (Enter 'stop' to finish) \n");
        String name = sc.next();

        while (!Objects.equals(name, "stop")) {
            nameList.add(name);
            System.out.println("Introduce another student's name: (Enter 'stop' to finish) \n");
            name = sc.next();
        }

        return nameList;
    }

//    Sorts students' names alphabetically.
    public static ArrayList<String> sort(ArrayList<String> nameList) {
        ArrayList<String> sortedList = nameList;
        Collections.sort(sortedList);
        return sortedList;
    }

//    Prints names in array.
    public static void printNames(ArrayList<String> nameList) {
        for (int i=0; i<nameList.size(); i++) {
            String entry = nameList.get(i);
            System.out.println(entry);
        }
    }
}

