package org.example;

public class Main {
    public static void main(String[] args) {
        Person ford = new Person("Ford");
        ford.setFacialExpression(FacialExpression.SHOCK);
        ford.setLegState(LegState.CANNOT_FIND_GROUND);

        System.out.println(ford.getName() + " is in a state of " + ford.getFacialExpression() +
                " and their left leg is in a state of " + ford.getLegState());
    }
}
