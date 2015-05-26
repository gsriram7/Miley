package marsrover

case class Rover(x:Int, y:Int, direction:Direction) {
  def turnAside(dir: Char) = Rover(x, y, direction.turn(dir))
  def moveForward() = direction.move(this)
}

