package marsRover

import org.scalatest.FunSuite

class MarsRoverTest extends FunSuite {
  test("Should test simple movement for the rover") {
    assert(new MarsRover().marsRover(Rover(1, 2, 'N'), "LMLMLMLMM".toCharArray.toList).equals(Rover(1, 3, 'N')))
  }

  test("Should test complex movement for the rover") {
    assert(new MarsRover().marsRover(Rover(3, 3, 'E'), "MMRMMRMRRM".toCharArray.toList).equals(Rover(5, 1, 'E')))
  }

  test("Should test for null input") {
    assert(new MarsRover().marsRover(Rover(3, 3, 'E'), "".toCharArray.toList).equals(Rover(3, 3, 'E')))
  }
}
