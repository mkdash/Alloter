package com.mdash.alloter;

import java.util.ArrayList;
import java.util.List;

public class MemberService {

	//TODO - MemberService has to be a singleton and has to be the key one in the application.
	// It will deal with all the data fetching and setting related to the Members
	
	public List<Member> getAllMembers() {
		List<Member> members = new ArrayList<Member>();

		members.add(new Member(1, "Mahendra1", "Dash1"));
		members.add(new Member(2, "Mahendra2", "Dash2"));
		members.add(new Member(3, "Mahendra3", "Dash3"));
		members.add(new Member(4, "Mahendra4", "Dash4"));
		members.add(new Member(5, "Mahendra5", "Dash5"));
		members.add(new Member(6, "Mahendra6", "Dash6"));
		members.add(new Member(7, "Mahendra7", "Dash7"));
		members.add(new Member(8, "Mahendra8", "Dash8"));
		members.add(new Member(9, "Mahendra9", "Dash9"));
		members.add(new Member(10, "Mahendra10", "Dash10"));
		members.add(new Member(11, "Mahendra11", "Dash11"));
		members.add(new Member(12, "Mahendra12", "Dash12"));
		members.add(new Member(13, "Mahendra13", "Dash13"));
		members.add(new Member(14, "Mahendra14", "Dash14"));
		members.add(new Member(15, "Mahendra15", "Dash15"));
		members.add(new Member(16, "Mahendra16", "Dash16"));
		members.add(new Member(17, "Mahendra17", "Dash17"));
		members.add(new Member(18, "Mahendra18", "Dash18"));
		members.add(new Member(19, "Mahendra19", "Dash19"));
		members.add(new Member(20, "Mahendra20", "Dash20"));
		members.add(new Member(21, "Mahendra21", "Dash21"));
		members.add(new Member(22, "Mahendra22", "Dash22"));
		
		return members;
	}

	public Member getMemberById(List<Member> members, int memberId) {
		Member memberById = null;
		for (Member member : members) {
			if (member.getId() == memberId) {
				memberById = member;
				break;
			}
		}
		return memberById;
	}

}
