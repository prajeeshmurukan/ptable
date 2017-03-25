package com.dataextractor.periodictable.model;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class PeriodicTable {
	
	private Date generatedAt = null;
	private ArrayList<Element> elements = new ArrayList<Element>();

	public PeriodicTable() {
		// TODO Auto-generated constructor stub
	}

	public Date getGeneratedAt() {
		return generatedAt;
	}

	public void setGeneratedAt(Date generatedAt) {
		this.generatedAt = generatedAt;
	}

	public ArrayList<Element> getElements() {
		return elements;
	}

	public void setElements(ArrayList<Element> elements) {
		this.elements = elements;
	}

	@Override
	public String toString() {
		return "PeriodicTable [generatedAt=" + generatedAt + ", elements=" + elements + ", getGeneratedAt()="
				+ getGeneratedAt() + ", getElements()=" + getElements() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elements == null) ? 0 : elements.hashCode());
		result = prime * result + ((generatedAt == null) ? 0 : generatedAt.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeriodicTable other = (PeriodicTable) obj;
		if (elements == null) {
			if (other.elements != null)
				return false;
		} else if (!elements.equals(other.elements))
			return false;
		if (generatedAt == null) {
			if (other.generatedAt != null)
				return false;
		} else if (!generatedAt.equals(other.generatedAt))
			return false;
		return true;
	}
	
	

}
