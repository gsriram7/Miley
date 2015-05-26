package marsrover

trait Direction {
  def turn(dir: Char) = if(dir == 'R') turnRight() else if(dir == 'L') turnLeft() else throw new RuntimeException("Turning to L/R directions are allowed")
  def turnRight() : Direction
  def turnLeft() : Direction
  def move(rover: Rover): Rover
}

case object East extends Direction {
  override def turnRight(): Direction = South
  override def turnLeft(): Direction = North

  override def move(rover: Rover): Rover = Rover(rover.x + 1, rover.y, rover.direction)
}

case object North extends Direction {
  override def turnRight(): Direction = East
  override def turnLeft(): Direction = West
  override def move(rover: Rover) = Rover(rover.x, rover.y + 1, rover.direction)
}

case object West extends Direction {
  override def turnRight(): Direction = North
  override def turnLeft(): Direction = South
  override def move(rover: Rover): Rover = Rover(rover.x - 1, rover.y, rover.direction)
}

case object South extends Direction {
  override def turnRight(): Direction = West
  override def turnLeft(): Direction = East
  override def move(rover: Rover): Rover = Rover(rover.x, rover.y - 1, rover.direction)
}

