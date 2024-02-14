package org.example.trip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.example.user.User;

public class TripService {

  private boolean oneFriend;

  public List<Trip> getTripByUser(User user) {
    ArrayList<Trip> trips = new ArrayList<>();

    for (User friend : user.getFriends()) {

      if (friend != null) {
        trips.add(new Trip());
        oneFriend = true;
        break;
      }
    }

    if (oneFriend) {
      return trips;
    }

    return Collections.emptyList();
  }

  public boolean hasFriends() {
    return oneFriend;
  }
}
