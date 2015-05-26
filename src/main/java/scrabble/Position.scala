package scrabble

case class Position(x:Int, y:Int){
  def shiftPosition(dir:Char) = {
    val newPosition = Map('R' -> Position(x, y + 1), 'D' -> Position(x - 1, y))
    newPosition(dir)
  }
}
