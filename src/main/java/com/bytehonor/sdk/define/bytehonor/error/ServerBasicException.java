package com.bytehonor.sdk.define.bytehonor.error;


import com.bytehonor.sdk.define.bytehonor.code.StandardCode;

public class ServerBasicException extends StandardException {

	private static final long serialVersionUID = 8241747723232910227L;
	
	public ServerBasicException() {
		super();
		this.setCode(StandardCode.UNDEFINED_ERROR);
	}

	public ServerBasicException(int code, String message) {
		super(code, message);
	}
}
