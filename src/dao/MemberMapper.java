package dao;

import vo.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	public Member selectMember(Member member);
}
