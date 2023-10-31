package br.ufrpe.comercio;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    public Cliente(String cpf, String nome, LocalDate dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int calcularIdade(){
        LocalDate atual = LocalDate.now();
        Period p = Period.between(dataNascimento, atual);
        return p.getYears();
    }
}
