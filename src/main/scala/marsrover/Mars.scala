package marsrover


case class Mars(rows: Int, cols: Int) {
  def isSafe(roverPosition: Rover)= roverPosition.x < rows && roverPosition.y < cols
}
