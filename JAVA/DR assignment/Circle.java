/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_asiignment;

/**
 *
 * @author ziad
 */

public class Circle extends Shape{
    double redius;
    public Circle(/*No args*/)
    {
        this.redius =5;
    }
    public Circle(double redius)
    {
        this.redius = redius;
    }
    @Override
    public double area()
    {
        return((2)*(3.14)*(this.redius));
    }
    @Override
    public double perimeter ()
    {
        return (2*(3.14)*(this.redius));
    }
    
    @Override
    public void data()
    {
        System.out.println("the area is : "+this.area()+"\tthe premiter is "+this.perimeter());
    }
}
