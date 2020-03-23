import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FractionAssertJTest {
    
    @Test
    public void addTwoFractionsToFull(){
        assertThat(Fraction.of(1,2).add(Fraction.of(1,2))).isEqualTo(Fraction.FULL);
    }
    
    @Test
    public void addTwoFractionsToHalf(){
        assertThat(Fraction.of(0,2).add(Fraction.of(1,2))).isEqualTo(Fraction.of(2,4));
    }
    
    @Test
    public void addTwoFractionsToOneThird(){
        assertThat(Fraction.of(1,9).add(Fraction.of(2,9))).isEqualTo(Fraction.of(27,81));
    }
    
    @Test
    public void multiplyTwoFractionsToFull(){
        assertThat(Fraction.of(1,1).multiply(Fraction.of(1,1))).isEqualTo(Fraction.FULL);
    }
    
    @Test
    public void multiplyTwoFractionsToHalf(){
        assertThat(Fraction.of(1,2).multiply(Fraction.of(1,1))).isEqualTo(Fraction.HALF);
    }
    
    @Test
    public void multiplyTwoFractionsToOneThird(){
        assertThat(Fraction.of(1,3).multiply(Fraction.of(1,1))).isEqualTo(Fraction.ONE_THIRD);
    }
    
    @Test
    public void multiplyTwoFractionsToIndeterminate(){
        assertThat(Fraction.of(0,0).multiply(Fraction.of(3,3))).isEqualTo(Fraction.INDETERMINATE);
    }
    
    @Test
    public void testFull(){
        assertThat(Fraction.of(1,1)).isEqualTo(Fraction.FULL);
    }
    
    @Test
    public void testHalf(){
        assertThat(Fraction.of(1,2)).isEqualTo(Fraction.HALF);
    }
    
    @Test
    public void testOneThird(){
        assertThat(Fraction.of(1,3)).isEqualTo(Fraction.ONE_THIRD);
    }
    
    @Test
    public void testToString(){
        assertThat(Fraction.of(1,3).toString()).isEqualTo("1/3");
    }
    
    
    @Test
    public void testReturnDoubleValue(){
        assertThat(Fraction.of(1,3).doubleValue()).isBetween(0.2,0.4);
    }
    
    @Test
    public void testOneIndeterminate(){
        assertThat(Fraction.of(0,0)).isEqualTo(Fraction.INDETERMINATE);
    }
    
    @Test
    public void testThrowException() throws Exception {
        assertThatThrownBy(() -> Fraction.of(2, 0)).isInstanceOf(IllegalArgumentException.class);
    }

}
