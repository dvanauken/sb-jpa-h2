package com.dbva.demo.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "APP_USER")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "gender")
    private String gender;

    @Column(name = "name_set")
    private String nameSet;

    @Column(name = "title")
    private String title;

    @Column(name = "given_name")
    private String givenName;

    @Column(name = "middle_initial")
    private String middleInitial;

    @Column(name = "surname")
    private String surname;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "state_full")
    private String stateFull;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "country")
    private String country;

    @Column(name = "country_full")
    private String countryFull;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "browser_user_agent")
    private String browserUserAgent;

    @Column(name = "telephone_number")
    private String telephoneNumber;

    @Column(name = "telephone_country_code")
    private String telephoneCountryCode;

    @Column(name = "maiden_name")
    private String maidenName;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "age")
    private int age;

    @Column(name = "tropical_zodiac")
    private String tropicalZodiac;

    @Column(name = "cc_type")
    private String ccType;

    @Column(name = "cc_number")
    private String ccNumber;

    @Column(name = "cvv2")
    private String cvv2;

    @Column(name = "cc_expires")
    private String ccExpires;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "ups_tracking")
    private String upsTracking;

    @Column(name = "western_union_mtcn")
    private String westernUnionMtcn;

    @Column(name = "moneygram_mtcn")
    private String moneygramMtcn;

    @Column(name = "color")
    private String color;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "company")
    private String company;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "domain")
    private String domain;

    @Column(name = "blood_type")
    private String bloodType;

    @Column(name = "pounds")
    private double pounds;

    @Column(name = "kilograms")
    private double kilograms;

    @Column(name = "feet_inches")
    private String feetInches;

    @Column(name = "centimeters")
    private int centimeters;

    @Column(name = "guid")
    private String guid;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @OneToMany(mappedBy = "assignedTo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks;

    @ManyToMany
    @JoinTable(
            name = "ROLE_USER",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameSet() {
        return nameSet;
    }

    public void setNameSet(String nameSet) {
        this.nameSet = nameSet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateFull() {
        return stateFull;
    }

    public void setStateFull(String stateFull) {
        this.stateFull = stateFull;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryFull() {
        return countryFull;
    }

    public void setCountryFull(String countryFull) {
        this.countryFull = countryFull;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBrowserUserAgent() {
        return browserUserAgent;
    }

    public void setBrowserUserAgent(String browserUserAgent) {
        this.browserUserAgent = browserUserAgent;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneCountryCode() {
        return telephoneCountryCode;
    }

    public void setTelephoneCountryCode(String telephoneCountryCode) {
        this.telephoneCountryCode = telephoneCountryCode;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTropicalZodiac() {
        return tropicalZodiac;
    }

    public void setTropicalZodiac(String tropicalZodiac) {
        this.tropicalZodiac = tropicalZodiac;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getCcExpires() {
        return ccExpires;
    }

    public void setCcExpires(String ccExpires) {
        this.ccExpires = ccExpires;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getUpsTracking() {
        return upsTracking;
    }

    public void setUpsTracking(String upsTracking) {
        this.upsTracking = upsTracking;
    }

    public String getWesternUnionMtcn() {
        return westernUnionMtcn;
    }

    public void setWesternUnionMtcn(String westernUnionMtcn) {
        this.westernUnionMtcn = westernUnionMtcn;
    }

    public String getMoneygramMtcn() {
        return moneygramMtcn;
    }

    public void setMoneygramMtcn(String moneygramMtcn) {
        this.moneygramMtcn = moneygramMtcn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public double getPounds() {
        return pounds;
    }

    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    public double getKilograms() {
        return kilograms;
    }

    public void setKilograms(double kilograms) {
        this.kilograms = kilograms;
    }

    public String getFeetInches() {
        return feetInches;
    }

    public void setFeetInches(String feetInches) {
        this.feetInches = feetInches;
    }

    public int getCentimeters() {
        return centimeters;
    }

    public void setCentimeters(int centimeters) {
        this.centimeters = centimeters;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(id, appUser.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", nameSet='" + nameSet + '\'' +
                ", title='" + title + '\'' +
                ", givenName='" + givenName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", surname='" + surname + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", stateFull='" + stateFull + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", countryFull='" + countryFull + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", browserUserAgent='" + browserUserAgent + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", telephoneCountryCode='" + telephoneCountryCode + '\'' +
                ", maidenName='" + maidenName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                ", tropicalZodiac='" + tropicalZodiac + '\'' +
                ", ccType='" + ccType + '\'' +
                ", ccNumber='" + ccNumber + '\'' +
                ", cvv2='" + cvv2 + '\'' +
                ", ccExpires='" + ccExpires + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", upsTracking='" + upsTracking + '\'' +
                ", westernUnionMtcn='" + westernUnionMtcn + '\'' +
                ", moneygramMtcn='" + moneygramMtcn + '\'' +
                ", color='" + color + '\'' +
                ", occupation='" + occupation + '\'' +
                ", company='" + company + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", domain='" + domain + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", pounds=" + pounds +
                ", kilograms=" + kilograms +
                ", feetInches='" + feetInches + '\'' +
                ", centimeters=" + centimeters +
                ", guid='" + guid + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", tasks=" + tasks +
                ", roles=" + roles +
                '}';
    }
}
