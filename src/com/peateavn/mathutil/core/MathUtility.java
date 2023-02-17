/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peateavn.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {
    public static final double PI = 3.1415;
    
    //hàm getFactorial() là hàm tính n!
    //quy ước n! = 1 x 2 x 3 x....x n
    //        0! = 1! = 1
    //        ko có giai thừa của số âm
    //Thiết kế của hàm tính giai thưa của chúng ta là :
    // hàm không tính giai thừa âm, nếu đưa âm giai thừa, CHỨI
    //                              ĐẬP VÀO MẶT NGƯỜI XÀI HÀM 1 EXCEPTION
    //- hàm ko tính giai thừa quá to, ko tính giai thừa 21 trở lên
    // vì kiểu long chỉ có tối đa 18 số 0
    // mà 21 giai thừa lớn hơn 18 số 0, tràn kiểu long, tính sai
    // CHỬI LUÔN, KO SUPPORT GIAI THỪA ÂM, GIAI THỪA QUÁ BỰ!!!
    //Người QC phải kiểm tra xem hàm có hành xử đúng như thiết kế 
    // hay ko??? phải test, thử nghiệm các TÌNH HUỐNG XÀI HÀM
    //                                 các TEST CASE
    public static long getFactorial(int n){
        if(n < 0 || n > 21)
            throw new IllegalArgumentException("Invalid n. n must be between 0 21");
        if(n == 0 || n ==1 )
            return 1 ;
        // sống ót đến lệnh dưới đây , sure n = 2..20
        long product = 1 ; // tích nhân dồn !!!
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}

    