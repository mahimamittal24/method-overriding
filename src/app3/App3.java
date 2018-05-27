/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app3;

/**
 *
 * @author hp
 */
class Sum
{
    int a=10,b=20,c;
    void add()
    {
        c=a+b;
    }
    void display()
    {
        System.out.print(c);
    }
}
class Result extends Sum
{
    Result()
    {
        super();
        
        
    }

    @Override
    void add() {
        super.add(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
public class App3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Result obj=new Result();
       obj.add();
       obj.display();
        // TODO code application logic here
    }
    
}
