/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peateavn.mathutil.main;

import com.peateavn.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       testFactorialGivenRightArgumentReturnsWell();
       testFactorialGivenWrongArgumentThrowsException();
    }
    
    
    //Kiểm thử xem hàm getF() có chửi hay k nếu đưa n cà chớn
    public static void testFactorialGivenWrongArgumentThrowsException(){
        // Test case #5: test case getF() with n = -1
        // Expected value: 1 CÂU CHỬI N NHƯ HẠCH !!!!
        // THIẾT KẾ HÀM TRONG TÌNH HUỐNG NÀY PHẢI XUẤT HIỆN NGOẠI LỆ
        
        System.out.println("Test -1! : expected: AN Illegal Argument Exception is throw"
                        +" | actual: ???");
        MathUtility.getFactorial(-1);
    }
    
    //Kiểm thử xem hàm getF() có được vieests đúng như thiết kế hay ko???
    // thiết kế : đưa n tử tế từ 0 ..20 => tính được n! DÚNG NHƯ KÌ VỌNG
    //            đưa n cà chớn , < 0 hoặc > 20, CHỬI
    // Ta phải giả lập các cách xài của user/của ai đó khác
    //cách xài nghĩa là đưa giá trị nào đó cho hàm => xem hàm
    // trả về
    // Mỗi cách xài hàm, ứng với 1 n thì hàm sẽ chạy với n đó 
    // Mỗi cách xài hàm TA GỌI là 1 TEST CASE
    //Cú pháp con lạc đà camCase notation
    //Tên hàm mang luôn ý nghĩa /mục đích của việc test
    public static void testFactorialGivenRightArgumentReturnsWell(){
        // Test case #1: Tình huống xài hàm số 1
        //              Test getF() with n = 0;
        //Expected value : 1
        // Vietsub: kiểm thử xem hàm getF() với 1 tức là tính 1!
        //      coi có trả về 1 hem
        
        int n = 0;  //tính 0!
        long expectedValue = 1 ;    // hy vọng ói về 1
        long actualValue = MathUtility.getFactorial(n) ;     // hàm tính đi, xem cụ thể mấy
        // kiểm thử là so sánh expected vs actual
        System.out.println("Test " + n + "!: expected: " + expectedValue
                                        + " | actual: " + actualValue);
        //Test case #2: test getF() with n = 1
        //Expected value : 1
        //Vietsub: kiểm tra tình huống xài hàm tính 1 ! coi có 
        // trả về 1 hay hem?
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: expected: " + expectedValue
                                        + " | actual: " + actualValue);        
        //Test case #3: test getF() with n = 2
        //Expected value : 2
        //Vietsub: kiểm tra tình huống xài hàm tính 2 ! coi có 
        // trả về 2 hay hem?
        System.out.println("Test 2!" + n + "!: expected: 2" 
                                        + " | actual: " + MathUtility.getFactorial(2));  
        
    }
        
}
