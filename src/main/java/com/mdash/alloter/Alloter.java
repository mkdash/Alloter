package com.mdash.alloter;

import java.util.List;

public class Alloter {

	public static final int PLAYER_NEEDED_PER_COURT = 4;

	public static void main(String[] args) {
		System.out.println("Alloter started..");

		// TODO - Initialize the data and services..
		MemberService memberService = new MemberService();		
		Selector selector = new Selector();
		
		
		List<Member> selectedPlayers = selector.selectPlayers(memberService.getAllMembers(), 8);
		
		for(Member member: selectedPlayers) {
			System.out.println(member);
		}

		System.out.println("Alloter stoped..");
	}

}
