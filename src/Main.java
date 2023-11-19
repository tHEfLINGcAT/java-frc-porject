import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("put the name and age of the oldest person to the yougest person(when u want to stop, write quit):");
        ArrayList<Person> sortedList=getPeople(scanner);
        print(sortedList);
    }
    public static Person createPerson(Scanner scanner){
        System.out.println("enter name:");
        String name=scanner.next();
        System.out.println("enter age:");
        int age=scanner.nextInt();
        while (!(age>=0 && age<=120)) {
            System.out.println("type a number between 0 and 120");
            age=scanner.nextInt();
        }

        return new Person(age, name);
    }
    public static ArrayList<Person> getPeople(Scanner scanner){
        ArrayList<Person> people=new ArrayList<Person>();
        do{
            people.add(createPerson(scanner));

        }while(!people.get(people.size()-1).getName().equals("quit"));
        people.remove(people.get(people.size()-1));
        people.sort((Person p1,Person p2)->p1.getAge()-p2.getAge());

        return people;
    }
    public static void print(ArrayList<Person> arrlist){
        Iterator<Person> itr=arrlist.iterator();
        while(itr.hasNext())
          {
            Person obj = itr.next();
            System.out.println(obj);
          }
    }
}

 
