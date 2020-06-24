package com.cities.citiesapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * this class represent table pais
 * 
 * @author j.a.vasconcelos
 *
 */
@Entity(name = "Country")
@Table(name = "pais")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	@Column(name = "nome_pt")
	private String portugueseName;

	@Column(name = "sigla")
	private String code;

	private Integer bacen;
}