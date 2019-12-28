package org.vikram.bishwajit.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Bishwajit.
 *
 */
@XmlRootElement
public class ErrorCode {
	private String errorMessage;
	private String errorCode;
	private String documentation;

	public ErrorCode() {
		// TODO Auto-generated constructor stub
	}

	public ErrorCode(String errorMessage, String errorCode, String documentation) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.documentation = documentation;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the documentation
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * @param documentation the documentation to set
	 */
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
	

}
