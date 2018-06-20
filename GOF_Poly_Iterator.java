/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gof_poly_iterator;

/**
 *
 * @author Daddy
 */
public class GOF_Poly_Iterator {

    private static void PrintAll(MyIterator myIter){
        myIter.First();
        
        while(!myIter.IsDone()){
            System.out.println(myIter.CurrentItem());
            myIter.Next();
        }   
        
    }
    static int[] aList = {2,3,4,5,6,7,8,9};
    static double[] dList = {1.2,2.3,3.4,4.5,5.6,6.7,7.8};
    public static void main(String[] args) {
        MyIntIterator myIter = new MyIntIterator(aList);
        MyDoubleIterator myDIter = new MyDoubleIterator(dList);
        
        PrintAll(myIter);
        PrintAll(myDIter);
    }
    
}
