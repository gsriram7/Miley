package marsRover

case class Rover(x: Int, y: Int, direction: Char) {

  def move(): Rover = {
    def moveWest(): Rover = Rover(x - 1, y, 'W')
    def moveEast(): Rover = Rover(x + 1, y, 'E')
    def moveNorth(): Rover = Rover(x, y + 1, 'N')
    def moveSouth(): Rover = Rover(x, y - 1, 'S')
    val moveForward = Map('W' -> moveWest, 'E' -> moveEast, 'N' -> moveNorth, 'S' -> moveSouth)
    moveForward(direction)
  }

  def turn(direction: Char): Rover = {
    val directions: Seq[Char] = Array('N', 'E', 'S', 'W')
    if (direction == 'R')
      Rover(this.x, this.y, directions((directions.indexOf(this.direction) + 1 + 4) % 4))
    else
      Rover(this.x, this.y, directions((directions.indexOf(this.direction) - 1 + 4) % 4))
  }
}

