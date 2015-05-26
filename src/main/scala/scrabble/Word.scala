package scrabble

case class Word(dw: Int, tw: Int, totalScore: Int) {
  val score = Map('a' -> 1, 'b' -> 3, 'c' -> 3, 'd' -> 2, 'e' -> 1, 'f' -> 4, 'g' -> 2, 'h' -> 4, 'i' -> 1, 'j' -> 8, 'k' -> 5, 'l' -> 1, 'm' -> 3, 'n' -> 1, 'o' -> 1, 'p' -> 3, 'q' -> 10, 'r' -> 1, 's' -> 1, 't' -> 1, 'u' -> 1, 'v' -> 4, 'w' -> 4, 'x' -> 8, 'y' -> 4, 'z' -> 10)

  def tripleWord(x: Char) = Word(dw, tw * 3, totalScore + score(x))

  def doubleWord(x: Char) = Word(dw * 2, tw, totalScore + score(x))

  def computeScore(respectiveGrid: String, x: Char) = {
    val compute = Map[String, (Int) => Int]("TL" -> ((x: Int) => x * 3), "DL" -> ((x: Int) => x * 2), "" -> ((x: Int) => x))
    Word(dw, tw, totalScore + compute(respectiveGrid)(score(x)))
  }

  def resultantScore() = totalScore * dw * tw
}
