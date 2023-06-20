package com.dbva.demo.controller;

import java.util.List;
import java.util.Optional;

import com.dbva.demo.repository.AppUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dbva.demo.model.AppUser;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AppUserController {
    private static final Logger logger = LoggerFactory.getLogger(AppUserController.class);
    @Autowired
    AppUserRepository appUserRepository;

//    @GetMapping("/app-users")
//    public ResponseEntity<List<AppUser>> getAllAppUsers() {
//        try {
//            List<AppUser> appUsers = new ArrayList<AppUser>();
//            appUserRepository.findAll().forEach(appUsers::add);
//
//            if (appUsers.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//
//            return new ResponseEntity<>(appUsers, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @GetMapping("/app-users")
    public ResponseEntity<List<AppUser>> getAllAppUsers(
            @RequestParam(required = false) String gender,
            @RequestParam(required = false) String nameSet,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String givenName,
            @RequestParam(required = false) String middleInitial,
            @RequestParam(required = false) String surname,
            @RequestParam(required = false) String streetAddress,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String state,
            @RequestParam(required = false) String stateFull,
            @RequestParam(required = false) String zipCode,
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String countryFull,
            @RequestParam(required = false) String emailAddress,
            @RequestParam(required = false) String userName,
            @RequestParam(required = false) String password,
            @RequestParam(required = false) String browserUserAgent,
            @RequestParam(required = false) String telephoneNumber,
            @RequestParam(required = false) String telephoneCountryCode,
            @RequestParam(required = false) String maidenName,
            @RequestParam(required = false) String birthday,
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String tropicalZodiac,
            @RequestParam(required = false) String ccType,
            @RequestParam(required = false) String ccNumber,
            @RequestParam(required = false) String cvv2,
            @RequestParam(required = false) String ccExpires,
            @RequestParam(required = false) String nationalId,
            @RequestParam(required = false) String upsTracking,
            @RequestParam(required = false) String westernUnionMtcn,
            @RequestParam(required = false) String moneygramMtcn,
            @RequestParam(required = false) String color,
            @RequestParam(required = false) String occupation,
            @RequestParam(required = false) String company,
            @RequestParam(required = false) String vehicle,
            @RequestParam(required = false) String domain,
            @RequestParam(required = false) String bloodType,
            @RequestParam(required = false) Double pounds,
            @RequestParam(required = false) Double kilograms,
            @RequestParam(required = false) String feetInches,
            @RequestParam(required = false) Integer centimeters,
            @RequestParam(required = false) String guid,
            @RequestParam(required = false) Double latitude,
            @RequestParam(required = false) Double longitude,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "25") int size) {

        try {
            AppUser probe = new AppUser();
            if (gender != null) probe.setGender(gender);
            if (nameSet != null) probe.setNameSet(nameSet);
            if (title != null) probe.setTitle(title);
            if (givenName != null) probe.setGivenName(givenName);
            if (middleInitial != null) probe.setMiddleInitial(middleInitial);
            if (surname != null) probe.setSurname(surname);
            if (streetAddress != null) probe.setStreetAddress(streetAddress);
            if (city != null) probe.setCity(city);
            if (state != null) probe.setState(state);
            if (stateFull != null) probe.setStateFull(stateFull);
            if (zipCode != null) probe.setZipCode(zipCode);
            if (country != null) probe.setCountry(country);
            if (countryFull != null) probe.setCountryFull(countryFull);
            if (emailAddress != null) probe.setEmailAddress(emailAddress);
            if (userName != null) probe.setUserName(userName);
            if (password != null) probe.setPassword(password);
            if (browserUserAgent != null) probe.setBrowserUserAgent(browserUserAgent);
            if (telephoneNumber != null) probe.setTelephoneNumber(telephoneNumber);
            if (telephoneCountryCode != null) probe.setTelephoneCountryCode(telephoneCountryCode);
            if (maidenName != null) probe.setMaidenName(maidenName);
            if (birthday != null) probe.setBirthday(birthday);
            if (age != null) probe.setAge(age);
            if (tropicalZodiac != null) probe.setTropicalZodiac(tropicalZodiac);
            if (ccType != null) probe.setCcType(ccType);
            if (ccNumber != null) probe.setCcNumber(ccNumber);
            if (cvv2 != null) probe.setCvv2(cvv2);
            if (ccExpires != null) probe.setCcExpires(ccExpires);
            if (nationalId != null) probe.setNationalId(nationalId);
            if (upsTracking != null) probe.setUpsTracking(upsTracking);
            if (westernUnionMtcn != null) probe.setWesternUnionMtcn(westernUnionMtcn);
            if (moneygramMtcn != null) probe.setMoneygramMtcn(moneygramMtcn);
            if (color != null) probe.setColor(color);
            if (occupation != null) probe.setOccupation(occupation);
            if (company != null) probe.setCompany(company);
            if (vehicle != null) probe.setVehicle(vehicle);
            if (domain != null) probe.setDomain(domain);
            if (bloodType != null) probe.setBloodType(bloodType);
            if (pounds != null) probe.setPounds(pounds);
            if (kilograms != null) probe.setKilograms(kilograms);
            if (feetInches != null) probe.setFeetInches(feetInches);
            if (centimeters != null) probe.setCentimeters(centimeters);
            if (guid != null) probe.setGuid(guid);
            if (latitude != null) probe.setLatitude(latitude);
            if (longitude != null) probe.setLongitude(longitude);

            ExampleMatcher matcher = ExampleMatcher.matchingAny()
                    .withIgnoreCase()
                    .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                    .withIgnoreNullValues()
                    .withIgnorePaths("id", "age", "pounds", "kilograms", "centimeters", "latitude", "longitude"); // ignore numeric fields
            System.out.println(probe);

            Example<AppUser> example = Example.of(probe, matcher);
            Pageable paging = PageRequest.of(page, size);

            Page<AppUser> pageUsers = appUserRepository.findAll(example, paging);

            if (pageUsers.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(pageUsers.getContent(), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/app-users/{id}")
    public ResponseEntity<AppUser> getAppUserById(@PathVariable("id") long id) {
        Optional<AppUser> appUserData = appUserRepository.findById(id);

        if (appUserData.isPresent()) {
            return new ResponseEntity<>(appUserData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/app-users")
    public ResponseEntity<AppUser> createAppUser(@RequestBody AppUser appUser) {
        try {
            AppUser _appUser = appUserRepository.save(appUser);
            return new ResponseEntity<>(_appUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/app-users/{id}")
    public ResponseEntity<AppUser> updateAppUser(@PathVariable("id") long id, @RequestBody AppUser appUser) {
        Optional<AppUser> appUserData = appUserRepository.findById(id);

        if (appUserData.isPresent()) {
            AppUser _appUser = appUserData.get();
            // Here you should set the properties of _appUser that you want to update with the values from appUser.
            // For example:
            // _appUser.setName(appUser.getName());
            // _appUser.setEmail(appUser.getEmail());
            // etc.

            return new ResponseEntity<>(appUserRepository.save(_appUser), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/app-users/{id}")
    public ResponseEntity<HttpStatus> deleteAppUser(@PathVariable("id") long id) {
        try {
            appUserRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/app-users")
    public ResponseEntity<HttpStatus> deleteAllAppUsers() {
        try {
            appUserRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
