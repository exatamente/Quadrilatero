package quadmain;

public class Quadrado extends Paralelogramo
{
    public Quadrado(Ponto pontoA, Ponto pontoB, Ponto pontoC, Ponto pontoD)
    {
        super(pontoA, pontoB, pontoC, pontoD);
                
        System.out.print(" >>> Quadrado");
    }
    
    public Quadrado()
    {
    	super();
        System.out.print(" >>> Quadrado");
    }
    
    public double AreaQuadrado()
    {
        return Math.pow(BaseMaior(), 2);
    }
}
