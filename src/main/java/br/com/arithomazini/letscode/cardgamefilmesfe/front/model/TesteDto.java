package br.com.arithomazini.letscode.cardgamefilmesfe.front.model;

public class TesteDto {
    private String teste;

    public TesteDto(String teste) {
        this.teste = teste;
    }

    public TesteDto() {
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    @Override
    public String toString() {
        return "TesteDto{" +
                "teste='" + teste + '\'' +
                '}';
    }
}
