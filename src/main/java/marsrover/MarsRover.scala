package marsrover

class MarsRover {
  def marsRover(roverPosition: Rover, sequence: List[Char]): Rover = {
    sequence match {
      case Nil => roverPosition
      case head :: tail if head == 'M' => marsRover(roverPosition.moveForward(), tail)
      case head :: tail => marsRover(roverPosition.turn(head), tail)
    }
  }
}
