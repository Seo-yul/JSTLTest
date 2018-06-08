package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Member;

public class MemberDAO {
	private SqlSessionFactory factory = MybatisConfig.getResourceAsReader();
	public boolean insertMember(Member member) {
		SqlSession session = null;
		boolean result = false;
		int cnt = 0;
		try {
			session = factory.openSession();
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.insertMember(member);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("인설트실패");
			return false;
		} finally {
			if (session != null) session.close();
		}
		if (cnt > 0) {
			result = true;
		}
		
		return result;
	}
	
	public Member selectMember(Member member) {
		SqlSession session = null;
		Member members = null ;
		try {
			session = factory.openSession();
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			members = mapper.selectMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("셀렉실패");
			return null;
		} finally {
			if (session != null) session.close();
		}
		if (members != null) {
			return members;
		}
		
		return null;
	}
}


