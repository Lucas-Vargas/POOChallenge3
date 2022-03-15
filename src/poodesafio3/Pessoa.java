package poodesafio3;

import java.text.DecimalFormat;

public class Pessoa {
    private double pesoIdealM, pesoIdealF, pesoAtual, altura;
    private String gen;
    
    public Pessoa(){
        
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public void pesoIdeal(){
        DecimalFormat df = new DecimalFormat("#,###.00");

        if(this.gen.equals("M")){
            pesoIdealM = (72.7 * altura)-58;
            if(pesoIdealM+2<pesoAtual){
                System.out.println("Você está acima do peso! ele sendo "+df.format(this.pesoIdealM)+"Kg");
            }else if(pesoIdealM-2>pesoAtual){
                System.out.println("Você está abaixo do peso ideal! ele sendo "+df.format(this.pesoIdealM)+"Kg");
            }else {
                System.out.println("Você está dentro do peso ideal!");
            }
        }if(this.gen.equals("F")){
            pesoIdealF = (62.1 * altura)-44.7;
            if(pesoIdealF+2<pesoAtual){
                System.out.println("Você está acima do peso! ele sendo "+df.format(this.pesoIdealF)+"Kg");
            }else if(pesoIdealM-2>pesoAtual){
                System.out.println("Você está abaixo do peso ideal! ele sendo "+df.format(this.pesoIdealF)+"Kg");
            }else {
                System.out.println("Você está dentro do peso ideal!");
            }
        }
    }
    

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
}
    
    
    

