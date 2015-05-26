package marsrover

class MarsRover {
  def marsRover(roverPosition: Rover, sequence: List[Char], mars: Mars): Rover = {
    sequence match {
      case Nil => roverPosition
      case head :: tail if head == 'M' => if (mars.isSafe(roverPosition)) marsRover(roverPosition.moveForward(), tail, mars) else throw new RuntimeException("Out of mars")
      case head :: tail => marsRover(roverPosition.turnAside(head), tail, mars)
    }
  }
}
