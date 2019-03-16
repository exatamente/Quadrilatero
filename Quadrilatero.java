package quadmain;

import java.util.Scanner; 

public class Quadrilatero 
{
    private Ponto pontoA, pontoB, pontoC, pontoD; 
    
    Scanner entrada = new Scanner(System.in);
    
    public Quadrilatero(Ponto pontoA, Ponto pontoB, Ponto pontoC, Ponto pontoD)
    {       
        this.pontoA = new Ponto(pontoA.getX(), pontoA.getY());
        this.pontoB = new Ponto(pontoB.getX(), pontoB.getY());
        this.pontoC = new Ponto(pontoC.getX(), pontoC.getY());
        this.pontoD = new Ponto(pontoD.getX(), pontoD.getY());
        
        System.out.print("Quadrilatero ");
    }
    
    public Quadrilatero()
    {       
        System.out.print("Quadrilatero ");
    }
    
    public void setPontoA(Ponto pontoA) 
    {
        this.pontoA = pontoA;
    }

    public void setPontoB(Ponto pontoB) 
    {
        this.pontoB = pontoB;
    }

    public void setPontoC(Ponto pontoC) 
    {
        this.pontoC = pontoC;
    }

    public void setPontoD(Ponto pontoD) 
    {
        this.pontoD = pontoD;
    }

    public Ponto getPontoA() 
    {
        return pontoA;
    }

    public Ponto getPontoB() 
    {
        return pontoB;
    }

    public Ponto getPontoC() 
    {
        return pontoC;
    }

    public Ponto getPontoD() 
    {
        return pontoD;
    }  
}
