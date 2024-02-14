package org.example.user;

import java.util.ArrayList;
import java.util.List;
import org.example.trip.Trip;

public class User {

  private final ArrayList<User> friends = new ArrayList<>();

  private final ArrayList<Trip> trips = new ArrayList<>();

  public void addFriend(User user) {
    friends.add(user);
  }

  public List<User> getFriends() {
    return friends;
  }

  public void addTrip(Trip trip) {
    trips.add(trip);
  }

  public int getTrips() {
    return trips.size();
  }
}
