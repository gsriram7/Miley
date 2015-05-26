package marsrover

import org.scalatest.FunSuite

class MarsRoverTest extends FunSuite {
  test("Should test simple movement for the rover") {
    assert(new MarsRover().marsRover(Rover(1, 2, North), "LMLMLMLMM".toCharArray.toList, new Mars(5, 5)).equals(Rover(1, 3, North)))
  }

  test("Should test complex movement for the rover") {
    assert(new MarsRover().marsRover(Rover(3, 3, East), "MMRMMRMRRM".toCharArray.toList, new Mars(8, 8)).equals(Rover(5, 1, East)))
  }

  test("Should test for null input") {
    assert(new MarsRover().marsRover(Rover(3, 3, East), "".toCharArray.toList, new Mars(5, 5)).equals(Rover(3, 3, East)))
  }

  test("Should test out of mars exception") {
    try {
      assert(new MarsRover().marsRover(Rover(3, 3, East), "MM".toCharArray.toList, new Mars(4, 4)).equals(Rover(3, 3, East)))
    } catch {
      case e: RuntimeException => assert(e.getMessage.equals("Out of mars"))
    }
  }
}
