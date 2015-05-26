package marsrover

import org.scalatest.FunSuite

class MarsRoverTest extends FunSuite {
  test("Should test simple movement for the rover") {
    assert(new MarsRover().marsRover(Rover(1, 2, North), "LMLMLMLMM".toCharArray.toList).equals(Rover(1, 3, North)))
  }

  test("Should test complex movement for the rover") {
    assert(new MarsRover().marsRover(Rover(3, 3, East), "MMRMMRMRRM".toCharArray.toList).equals(Rover(5, 1, East)))
  }

  test("Should test for null input") {
    assert(new MarsRover().marsRover(Rover(3, 3, East), "".toCharArray.toList).equals(Rover(3, 3, East)))
  }
}
