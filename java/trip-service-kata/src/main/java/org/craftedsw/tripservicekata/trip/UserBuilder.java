package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;

public class UserBuilder {
    private User[] friends;
    private Trip[] trips;

    public static UserBuilder aUser() {
        return new UserBuilder();
    }

    public UserBuilder withFriends(User... friends) {
        this.friends = friends;
        return this;
    }

    public UserBuilder withTrips(Trip... trips) {
        this.trips = trips;
        return this;
    }

    public User build() {
        User user = new User();
        setFriends(user);
        setTrips(user);
        return user;
    }

    private void setFriends(User user) {
        for (User friend: friends) {
            user.addFriend(friend);
        }
    }


    private void setTrips(User user) {
        for(Trip trip: trips){
            user.addTrip(trip);
        }
    }
}
