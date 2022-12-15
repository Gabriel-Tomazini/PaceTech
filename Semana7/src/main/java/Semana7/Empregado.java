package Semana7;


public class Empregado {
    
    private String nome, sobreNome;
    private float salario;
    
    public Empregado() {
        
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        if (salario < 0) {
            this.salario = 0;
        }
        else{
            this.salario = salario;
        }
    } 
}
