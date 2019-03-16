package quadmain;

public class Paralelogramo extends Trapezio
{
    public Paralelogramo(Ponto pontoA, Ponto pontoB, Ponto pontoC, Ponto pontoD)
    {
        super(pontoA, pontoB, pontoC, pontoD);
        
        System.out.print(" >>> Paralelogramo");
    }
    
    public Paralelogramo()
    {
    	super();
        System.out.print(" >>> Paralelogramo");
    }
    
    public double AreaParalelogramo()
    {
        return BaseMaior() * Altura();
    }
}
