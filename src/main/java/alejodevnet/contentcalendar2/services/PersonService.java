package alejodevnet.contentcalendar2.services;

import alejodevnet.contentcalendar2.models.Person;
import alejodevnet.contentcalendar2.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public <S extends Person> S save(S entity) {
        return personRepository.save(entity);
    }
    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }
    public List<Person> findAll() {
        return personRepository.findAll();
    }
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
    public void delete(Person entity) {
        personRepository.delete(entity);
    }
    public List<Person> findAll(Sort sort) {
        return personRepository.findAll(sort);
    }
    public Page<Person> findAll(Pageable pageable) {
        return personRepository.findAll(pageable);
    }
}
