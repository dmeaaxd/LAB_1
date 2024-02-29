package org.example;

public class Person {
    private String name;
    private FacialExpression facialExpression;
    private LegState legState;

    public Person(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Person name cannot be null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFacialExpression(FacialExpression facialExpression) {
        this.facialExpression = facialExpression;
    }

    public FacialExpression getFacialExpression() {
        return facialExpression;
    }

    public void setLegState(LegState legState) {
        this.legState = legState;
    }

    public LegState getLegState() {
        return legState;
    }
}

