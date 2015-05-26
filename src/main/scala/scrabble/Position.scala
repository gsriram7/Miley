package scrabble

case class Position(x:Int, y:Int){
  def shiftPosition(dir:Char) = {
    def moveRight: Position = Position(x, y + 1)

    def moveDown: Position = Position(x - 1, y)

    val newPosition = Map('R' -> moveRight, 'D' -> moveDown)
    newPosition(dir)
  }
}
