import org.scalatest.FunSuite

class SimpleAdderTest extends FunSuite {
  test("Test addition"){
    assert(new SimpleAdder().add(5, 2) == 7)
  }
  test("Test addition fails"){
    assert(new SimpleAdder().add(5, 2) == 9)
  }

}
