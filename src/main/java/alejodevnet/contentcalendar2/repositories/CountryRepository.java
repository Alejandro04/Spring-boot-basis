package alejodevnet.contentcalendar2.repositories;

import alejodevnet.contentcalendar2.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
