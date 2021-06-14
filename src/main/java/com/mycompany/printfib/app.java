/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.printfib;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author TomTPC < vanthanh7452 at Gmail.com >
 */
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Fib = new ArrayList<>();
        Fib.add(1);
        Fib.add(1);
        int n = 30;
        for(int i = 2; i < n ; i++){
            int temp = Fib.get(i-2) + Fib.get(i-1);
            Fib.add(temp);
        }
        for(Integer a: Fib){
            System.out.println(a+"\t"); 
        }
        System.out.println(Fib.size());
    }
}
