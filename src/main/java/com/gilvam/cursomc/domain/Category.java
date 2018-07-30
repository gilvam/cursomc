package com.gilvam.cursomc.domain;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	public Category() {
	}

	public Category(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Category)) return false;
		Category category = (Category) o;
		return Objects.equals(getId(), category.getId()) &&
				Objects.equals(getNome(), category.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getNome());
	}

	@Override
	public String toString() {
		return "Category{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				'}';
	}
}
