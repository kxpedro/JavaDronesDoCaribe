/*
    Criado por Pedro Henrique Rech Sarmento
*/
package DroneDoCaribe;
/* 
    Lógica:
    O que eu fiz foi levar em conta um grau zerado e
    conforme o controle é selecionado é realizado uma soma de 90,
    assim fechando no maximo 360 graus.
    Cada vez que é realizada a soma,
    o sentido do drone(Esquerda ou Direita) é alterado.
*/
//Definição da Classe
public class Drone {
    //Atributos Inicializados
    private int g = 0;    
    private int y = 0; 
    private int x = 0; 
    private String cardeal;
    private String control = "";
    
    //Construtor
    public Drone(int x, int y, String cardeal){
        this.x=x;
        this.y=y;
        this.cardeal=cardeal;
    }    
    // Getters
    public int getY(){return y;}    
    public int getX(){return x;}
    public String getC(){return cardeal;}   
    
    //Métodos
    public void Controle(String control){        
        if(control == "E"){            
            System.out.println("Controle: " + control);   
            g = g + 90;            
            if(g == 360){g=0;cardeal = "N";}   
            if(g == 270){cardeal = "L";}
            if(g == 180){cardeal = "S";}
            if(g == 90){cardeal = "O";}                
            System.out.println("Sentido: " + cardeal);               
            System.out.println("-----------------------------");             
        }
        if(control == "D"){
            System.out.println("Controle: " + control);  
            g = g + 90;
            if(g == 360){g=0;cardeal = "N";}   
            if(g == 270){cardeal = "O";}
            if(g == 180){cardeal = "S";}
            if(g == 90){cardeal = "L";}             
            System.out.println("Sentido: " + cardeal);          
            System.out.println("-----------------------------");                              
        }       
        if(control == "M"){
            System.out.println("Controle: " + control);
            if(cardeal == "N"){y++;}
            if(cardeal == "S"){y--;}
            if(cardeal == "O"){x--;}
            if(cardeal == "L"){x++;}                                         
            System.out.println("Coordenadas: " + x + "," + y + " " + cardeal);            
            System.out.println("-----------------------------");            
        }       
    }
}
