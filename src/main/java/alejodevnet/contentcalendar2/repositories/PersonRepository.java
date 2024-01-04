package alejodevnet.contentcalendar2.repositories;

import alejodevnet.contentcalendar2.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
