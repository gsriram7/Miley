package scrabble

import org.scalatest.FunSuite

class ScrabbleTest extends FunSuite {

  test("Should check whether score for bootcamp is 34") {
    val word: Word = new Word(1, 1, 0)
    assert(new Scrabble().scrabble(word, Position(8, 7), "bootcamp".toCharArray.toList, 'D') == 34)
    assert(new Scrabble().scrabble(word, Position(14, 14), "cryptozoologies".toCharArray.toList, 'D') == 999)
    assert(new Scrabble().scrabble(word, Position(0,0), "indix".toCharArray.toList, 'R') == 42)
    assert(new Scrabble().scrabble(word, Position(0,0), "unconsciousness".toCharArray.toList, 'R') == 567)
  }

}
