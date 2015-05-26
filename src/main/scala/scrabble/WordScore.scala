package scrabble

trait WordScore {
  def computeScore(score: Int): Int
}

case class DoubleWordScore extends WordScore{
  override def computeScore(score: Int): Int = score * 2
}

case class TripleWordScore extends WordScore{
  override def computeScore(score: Int): Int = score * 3
}
