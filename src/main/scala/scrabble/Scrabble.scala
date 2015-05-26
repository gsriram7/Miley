package scrabble

class Scrabble {
  val grid: Seq[Seq[String]] = Array(  Array("TW","","","DL","","","","TW","","","","DL","","","TW").toSeq,  Array("","DW","","","","TL","","","","TL","","","","DW","").toSeq,  Array("","","DW","","","","DL","","DL","","","","DW","","").toSeq,  Array("DL","","","DW","","","","DL","","","","DW","","","DL").toSeq,  Array("","","","","DW","","","","","","DW","","","","").toSeq,  Array("","TL","","","","TL","","","","TL","","","","TL","").toSeq,  Array("","","DL","","","","DL","","DL","","","","DL","","").toSeq,  Array("TW","","","DL","","","","DW","","","","DL","","","TW").toSeq,  Array("","","DL","","","","DL","","DL","","","","DL","","").toSeq,  Array("","TL","","","","TL","","","","TL","","","","TL","").toSeq,  Array("","","","","DW","","","","","","DW","","","","").toSeq,  Array("DL","","","DW","","","","DL","","","","DW","","","DL").toSeq,  Array("","","DW","","","","DL","","DL","","","","DW","","").toSeq,  Array("","DW","","","","TL","","","","TL","","","","DW","").toSeq,  Array("TW","","","DL","","","","TW","","","","DL","","","TW").toSeq)

  def scrabble(word: Word, point: Position, input: List[Char], dir:Char):Int ={
    input match {
      case Nil => word.resultantScore
      case x :: y if grid(point.x)(point.y).equals("DW") => scrabble(word.doubleWord(x), point.shiftPosition(dir), y, dir)
      case x :: y if grid(point.x)(point.y).equals("TW") => scrabble(word.tripleWord(x), point.shiftPosition(dir), y, dir)
      case x :: y => scrabble(word.computeScore(grid(point.x)(point.y), x), point.shiftPosition(dir), y, dir)
    }
  }

}
