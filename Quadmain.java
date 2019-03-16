package quadmain;

public class Quadmain 
{
    public static void main(String[] args) 
    {
        Ponto p1 = new Ponto(1,1);
        Ponto p2 = new Ponto(5,1);
        Ponto p3 = new Ponto(5,3);
        Ponto p4 = new Ponto(2,3);

        Trapezio q1 = new Trapezio(p1, p2, p3, p4);
        
        System.out.println();
        
        System.out.println("A: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("B: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("C: (" + p3.getX() + ", " + p3.getY() + ")");
        System.out.println("D: (" + p4.getX() + ", " + p4.getY() + ")");

        System.out.println(q1.Altura() + " | " + q1.BaseMaior() + " | " + q1.BaseMenor());
        System.out.println("Area: " + q1.AreaTrapezio());
        
        System.out.println();
        
        // =============================================== //
 
        Ponto p5 = new Ponto(0,0);
        Ponto p6 = new Ponto(10,0);
        Ponto p7 = new Ponto(0,10);
        Ponto p8 = new Ponto(10,10);
        
        Quadrado q2 = new Quadrado(p5, p6, p7, p8);
        
        System.out.println();
        
        System.out.println("E: (" + q2.getPontoA().getX() + ", " + q2.getPontoA().getY() + ")");
        System.out.println("F: (" + q2.getPontoB().getX() + ", " + q2.getPontoB().getY() + ")");
        System.out.println("G: (" + q2.getPontoC().getX() + ", " + q2.getPontoC().getY() + ")");
        System.out.println("H: (" + q2.getPontoD().getX() + ", " + q2.getPontoD().getY() + ")");
        
        System.out.println("Area: " + q2.AreaQuadrado());
        
        System.out.println();
        
        // =============================================== //
        // experimentando polimorfismo(?!)
        
        Trapezio q3 = new Quadrado(p5, p6, p7, p8);
        
        System.out.println();
        
        System.out.println("Area do Trapezio: " + q3.AreaTrapezio());
        
    	System.out.println();
        
        // =============================================== //
    	// usando Scanner de Ponto
    	
    	Ponto p9 = new Ponto();
    	Ponto p10 =  new Ponto();
    	Ponto p11 =  new Ponto();
    	Ponto p12 =  new Ponto();
    	
    	Paralelogramo q4 = new Paralelogramo(p9, p10, p11, p12);
    	
    	System.out.println();
    	
    	System.out.println("Area do Paralelogramo: " + q4.AreaParalelogramo());
    }
}
