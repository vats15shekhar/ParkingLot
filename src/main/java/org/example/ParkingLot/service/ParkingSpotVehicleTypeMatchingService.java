package org.example.ParkingLot.service;

import org.example.ParkingLot.model.SpotType;
import org.example.ParkingLot.model.VehicleType;

public class ParkingSpotVehicleTypeMatchingService {
    public boolean matches(SpotType spotType, VehicleType vehicleType){
        //TODO : read about switch case added in java 14
        return switch (spotType) {
            case LARGE ->  vehicleType.equals(VehicleType.LARGE);
            case MEDIUM -> vehicleType.equals(VehicleType.MEDIUM);
            case SMALL -> vehicleType.equals(VehicleType.SMALL);
            case ELECTRIC ->  vehicleType.equals(VehicleType.ELECTRIC);
        };
    }
}

/*
Switch Expression:

The switch keyword introduces a switch expression
(available from Java 12 in preview and standard from Java 14).
It evaluates the value of spotType.

Cases:
Each case represents a specific possible value of spotType.
For example, case LARGE is executed if spotType equals LARGE.

Arrow (->) Syntax:
The arrow (->) is used to specify the result or action for each case.
It replaces the older case: break; syntax used in traditional switch statements.

Return Value:
The expression after the arrow (->) is the value returned by the switch expression.

For example:
If spotType == LARGE, the expression evaluates to vehicleType.equals(VehicleType.LARGE)
and returns the result of this evaluation (true or false).

Evaluation:
The equals method compares vehicleType with a specific value from the VehicleType
enum (or similar class). It returns true if the vehicleType matches the corresponding spotType,
and false otherwise.

Example Usage
Assume the following:
spotType is of type SpotType, an enum with values LARGE, MEDIUM, SMALL, and ELECTRIC.
vehicleType is an instance of VehicleType, an enum with values LARGE, MEDIUM, SMALL, and ELECTRIC.

How It Works:
If spotType is LARGE:
The code checks if vehicleType is VehicleType.LARGE.
If vehicleType.equals(VehicleType.LARGE) evaluates to true, the method returns true. Otherwise, it returns false.
The same logic applies to other cases (MEDIUM, SMALL, ELECTRIC).

Advantages of This Approach
Conciseness:

The switch expression is more concise and readable compared to the traditional switch statement.
Eliminates Break Statements:

No need for break statements to avoid fall-through.

Immutability:
It directly returns a value, making it less error-prone.

Type Safety:
Ensures all SpotType enum values are covered or explicitly omitted,
making the code robust. (The compiler enforces exhaustiveness for enum-based switches.)
 */
