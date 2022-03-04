package classes.modelo;

public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    //Métodos especiais

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
        //Observe que categoria não está aqui, pois ela vai depender do peso para ser construída.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {//Como setCategoria vai ser um método interno na classe, mudamos de public para private
        //Implementando estrutura aninhada para determinar a categoria
        if(this.peso < 52){
            this.categoria = "Inválida";
        }else if (this.peso <= 70){
            this.categoria = "Leve";
        }else if (this.peso <= 84){
            this.categoria = "Médio";
        }else if (this.peso <= 120){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválida";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();//Modificando o setPeso incluindo setCategoria()
    }
    
    
    
    //Métodos públicos
    public void apresentar(){
        System.out.println("########################################################");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de "+ this.getNacionalidade());
        System.out.println("Com "+this.getIdade() + " anos e " + this.altura+" de altura");
        System.out.println("Pesando "+this.getPeso()+" Kg");
        System.out.println(this.getVitorias()+" Vitórias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
        System.out.println("########################################################");
    
    }
    public void status(){
        System.out.println("########################################################");
        System.out.println(this.getNome()+" pessando "+this.getPeso()+" na categoria "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes!");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes!");
        System.out.println("Empatou "+this.getEmpates()+" vezes!");
        System.out.println("########################################################");
    
    }
    public void ganharLuta(){//Atualiza vitórias
        this.setVitorias(this.getVitorias() + 1);
    
    }
    public void perderLuta(){//Atualiza derrotas
        this.setDerrotas(this.getDerrotas() + 1);
    
    }
    public void empatarLuta(){//Atualiza empates
        this.setEmpates(this.getEmpates() + 1);
    
    }
}
