package dominio;

public class Cena {

    private String identificador;

    private List<Conhecimento> objetivos;

    private String descricao;

    private TipoDeCena tipoDeCena;

    public Cena(String identificador, String descricao, TipoDeCena tipoDeCena) {
        this.identificador = identificador;
        this.objetivos = List<>();
        this.descricao = descricao;
        this.tipoDeCena = tipoDeCena;
    }

}