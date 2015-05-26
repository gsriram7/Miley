package scrabble

import org.scalatest.FunSuite

class ScrabbleTest extends FunSuite {

  test("Should check whether score for bootcamp is 34") {
    assert(new Scrabble().scrabble(new Word(1, 1, 0), Position(8, 7), "bootcamp".toCharArray.toList, 'D') == 34)
  }

}
