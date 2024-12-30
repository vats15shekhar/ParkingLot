package org.example.ParkingLot.dto;

import org.example.ParkingLot.model.EntryGate;
import org.example.ParkingLot.model.Vehicle;

public class GenerateTicketRequestDTO {

    private Vehicle vehicle;
    private EntryGate entryGate;

    public GenerateTicketRequestDTO(Vehicle vehicle, EntryGate entryGate) {
        this.vehicle = vehicle;
        this.entryGate = entryGate;
    }
    // The empty constructor will help create objects using getters and setters
    // We can just create an object without any details, then use that object to set the vehicle and the
    // gate number. Those can be fetched using the getter methods.

    public GenerateTicketRequestDTO()
    {

    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public EntryGate getEntryGate() {
        return entryGate;
    }
    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }
}

/*
DTOs are for converting an object of one type to an object of another type for safety and
efficient load management between request and response.

Example: Consider Instagram. It has user profile details, followers and following

user profile details that the user himself can see:
1. User name
2. Password
3. mobile num
4. email
5. followers
6. following

The followers might be able to see the below

1. User name
2. profile photo

And the user will be able to see the same details of the people he is following

Question - Is it a good idea for a service to return all the details of a user to a follower
when he is trying to check my profile? Only the profile photo and name will be visible to him
and rest will be hidden by the UI.

Ans - No

That is because if we send all the data over a response to a follower trying to check my profile,
then it is possible for some hacker to intercept a user's private details - Man In the middle attack

Sending a lot of data will reduce the efficiency of the page load, and it will become very heavy,
hence reducing the performance of the page load.

This is the reason why we have DTOs. for a follower we can send an object to them that has only
the profile pic and the user name and the uploaded pictures..
 */
