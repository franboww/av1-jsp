package utils;

import java.util.ArrayList;
import java.util.List;

public class calculadora {
    private double valor1;
    private double valor2;
    private String operacao;
    
    private String erro = "";
    


    public void setValor1(String v1) {
        try{
            this.valor1 = Double.parseDouble(v1);
        }catch (NumberFormatException e){
            this.erro+="<br>O valor 1 parece ser inválido!";
        }
        
    }

    public void setValor2(String v2) {
        if(!operacao.contains("tabuada")){
            try{
                this.valor2 = Double.parseDouble(v2);
            }catch (NumberFormatException e){
                this.erro+="<br>O valor 2 parece ser inválido!";
            }
        }

    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getErro() {
        return erro;
    }

    //true caso não seja vazio
   public boolean validar() {
       return !erro.isEmpty();
    } 
   
   public double calcular(){
       double resultado=0.0;
       
       switch(operacao){
           case "adicao":
               resultado=(valor1 + valor2);
               break;
            case "subtracao":
                resultado=(valor1 - valor2);
               break;
            case "multiplicacao":
                resultado=(valor1 * valor2);
               break;
            case "divisao":
                resultado=(valor1 / valor2);
               break;
            case "tabuada":
                break;
       }
       
       return resultado;
   }
   
  public List tabuada(){
    int numerador[]={1,2,3,4,5,6,7,8,9,10};
    List result = new ArrayList<>();
    
    for (int i =0; i<numerador.length; i++){
        result.add(valor1 * numerador[i]);
    }
    
    return result;
  }  
}

