package quadmain;

import java.util.Scanner; 

public class Ponto 
{
    private double x, y;
    
    Scanner entrada = new Scanner(System.in);
    
    public Ponto(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Ponto()
    {
    	System.out.print("Valor de x (na forma 99,99):");
    	this.x = entrada.nextDouble();
    	
    	System.out.print("Valor de y (na forma 99,99):");
    	this.y = entrada.nextDouble();
    }
    
    public double getX() 
    {
        return x;
    }

    public double getY() 
    {
        return y;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public void setY(double y) 
    {
        this.y = y;
    }   
}
