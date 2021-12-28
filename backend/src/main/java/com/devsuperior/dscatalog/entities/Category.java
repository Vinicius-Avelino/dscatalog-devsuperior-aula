package com.devsuperior.dscatalog.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable{

	/**
	 * 
	 */
	
	//Serializable é um padrão para que o objeto possa ser convertido em bites, para passar em rede..
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public Category()
	{
		
		
	}

	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() { //Compara se um objeto é igual ao outro. Dois objetos podem gerar o mesmo código
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) { //Retorna verdadeiro ou falso na comparação de objetos
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
	
	
}