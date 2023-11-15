import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("put the oldest parent name:");
        

    
    }
    public static Person createPerson(Scanner scanner){
        String name=scanner.nextLine();
        int age=scanner.nextInt();

        while (!(age>=0 && age<=120)) {
            System.out.println("type a number between 0 and 120");
            age=scanner.nextInt();
        }

        return new Person(age, name);
    } 
}
 
