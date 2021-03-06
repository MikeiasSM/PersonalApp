package br.com.faedocaminhoes.model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Veiculo.class)
public abstract class Veiculo_ {

	public static volatile ListAttribute<Veiculo, Pessoa> pessoas;
	public static volatile ListAttribute<Veiculo, Abastecimento> abastecimentos;
	public static volatile SingularAttribute<Veiculo, String> cor;
	public static volatile SingularAttribute<Veiculo, Usuario> usuario;
	public static volatile SingularAttribute<Veiculo, Integer> id;
	public static volatile SingularAttribute<Veiculo, Fabricante> fabricante;
	public static volatile SingularAttribute<Veiculo, String> modelo;
	public static volatile SingularAttribute<Veiculo, String> placa;

	public static final String PESSOAS = "pessoas";
	public static final String ABASTECIMENTOS = "abastecimentos";
	public static final String COR = "cor";
	public static final String USUARIO = "usuario";
	public static final String ID = "id";
	public static final String FABRICANTE = "fabricante";
	public static final String MODELO = "modelo";
	public static final String PLACA = "placa";

}

