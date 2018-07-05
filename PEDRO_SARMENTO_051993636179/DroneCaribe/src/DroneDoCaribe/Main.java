/*
    Criado por Pedro Henrique Rech Sarmento
*/
package DroneDoCaribe;
/*
    Lógica:
    Usando o contrutor, conseguimos criar varios objetos
    como se fossem drones diferentes.
    Inicializamos eles com alguma cordeanda inicial e
    o ponto cardeal em que está direcionado.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Primeiro Drone:");        
        Drone d1 = new Drone(1,2,"N");
        System.out.println("Drone inicia nas cordenadas: "+d1.getX()+" "+d1.getY()+" "+d1.getC());
        d1.Controle("E");
        d1.Controle("M");
        d1.Controle("E");
        d1.Controle("M");
        d1.Controle("E");
        d1.Controle("M");
        d1.Controle("E");
        d1.Controle("M");
        d1.Controle("M");        
        
        System.out.println("Segundo Drone:");        
        Drone d2 = new Drone(3,3,"S");
        System.out.println("Drone inicia nas cordenadas: "+d2.getX()+" "+d2.getY()+" "+d2.getC());
        d2.Controle("M");
        d2.Controle("M");
        d2.Controle("D");
        d2.Controle("M");
        d2.Controle("M");
        d2.Controle("D");
        d2.Controle("M");
        d2.Controle("D");
        d2.Controle("D");
        d2.Controle("M");
        
    }    
}
