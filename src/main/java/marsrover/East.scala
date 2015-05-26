package marsrover

case object East extends Direction {
  override def turnRight(): Direction = South
  override def turnLeft(): Direction = North
}
