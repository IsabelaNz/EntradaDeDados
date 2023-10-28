package entradadedados;

 

import digitacao.EntradaTeclado;

 

public class EntradaDeDados {

 

    public static void main(String[] args) {
        EntradaTeclado teclado = new EntradaTeclado();
        String nome = teclado.texto("Digite seu nome");
        double altura = 0.0d;
        int idade = teclado.inteiro("Digite sua idade",
        "Erro! Digite um valor numérico", true);
        boolean erro = false;
        do{
        try{
            altura = teclado.decimal ("Digite sua altura em metros: ");
            erro = false;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            erro = true;
            altura = 0.0d;
        }
    } while (erro == true);
  }
}