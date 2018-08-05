package com.mdash.alloter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Selector {

	public List<Member> selectPlayers(List<Member> members, int numberOfMembersToSelect) {
		List<Member> selectedMembers = new ArrayList<Member>();

		// Temporary use of MemberService instance. Need to replace by a service. This is the integration piece.
		MemberService memberService = new MemberService();
		int[] rondomlySelectedIds = selectRandomNumbers(1, members.size(), numberOfMembersToSelect);

		for (int selectedId : rondomlySelectedIds) {
			selectedMembers.add(memberService.getMemberById(members, selectedId));
		}
		return selectedMembers;
	}

	
	
	private int[] selectRandomNumbers(int minNumber, int maxNumber, int numberOfNumbersToChoose) {

		int[] randomNumbers = new int[numberOfNumbersToChoose];

		// TODO : No need to generate random numbers and loop for if less people are there.

		for (int i = 0; i < randomNumbers.length; i++) {
			// randomNumbers[i] = generateRandomIntIntRange(1, membersPresent);

			// Make sure the selection is not bring a number already selected before.
			while (randomNumbers[i] == 0) {
				boolean numberUsed = false;
				int randomlyGeneratedInteger = generateRandomIntIntRange(minNumber, maxNumber);

				for (int j = 0; j < i; j++) {
					if (randomNumbers[j] == randomlyGeneratedInteger) {
						numberUsed = true;
						break;
					}
				}

				if (!numberUsed) {
					randomNumbers[i] = randomlyGeneratedInteger;
				}
			}
		}

		return randomNumbers;

	}

	private int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
