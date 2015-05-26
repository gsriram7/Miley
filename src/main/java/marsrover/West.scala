package marsrover

case object West extends Direction {
  override def turnRight(): Direction = North
  override def turnLeft(): Direction = South
}
