/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PartyAuthenticationApiService {

	PartyAuthenticationEvaluationResponse evaluate(PartyAuthenticationBasic request);
	
	PartyAuthenticationBehavioralEvaluationResponse evaluateBehaviorals(String crReferenceId, PartyAuthenticationBehavioralBasic request);
	
	PartyAuthenticationBiometricEvaluationResponse evaluateBiometrics(String crReferenceId, PartyAuthenticationBiometricBasic request);
	
	PartyAuthenticationDeviceEvaluationResponse evaluateDevices(String crReferenceId, PartyAuthenticationDeviceBasic request);
	
	PartyAuthenticationDocumentEvaluationResponse evaluateDocuments(String crReferenceId, PartyAuthenticationDocumentBasic request);
	
	PartyAuthenticationPasswordEvaluationResponse evaluatePasswords(String crReferenceId, PartyAuthenticationPasswordBasic request);
	
	PartyAuthenticationQuestionEvaluationResponse evaluateQuestions(String crReferenceId, PartyAuthenticationQuestionBasic request);
	
	PartyAuthenticationWithID requestPost(PartyAuthenticationBasic request);
	
	PartyAuthenticationWithID requestPut(String crReferenceId, PartyAuthenticationBasic request);
	
	List<String> retrieveBQs();
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveRefIds();
	
	PartyAuthenticationBehavioralComplete retrieveBehaviorals(String crReferenceId, String bqReferenceId);
	
	PartyAuthenticationBiometricComplete retrieveBiometrics(String crReferenceId, String bqReferenceId);
	
	PartyAuthenticationDeviceComplete retrieveDevices(String crReferenceId, String bqReferenceId);
	
	PartyAuthenticationDocumentComplete retrieveDocuments(String crReferenceId, String bqReferenceId);
	
	PartyAuthenticationPasswordComplete retrievePasswords(String crReferenceId, String bqReferenceId);
	
	PartyAuthenticationQuestionComplete retrieveQuestions(String crReferenceId, String bqReferenceId);
	
	PartyAuthenticationComplete retrieve(String crReferenceId);
	
}
