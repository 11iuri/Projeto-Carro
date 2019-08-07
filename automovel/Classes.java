package pkginterface.automovel;

public abstract class Classes {
    private String cor;
    private String modelo;
    private boolean status;
    private float PrecoCombustivel;
    private int NiveldeCombustivel;
    
public Classes () {
    this.cor = "Preto";
    this.modelo = "Z1";
    this.status = false;
}
   
    public void ligar (){
        this.status = true;
        System.out.println("Veiculo Ligado");
   }
    public void desligar (){
        this.status = false;
        System.out.println("Veiculo desligado");
    }
    public void abastecer (){
        this.status = false;
        System.out.println("Abastecendo o carro");
    }
    public void acelerar (){
        this.status = true;
        System.out.println("Carro em movimento");
    }
    public void trocarPneu (){
        System.out.println("Pneu Trocado");
    }
    
}

