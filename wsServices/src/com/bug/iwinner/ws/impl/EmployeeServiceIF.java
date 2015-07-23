package com.bug.iwinner.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.bug.iwinner.ws.dto.BugDTO;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface EmployeeServiceIF {
    @WebMethod(operationName="getUserMessageOps")
	@WebResult(name = "getUserMessageRespone")
	public String getUserMessage(@WebParam(name="username") String username) throws Exception;

	@WebMethod(operationName = "getBugDetailsOps")
	@WebResult(name = "getBugDetailsResponse")
	public BugDTO[] getBugDetails() throws Exception;
	
	
	@WebMethod(operationName = "getInsertEmployeeOps")
	@WebResult(name = "getInsertEmployeeResponse")
	public Integer insertEmployeeDetails(@WebParam(name="bugDTO")BugDTO bugDTO) throws Exception ;
}
