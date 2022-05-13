package mockdata;

import java.util.List;
import java.util.ArrayList;

import models.*;

public class MockReimbursementData {
	private final List<Reimbursement> reimbursements = new ArrayList<>();
	
	public MockReimbursementData() {
		
		MockUserData userData = new MockUserData();
		
		Reimbursement REIMBURSEMENT_TO_PROCESS_1 = 	new Reimbursement(1, 2, 0, "Oracle Java Certification", ReimbursementType.Other, Status.Pending, 250.00);
		Reimbursement REIMBURSEMENT_TO_PROCESS_2 = 	new Reimbursement(2, 2, 0, "Travel to Reston HQ", ReimbursementType.Travel, Status.Pending, 600.00);
		Reimbursement REIMBURSEMENT_TO_PROCESS_3 = 	new Reimbursement(3, 1, 3, "Free lunch offer from Sean", ReimbursementType.Food, Status.Approved, 25.00);
		Reimbursement REIMBURSEMENT_TO_PROCESS_4 = 	new Reimbursement(4, 2, 4, "2-night hotel stay near Orlando Office for visit", ReimbursementType.Lodging, Status.Approved, 300.00);
		Reimbursement REIMBURSEMENT_TO_PROCESS_5 = 	new Reimbursement(5, 1, 3, "Rental Car to drive from Reston to Orlando", ReimbursementType.Travel, Status.Denied, 2500.00);
		
		reimbursements.add(REIMBURSEMENT_TO_PROCESS_1);
		reimbursements.add(REIMBURSEMENT_TO_PROCESS_2);
		reimbursements.add(REIMBURSEMENT_APPROVED_1);
		reimbursements.add(REIMBURSEMENT_APPROVED_2);
		reimbursements.add(REIMBURSEMENT_DENIED_1);
		
		
	}
	
	public List<Reimbursement> getReimbursements() {return reimbursements;}

}