package marsrover

case object North extends Direction {
  override def turnRight(): Direction = East
  override def turnLeft(): Direction = West
}