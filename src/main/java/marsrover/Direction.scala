package marsrover

trait Direction {
  def turn(dir: Char) = if(dir == 'R') turnRight() else if(dir == 'L') turnLeft() else throw new RuntimeException("Turning to L/R directions are allowed")
  def turnRight() : Direction
  def turnLeft() : Direction
}

case object East extends Direction {
  override def turnRight(): Direction = South
  override def turnLeft(): Direction = North
}

case object North extends Direction {
  override def turnRight(): Direction = East
  override def turnLeft(): Direction = West
}

case object West extends Direction {
  override def turnRight(): Direction = North
  override def turnLeft(): Direction = South
}

case object South extends Direction {
  override def turnRight(): Direction = West
  override def turnLeft(): Direction = East
}

