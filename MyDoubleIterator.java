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
public class MyDoubleIterator implements MyIterator {
   double[] list;
    int  current, last;
    public MyDoubleIterator(double[] list){
        this.list = list;
        current = 0; 
        last = list.length;
    }
    
    public void First(){
        current = 0;
    }
    public void Next(){
          current++;
    }
    public boolean IsDone(){
        return current == last;
    }
    
    public Object CurrentItem(){
        return list[current];
    } 
}
