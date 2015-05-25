package marsRover

class MarsRover {
  def marsRover(finalPosition: Rover, sequence: List[Char]): Rover = {
    sequence match {
      case Nil => finalPosition
      case head :: tail if head == 'M' => marsRover(finalPosition.move(), tail)
      case head :: tail => marsRover(finalPosition.turn(head), tail)
    }
  }
}
