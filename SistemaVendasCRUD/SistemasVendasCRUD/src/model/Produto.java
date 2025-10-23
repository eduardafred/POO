package model;

import javafx.beans.property.*;

public class Produto {
	private final IntegerProperty id;
	private final StringProperty nome;
	private IntegerProperty estoque;
	private IntegerProperty categoria_id;
	private StringProperty preco;
	private StringProperty descricao;
				
	public Produto() {
		this.id = new SimpleIntegerProperty();
		this.nome = new SimpleStringProperty();
		this.estoque = new SimpleIntegerProperty();
		this.categoria_id = new SimpleIntegerProperty();
		this.preco = new SimpleStringProperty();
		this.descricao = new SimpleStringProperty();
	}
	
	public Produto(String nome, Integer estoque, Integer categoria_id, String preco, String descricao) {
		this();
		this.nome.set(nome);
		this.estoque.set(estoque);
		this.categoria_id.set(categoria_id);
		this.preco.set(preco);
		this.descricao.set(descricao);
	}
	
	//Getters e Setters para as propriedades
	public int getId() {
		return id.get();
	}
	
	public void setId(int id) {
		this.id.set(id);
	}
	
	public IntegerProperty idProperty() {
		return id;
	}
	public String getNome() {
		return nome.get();
	}
	
	public void setNome(String nome) {
		this.nome.set(nome);
	}
	
	public StringProperty nomeProperty() {
		return nome;
	}
	
	public int getEstoque() {
		return estoque.get();
	}
	
	public void setEstoque(int estoque) {
		this.estoque.set(estoque);
	}
	
	public IntegerProperty estoqueProperty() {
		return estoque;
	}
	
	public int getCategoriaId() {
		return categoria_id.get();
	}
	
	public void setCategoriaIs(int categoria_id) {
		this.categoria_id.set(categoria_id);
	}
	
	public IntegerProperty categoriaIdProperty() {
		return categoria_id;
	}
	
	public String getPreco() {
		return preco.get();
	}
	
	public void setPreco(String preco) {
		this.preco.set(preco);
	}
	
	public StringProperty precoProperty() {
		return preco;
	}
	
	public String getDescricao() {
		return descricao.get();
	}
	
	public void setDescricao(String descricao) {
		this.descricao.set(descricao);
	}
	
	public StringProperty descricaoProperty() {
		return descricao;
	}	
	
	public String toString() {
		return nome.get();
	}
	
}


