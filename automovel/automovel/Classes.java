package pkginterface.automovel;

public class Classes {
    private String cor;
    private String modelo;
    boolean status;
    private float PrecoCombustivel;
    private int NiveldeCombustivel;
    private int CarroEstragado;
    
public Classes () {
    this.cor = "Preto";
    this.modelo = "Z1";
    this.status = true;
    this.NiveldeCombustivel = 0;
    this.CarroEstragado = 1;
}
   
    public void ligar (){
       if (this.status == true){
        System.out.println("Veiculo Ligado");
   }}
    public void desligar (){
        if (this.status == false){
        System.out.println("Veiculo desligado");
    }}
    public void abastecer (){
       if (this.NiveldeCombustivel == 0){
          System.out.println("Abatecendo o carro");
               if (this.CarroEstragado==0)
                 System.out.println("Carro estragado");
    }
       else {
           System.out.println("Continuar andando");
       }
    }
    public void acelerar (){
        if (this.status = true){
        System.out.println("Carro em movimento");
       if (this.CarroEstragado == 0)
        System.out.println("Carro está estragado");
        }
    }
    public void trocarPneu (){
        if (this.CarroEstragado == 0){
        System.out.println("Pneu Trocado");
        
    } 
    }
    
}

