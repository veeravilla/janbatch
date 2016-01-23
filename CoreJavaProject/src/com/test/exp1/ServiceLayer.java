package com.test.exp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.omg.CORBA.DATA_CONVERSION;

public class ServiceLayer {
	
	public int getEmployeeNumber(Paramters paramters) throws ServiceException,DataException{
		DataLayer dataLayer = new DataLayer();
		dataLayer.getEmployeeNumber(paramters);

		//
		try{
			Class.forName("com.test.bad");
		}catch(ClassNotFoundException ex){
			buildServiceException("900","Faild to Load Service Class");
		}
		
		
		return 0;
	}

	private void buildServiceException(String errCode,String errMsg) throws ServiceException {
		ServiceException cex = new ServiceException(errCode,errMsg); //);
		throw cex;
	}

}
