
package com.peateavn.mathutil.core.test;


import com.peateavn.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {
    
   //chuẩn bị data là mảng 2 chiều kiểu Object
   //JUnit tự loop duyệt mảng lôi tách data ra
    // giúp ta nhồi // fill// đổ bào hàm assertEquals()
    @Parameterized.Parameters
    public static Object [][] initData() {
        int a[] = {5, 10, 15,20};
       return new Object[][] {{0,1},
                            {1,1},
                            {2,2},
                            {3,6},
                            {4,24},
                            {5,120},
                            {6,720}};
        
    }
    //map từng cột của từng dòng vào 2 biến tương ứng n và expected
    @Parameterized.Parameter(value = 1)//em thích cột 1
    public long expected;
    @Parameterized.Parameter(value = 0)//em thích cột 0

    public int n;
    public int n1;

    //so sánh expected và actual hoy
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected,MathUtility.getFactorial(n));
    }
}
