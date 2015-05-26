package marsrover

trait Direction {
  def turn(dir: Char) = if(dir == 'R') turnRight() else if(dir == 'L') turnLeft() else throw new RuntimeException("Turning to L/R directions are allowed")
  def turnRight() : Direction
  def turnLeft() : Direction
}
