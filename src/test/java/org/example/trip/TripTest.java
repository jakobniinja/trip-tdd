package org.example.trip;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class TripTest {

  Trip trip = new Trip();

  @Test
  void onTripStartNotNull() {
    assertNotNull(trip);
  }
}
