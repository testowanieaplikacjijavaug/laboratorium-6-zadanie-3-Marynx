import org.junit.Test;

import java.util.concurrent.Callable;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FractionHamcrestTest {
    
    @Test
    public void addTwoFractionsToFull(){
        assertThat(Fraction.of(1,2).add(Fraction.of(1,2)),is(Fraction.FULL));
    }
    
    @Test
    public void addTwoFractionsToHalf(){
        assertThat(Fraction.of(0,2).add(Fraction.of(1,2)),is(Fraction.of(2,4)));
    }
    
    @Test
    public void addTwoFractionsToOneThird(){
        assertThat(Fraction.of(1,9).add(Fraction.of(2,9)),is(Fraction.of(27,81)));
    }
    
    @Test
    public void multiplyTwoFractionsToFull(){
        assertThat(Fraction.of(1,1).multiply(Fraction.of(1,1)),is(Fraction.FULL));
    }
    
    @Test
    public void multiplyTwoFractionsToHalf(){
        assertThat(Fraction.of(1,2).multiply(Fraction.of(1,1)),is(Fraction.HALF));
    }
    
    @Test
    public void multiplyTwoFractionsToOneThird(){
        assertThat(Fraction.of(1,3).multiply(Fraction.of(1,1)),is(Fraction.ONE_THIRD));
    }
    
    @Test
    public void multiplyTwoFractionsToIndeterminate(){
        assertThat(Fraction.of(0,0).multiply(Fraction.of(3,3)),is(Fraction.INDETERMINATE));
    }
    
    @Test
    public void testFull(){
        assertThat(Fraction.of(1,1),is(Fraction.FULL));
    }
    
    @Test
    public void testHalf(){
        assertThat(Fraction.of(1,2),is(Fraction.HALF));
    }
    
    @Test
    public void testOneThird(){
        assertThat(Fraction.of(1,3),is(Fraction.ONE_THIRD));
    }
    
    @Test
    public void testOneIndeterminate(){
        assertThat(Fraction.of(0,0),is(Fraction.INDETERMINATE));
    }
    
    @Test
    public void testToString(){
        assertThat(Fraction.of(1,3).toString(),is("1/3"));
    }
    
    
    @Test
    public void testReturnDoubleValue(){
        assertThat(Fraction.of(1,3).doubleValue(),greaterThan(0.2));
    }
    
    @Test
    public void testThrowException() throws Exception {
        assertThat(exceptionOf(()-> Fraction.of(2, 0)),instanceOf(IllegalArgumentException.class));
    }
    
    public static Throwable exceptionOf(Callable<?> callable) {
        try {
            callable.call();
            return null;
        } catch (Throwable t) {
            return t;
        }
    }
}
