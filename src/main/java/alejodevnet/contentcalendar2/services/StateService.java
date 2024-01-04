package alejodevnet.contentcalendar2.services;

import alejodevnet.contentcalendar2.models.State;
import alejodevnet.contentcalendar2.repositories.StateRepository;
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
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;
    public List<State> findAll() {
        return stateRepository.findAll();
    }
    public List<State> findAll(Sort sort) {
        return stateRepository.findAll(sort);
    }
}
