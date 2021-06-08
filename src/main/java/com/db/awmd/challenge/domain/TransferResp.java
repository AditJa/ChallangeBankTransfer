package com.db.awmd.challenge.domain;

public class TransferResp {

private String message="Amount transfer request is initiated. Please note for further processing results check the Eclipse Console.";
	@Override
	public int hashCode() {
		int result = 1;

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
		return true;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
