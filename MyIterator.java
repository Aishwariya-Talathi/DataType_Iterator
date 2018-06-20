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
public interface MyIterator {
    public void First();
    public void Next();
    public Object CurrentItem();
    public boolean IsDone();
}
