package com.cg.demo.pc2;

public class Customer {

	int cid;
	String name;

	public Customer() {
		super();
	}

	public Customer(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}

	static void search() {
		// code
	}

	void purchase() {
		// code
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Customer other = (Customer) obj;
		if (cid != other.cid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + "]";
	}

}
