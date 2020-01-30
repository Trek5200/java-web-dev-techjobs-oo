package org.launchcode.techjobs_oo;

//X Create a new class called JobField.
//  Consider the following questions to help you decide what code to put in the JobField class:
//      What fields do ALL FOUR of the classes have in common?
//          id, nextId, value
//      Which constructors are the same in ALL FOUR classes?
//          id, and value
//      What getters and setters do ALL of the classes share?
//          getId, getValue, setValue
//      Which custom methods are identical in ALL of the classes?
//          @Override toString()
//X  In JobField, declare each of the common fields.
//X  Code the constructors.
//X  Use Generate to create the appropriate getters and setters.
//  Add in the custom methods.
//X Finally, to prevent the creation of a JobField object, make this class abstract.

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // getters setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());  // return Objects.hash(getId()); ???
    }
}
