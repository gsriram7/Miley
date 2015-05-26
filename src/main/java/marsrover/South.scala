package marsrover

case object South extends Direction {
  override def turnRight(): Direction = West
  override def turnLeft(): Direction = East
}
