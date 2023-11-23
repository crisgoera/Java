import java.util.Scanner;

public class Main {
    String firstName;
    String middleName;
    String lastName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your first name");
        String firstName = sc.next();

        System.out.println("Input your middle name");
        String middleName = sc.next();

        System.out.println("Input your last name");
        String lastName = sc.next();

        Main fullName = createName(firstName, middleName, lastName);

        System.out.println(fullName.computeName());
    }
    public String computeName() {
        String fullName = String.format("The introduced full name is %s %s %s", firstName, middleName, lastName);
        return fullName;
    }

    public static Main createName(String firstName, String middleName, String lastName) {
        Main fullName = new Main();
        fullName.firstName = firstName;
        fullName.middleName = middleName;
        fullName.lastName = lastName;
        return fullName;
    }
}
