package alejodevnet.contentcalendar2.controllers;

import alejodevnet.contentcalendar2.models.Country;
import alejodevnet.contentcalendar2.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries/")
public class CountryController {

    @Autowired
    private CountryService countryService;

    private ResponseEntity<List<Country>> getAllCountries(){
        return ResponseEntity.ok(countryService.findAll());
    }
}
