package org.example.trip;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;
import org.example.user.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TripServiceTest {

  @InjectMocks
  TripService cut;

  @Mock
  User userMock;

  @Test
  void onInitNotNull() {
    assertNotNull(cut);
  }

  @Test
  void onGetTripFromUserEmpty() {
    assertEquals(Collections.emptyList(), cut.getTripByUser(new User()));
  }

  @Test
  void onHasFriendTrue() {

    when(userMock.getFriends()).thenReturn(Collections.singletonList(new User()));
    cut.getTripByUser(userMock);

    assertTrue(cut.hasFriends());
  }

  @Test
  void onHasFriendEmptyList(){
    when(userMock.getFriends()).thenReturn(Collections.singletonList(userMock));
    List<Trip> tripByUser = cut.getTripByUser(userMock);

    assertFalse(tripByUser.isEmpty());
  }
}
