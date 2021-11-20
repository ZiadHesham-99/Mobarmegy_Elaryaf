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
public class rectangle extends Shape{
    double length;
    double width ;
    public rectangle(/*No args*/)
    {
        this.length=5;
        this.width = 5;
    }
    public rectangle(double l , double w)
    {
        this.length = l;
        this.width = w;
    }
    @Override
    public double area()
    {
        return(this.length * this.width);
    }
    @Override
    public double perimeter ()
    {
        return ((this.length + this.width)*2);
    }
    
    @Override
    public void data()
    {
        System.out.println("the area is : "+this.area()+"\tthe premiter is "+this.perimeter());
    }
}
