package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
    public PositionType() {
        super();
    }

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    public String toString() {
        return value;

    }
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        PositionType that = (PositionType) o;
//
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return id;
//    }
//
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
