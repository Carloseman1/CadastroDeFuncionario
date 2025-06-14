package dev.java10x.CadastroDeFuncionarios;
import jakarta.persistence.*;

//Entity ele transforma uma classe em uma entidade do BD
@Entity
@Table(name ="tb_cadastro")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionario;
    private String nome;
    private String email;
    private String cargo;
    private String setor;
    private int idade;

    public FuncionarioModel(){

    }

    public FuncionarioModel(String nome, String email, String cargo, String setor, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
