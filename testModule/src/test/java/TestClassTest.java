import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class TestClassTest {

  @Test
  public void equals() {
    TestClass test1 = new TestClass();
    TestClass test2 = new TestClass();
    assertThat(test1, is(not(test2)));
  }
}