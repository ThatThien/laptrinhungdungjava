*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BaiTap;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Bai1 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên n");
        n=sc.nextInt();
      boolean ok =true;
        for ( i = 2; i < n-1; i++) {
            if(n%i==0){
                ok=false;
                break;
            }
        }
        i++;
        System.out.println(ok);
    }
 }
