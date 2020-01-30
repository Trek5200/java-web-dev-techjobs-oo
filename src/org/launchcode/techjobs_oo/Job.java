package org.launchcode.techjobs_oo;

import java.util.Objects;

import static java.util.Objects.isNull;

public class Job {

    private int id = 0;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
        this.name = null;
        this.employer = null;
        this.location = null;
        this.positionType = null;
        this.coreCompetency = null;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();     // Calls the constructor Job() to initialize the id field
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override // This is the code that was automatically generated
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId() &&
                Objects.equals(getName(), job.getName()) &&
                Objects.equals(getEmployer(), job.getEmployer()) &&
                Objects.equals(getLocation(), job.getLocation()) &&
                Objects.equals(getPositionType(), job.getPositionType()) &&
                Objects.equals(getCoreCompetency(), job.getCoreCompetency());
    }

    @Override  // This is the code that was automatically generated
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    // Adding toString here; hope this works
    @Override
    public String toString() {
//        return "\n \n";                 // Added to test for leading and trailing blank lines

        //Declare display values and default with text if value found as null
        String nameS = "Data not available";
        String employerS = "Data not available";
        String locationS = "Data not available";
        String positionTypeS = "Data not available";
        String coreCompetencyS = "Data not available";

        // boolean for null test to print OOPs message if true or job object if false
        boolean nullName = (String.valueOf(name) == null || String.valueOf(name) == "null" ||String.valueOf(name) == "");
        boolean nullEmployer = (String.valueOf(employer) == null || String.valueOf(employer) == "null" ||String.valueOf(employer) == "");
//        System.out.println(employer.getValue());
//        boolean nullEmployer = (isNull(employer) || String.valueOf(employer) == "");
//        boolean nullEmployer = (String.valueOf(employer.getValue()) == "null" || String.valueOf(employer) == "");
        boolean nullLocation = (String.valueOf(location) == null || String.valueOf(location) == "null" ||String.valueOf(location) == "");
//        boolean nullLocation = (isNull(location) || (String.valueOf(location) == ""|| (String.valueOf(location) == null)));
//        System.out.println(isNull(location));
//        boolean nullLocation = ((location.getValue().equals(null)) || (String.valueOf(location) == ""));
        // tried location.equals(null) location.equals("null") location==null location=="null"
        // (String.valueOf(location) == "null") (String.valueOf(location) == null)
        boolean nullPositionType = (String.valueOf(positionType) == null || String.valueOf(positionType) == "null" ||String.valueOf(positionType) == "");
        boolean nullCoreCompetency = (String.valueOf(coreCompetency) == null || String.valueOf(coreCompetency) == "null" ||String.valueOf(coreCompetency) == "");

//        System.out.println("nullName: " + nullName);
//        System.out.println("nullEmployer: " + nullEmployer);
//        System.out.println("nullLocation: " + nullLocation);
//        System.out.println("nullPositionType: " + nullPositionType);
//        System.out.println("nullCoreCompetenc: " + nullCoreCompetency);
        boolean nullTest = (nullName && nullEmployer && nullLocation && nullPositionType && nullCoreCompetency);
        String oops = "\nOOPS! This job does not seem to exist.\n";

        if(nullTest) {
            return oops;
        } else {
        // Determine if values are null or not
        // I tried using if (!name.equals(null)), but it did not work.
        // I added null/"" booleans above to clean up !(String.valueOf(name) == null || String.valueOf(name) == "" )
        if(!nullName){
            nameS = String.valueOf(name);
        }
        if(!nullEmployer){
            employerS = String.valueOf(employer);
        }
        if(!nullLocation){
            locationS = String.valueOf(location);
        }
        if(!nullPositionType){
            positionTypeS = String.valueOf(positionType);
        }
        if(!nullCoreCompetency){
            coreCompetencyS = String.valueOf(coreCompetency);
        }
        return "\n" +
                "ID: " + id + "\n" +
                "Name: " + nameS + "\n" +
                "Employer: " + employerS + "\n" +
                "Location: " + locationS + "\n" +
                "Position Type: " + positionTypeS + "\n" +
                "Core Competency: " + coreCompetencyS + "\n";
        }
        }
    }

