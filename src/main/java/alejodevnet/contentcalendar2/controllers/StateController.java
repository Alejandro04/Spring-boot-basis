package alejodevnet.contentcalendar2.controllers;

import alejodevnet.contentcalendar2.models.State;
import alejodevnet.contentcalendar2.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/states/")
public class StateController {

    @Autowired
    private StateService stateService;

    //
}
