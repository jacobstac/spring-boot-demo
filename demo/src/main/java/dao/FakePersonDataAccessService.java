package dao;

import model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public class  FakePersonDataAccessService implements PersonDao {

    private static List<Person> BD = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id , person.getName()));
        return 1;
    }
}
