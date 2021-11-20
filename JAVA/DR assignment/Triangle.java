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
public class Triangle extends Shape {
    double base;
    double hight;
    public Triangle(/*No args*/)
    {
        this.base =5;
        this.hight = 5;
    }
    public Triangle(double b , double h)
    {
        this.base = b;
        this.hight=h;
    }
    @Override
    public double area()
    {
        return(0.5*this.base*this.hight);
    }
    @Override
    public double perimeter ()
    {
        return (this.base+this.hight);
    }
    
    @Override
    public void data()
    {
        System.out.println("the area is : "+this.area()+"\tthe premiter is "+this.perimeter());
    }
}
