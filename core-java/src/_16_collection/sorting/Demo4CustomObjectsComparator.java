package _16_collection.sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo4CustomObjectsComparator {
    public static void main(String[] args) {
        Actor actor1 = new Actor(1, "Ashish", 100000);
        Actor actor2 = new Actor(10, "Ganesh", 1200);
        Actor actor3 = new Actor(2, "Kunal", 1000);
        Actor actor4 = new Actor(12, "Shreyas", 10000);
        Actor actor5 = new Actor(3, "Sanika", 99999);

        List<Actor> actorList = new ArrayList<>();
        actorList.add(actor1);
        actorList.add(actor2);
        actorList.add(actor3);
        actorList.add(actor4);
        actorList.add(actor5);
        actorList.add(actor5);

        Comparator<Actor> idComparator = (a1, a2) -> a1.getId() - a2.getId();
        Comparator<Actor> salaryComparator = (a1, a2) -> (int) (a1.getSalary() - a2.getSalary());
        Comparator<Actor> nameComparator = (a1, a2) -> {
            return a1.getName().compareTo(a2.getName());
        };

        Collections.sort(actorList, nameComparator);

        actorList.forEach(System.out::println);


    }
}
