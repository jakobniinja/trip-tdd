package org.example.trip;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TripDAOTest {

  TripDAO dao = new TripDAO();

  @org.junit.jupiter.api.Test
  void onInitDAONotNull() {
    assertNotNull(dao);
  }
}
