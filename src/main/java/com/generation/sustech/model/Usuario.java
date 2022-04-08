package com.generation.sustech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Olá, inserir o nome é obrigatório!")
	private String nome;

	@NotNull(message = "Olá, inserir o login do usuário é obrigatório!")
	@Email(message = "E-mail invalido, insira um email correto!")
	private String usuario;

	@NotBlank(message = "Olá, inserir a senha é obrigatório!")
	@Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres")
	private String senha;


	@NotBlank(message = "Olá, inserir o tipo é obrigatório!")
	@Size(min = 3, max =10, message = "escolha entre cliente ou ONG")
	private String tipo;
	
	private String foto;
	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}