package scrabble

case class Word(dw:Int, tw:Int, totalScore:Int) {
  val score: Seq[Int] = Array(1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10)
  def tripleWord(x:Char) = Word(dw, tw*3, totalScore + score(x - 97))
  def doubleWord(x:Char) = Word(dw*2, tw, totalScore + score(x - 97))
  def computeScore(respectiveGrid: String, x:Char) ={
    val compute = Map[String, (Int) => Int]("TL" -> ((x:Int) => x*3), "DL" -> ((x:Int) => x*2), "" -> ((x:Int) => x))
    Word(dw, tw, totalScore + compute(respectiveGrid)(score(x - 97)))
  }
  def resultantScore() = totalScore * dw * tw
}
