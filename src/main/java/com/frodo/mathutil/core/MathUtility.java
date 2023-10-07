/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frodo.mathutil.core;

/**
 *
 * @author ADMIN
 */
// Đây là bộ thư viện chứa các hàm dùng trong tính toán
// toán học, clone giống class Math bên JDK
// Khi gọi là thư viện dùng chung mà ko cần nhớ nhung 
// gì sau khi xử lí -> thư viện chứa đồ STATIC
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //hàm tính n! = 1.2.3...n
    //n < 0 n > 20 ko tính do 21! tràn kiểu long
    //0! = 1! = 1
    public static long getFactorial(int n){
        long result = 1;
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20.");
        
        if (n == 0 || n == 1)
            return 1;
        
        for (int i = 2; i <= n; i++) 
            result *= i;
        
        return result;
    }
}
