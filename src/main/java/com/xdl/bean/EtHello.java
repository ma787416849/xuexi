package com.xdl.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class EtHello implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String hello;
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EtHello(int id, String hello) {
		super();
		this.id = id;
		this.hello = hello;
	}
	public EtHello() {
		super();
	}
	@Override
	public String toString() {
		return "EtHello [id=" + id + ", hello=" + hello + "]";
	}

	
	
}
