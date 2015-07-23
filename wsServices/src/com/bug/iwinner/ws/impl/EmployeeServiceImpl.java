package com.bug.iwinner.ws.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;

import com.bug.iwinner.ws.dto.BugDTO;

@WebService(targetNamespace = "http://impl.ws.iwinner.bug.com/", endpointInterface = "com.bug.iwinner.ws.impl.EmployeeServiceIF", portName = "EmployeeServiceImplPort", serviceName = "EmployeeServiceImplService")
@InInterceptors(interceptors = "com.bug.iwinner.message.basic.auth.BasicAuthAuthorizationInterceptor")
public class EmployeeServiceImpl implements EmployeeServiceIF{

	public String getUserMessage(String username) throws Exception {
		
		String reply="Welcome :"+username;
		
		return reply;
	}

	public BugDTO[] getBugDetails() throws Exception {
		BugDTO[] bugDTO=null;
		List<BugDTO> listOfBug=new ArrayList<BugDTO>();
		BugDTO bug=new BugDTO();
		bug.setId(10);
		bug.setBugName("Spotify Error Page");
		bug.setBugInfo("Spotify Bug is created bcs of Spotifu website is down");
		bug.setBugDoubleId(10d);
		bug.setBugFloatId(12f);
		bug.setBugLongId(100l);
		bug.setDate(new Date());

		BugDTO bug1=new BugDTO();
		bug1.setId(20);
		bug1.setBugName("Rec Error Page");
		bug1.setBugInfo("Spotify Bug is created bcs of Spotifu website is down");
		bug1.setBugDoubleId(10d);
		bug1.setBugFloatId(12f);
		bug1.setBugLongId(100l);
		bug1.setDate(new Date());
		
		BugDTO bug2=new BugDTO();
		bug2.setId(30);
		bug2.setBugName("BIM Error Page");
		bug2.setBugInfo("Spotify Bug is created bcs of Spotifu website is down");
		bug2.setBugDoubleId(10d);
		bug2.setBugFloatId(12f);
		bug2.setBugLongId(100l);
		bug2.setDate(new Date());
		
		listOfBug.add(bug);
		listOfBug.add(bug1);
		listOfBug.add(bug2);
		int i=0;
		bugDTO=new BugDTO[listOfBug.size()];
		for(BugDTO bugI:listOfBug){
			bugDTO[i++]=bugI;
		}
		
		return bugDTO;

	}
	
	public Integer insertEmployeeDetails(BugDTO bugDTO) throws Exception {

		System.out.println(bugDTO.toString()+"  "+bugDTO.getBugDesc()+"  "+bugDTO.getBugInfo());
		return 10;
	}

}
