package br.com.robsonaraujo.model.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hello")
public class Hello implements Serializable {
	private static final long serialVersionUID = -2254212159198137200L;
	
	public Hello() {
		
	}

	public Hello(String mensagem) {
		this.mensagem = mensagem;
	}

	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
