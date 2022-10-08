package com.example.Spring_Data_JPA.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChungNhanPK implements Serializable{

	private String nhanVien;
	private int mayBay;
	
	public ChungNhanPK() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(mayBay, nhanVien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChungNhanPK other = (ChungNhanPK) obj;
		return mayBay == other.mayBay && Objects.equals(nhanVien, other.nhanVien);
	}
}