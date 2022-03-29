package com.generation.sustech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo tipo é obrigatório e não pode conter espaços em branco")
	@Size(min = 3, max = 50, message = "O atributo tipo deve conter no mínimo 3 e no máximo 50 caracteres")
	private String tipo;
	
	@NotNull(message = "O atributo palavra chave é Obrigatório!")
	@Size(min = 3, max = 15, message = "O atributo palavra chave deve conter no mínimo 3 e no máximo 15 caracteres")
	private String palavraChave;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}
	
}

	    
	    
		
		
		
		

	