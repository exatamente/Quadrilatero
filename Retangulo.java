package quadmain;

public class Retangulo extends Paralelogramo
{
    public Retangulo(Ponto pontoA, Ponto pontoB, Ponto pontoC, Ponto pontoD)
    {
        super(pontoA, pontoB, pontoC, pontoD);
        
        System.out.print(" >>> Retangulo");
    }
    
    public Retangulo()
    {
    	super();
        System.out.print(" >>> Retangulo");
    }
    
    public double AreaRetangulo()
    { 
        return BaseMaior() * Altura();
    }
    
}
