package marsrover

trait Moveable {
  def move(rover2: Rover) = if (rover2.direction == North) moveNorth(rover2) else if (rover2.direction == West) moveWest(rover2) else if (rover2.direction == South) moveSouth(rover2) else moveEast(rover2)

  def moveNorth(rover2: Rover) = Rover(rover2.x, rover2.y + 1, rover2.direction)

  def moveEast(rover2: Rover) = Rover(rover2.x + 1, rover2.y, rover2.direction)

  def moveSouth(rover2: Rover) = Rover(rover2.x, rover2.y - 1, rover2.direction)

  def moveWest(rover2: Rover) = Rover(rover2.x - 1, rover2.y, rover2.direction)
}
