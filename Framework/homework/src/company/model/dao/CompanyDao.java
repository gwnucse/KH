package company.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import company.model.vo.Company;

public class CompanyDao {

	public List<Company> selectAllCompany(SqlSession session) {
		
		return session.selectList("company.selectAllCompany");
	}

}