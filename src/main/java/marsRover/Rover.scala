package marsRover

case class Rover(x: Int, y: Int, direction: Char) {

  def move(): Rover = {
    val moveForward = Map('W' -> Rover(x - 1, y, 'W'), 'E' -> Rover(x + 1, y, 'E'), 'N' -> Rover(x, y + 1, 'N'), 'S' -> Rover(x, y - 1, 'S'))
    moveForward(direction)
  }

  def turn(dir: Char): Rover = {
    val directions: Seq[Char] = Array('N', 'E', 'S', 'W')
    val turnSide = Map('R' -> directions((directions.indexOf(direction) + 1 + 4) % 4), 'L' -> directions((directions.indexOf(direction) - 1 + 4) % 4))
    Rover(x, y, turnSide(dir))
  }
}

