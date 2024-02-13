package org.example.trip;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TripDAOTest {

  TripDAO dao = new TripDAO();

  @org.junit.jupiter.api.Test
  void onInitDAONotNull() {
    assertNotNull(dao);
  }
  
  @Test
  void onFindTripByUserEmptyList(){
    assertTrue(dao.findTripByUser(new User()).isEmpty());
  }
}
