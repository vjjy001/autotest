package com.james.autotest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.james.autotest.datasource.DataSourceDao;


public class AutoTestDaoImpl implements AutoTestDao{

	
	private DataSourceDao dataSourceDao;
	
	
	
	public DataSourceDao getDataSourceDao() {
		return dataSourceDao;
	}


	public void setDataSourceDao(DataSourceDao dataSourceDao) {
		this.dataSourceDao = dataSourceDao;
	}


	public void getAllStates(){
		Connection ct = dataSourceDao.getConnection();
		ResultSet result;
		String sql = "select * from state where statecode = ?";
		try {
			PreparedStatement pst = ct.prepareStatement(sql);
			pst.setString(1,"IL");
			result = pst.executeQuery();
			
			while(result.next()){
				System.out.println(result.getString("STATECODE"));
				//System.out.println(result.getInt("STU_ID"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			dataSourceDao.releaseConnection(ct);
		}
	}
}
