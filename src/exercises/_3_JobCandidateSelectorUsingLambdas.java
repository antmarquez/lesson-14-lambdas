package exercises;

import java.util.Collections;

public class _3_JobCandidateSelectorUsingLambdas {
	public static void main(String[] args) {

		// 1. Sort the candidates by salary requirements, low to high.
		Collections.sort(JobCandidate.jobCandidates, (jc1, jc2) -> jc2.getSalaryRequired() - jc1.getSalaryRequired());
		System.out.println(JobCandidate.jobCandidates);
		System.out.println();		

		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class
		JobCandidate.jobCandidates.removeIf(jc -> !jc.getTeacherName().contains("June"));
		System.out.println(JobCandidate.jobCandidates);		
		
	}
}
