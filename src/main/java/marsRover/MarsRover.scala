package marsRover

class MarsRover {
  def marsRover(accumulator: Rover, sequence: List[Char]): Rover = {
    sequence match {
      case Nil => accumulator
      case head :: tail if head == 'M' => marsRover(accumulator.move(), tail)
      case head :: tail => marsRover(accumulator.turn(head), tail)
    }
  }
}
