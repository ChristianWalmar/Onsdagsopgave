import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  void karakter() {

    //ARRANGE
    Main main = new Main();
    int expected = 7;

    //ACT
    int actual = main.karakter();

    //ASSERT
    assertEquals(expected, actual);
  }
}