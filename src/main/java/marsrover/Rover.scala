package marsrover

case class Rover(x:Int, y:Int, direction:Direction) extends Moveable {
  def turn(dir: Char) = Rover(x, y, direction.turn(dir))
  def moveForward() = move(this)
}

