import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public boolean calcularNome(){
        return this.nome.length() >= 5;
    }

    public  boolean maiorDeIdade(){
        return Period.between(this.idade, localDate.now()).getYears() >= 18;
    }
}
