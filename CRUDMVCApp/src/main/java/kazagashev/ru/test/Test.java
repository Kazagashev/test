package kazagashev.ru.test;

import kazagashev.ru.dao.PersonDAO;
import kazagashev.ru.model.Person;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        List<Person> people = personDAO.index();
        for (int i = 0;i < people.size();i++) {
            System.out.println(people.get(i));
        }

    }
}
