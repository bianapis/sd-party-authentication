/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PartyAuthenticationApiServiceImpl implements PartyAuthenticationApiService {

	public PartyAuthenticationEvaluationResponse evaluate(PartyAuthenticationBasic request){
		return JsonReader.read("evaluate-PartyAuthenticationEvaluationResponse.json",new TypeReference<PartyAuthenticationEvaluationResponse>(){});
	}
	
	public PartyAuthenticationBehavioralEvaluationResponse evaluateBehaviorals(String crReferenceId, PartyAuthenticationBehavioralBasic request){
		return JsonReader.read("evaluate-PartyAuthenticationBehavioralEvaluationResponse.json",new TypeReference<PartyAuthenticationBehavioralEvaluationResponse>(){});
	}
	
	public PartyAuthenticationBiometricEvaluationResponse evaluateBiometrics(String crReferenceId, PartyAuthenticationBiometricBasic request){
		return JsonReader.read("evaluate-PartyAuthenticationBiometricEvaluationResponse.json",new TypeReference<PartyAuthenticationBiometricEvaluationResponse>(){});
	}
	
	public PartyAuthenticationDeviceEvaluationResponse evaluateDevices(String crReferenceId, PartyAuthenticationDeviceBasic request){
		return JsonReader.read("evaluate-PartyAuthenticationDeviceEvaluationResponse.json",new TypeReference<PartyAuthenticationDeviceEvaluationResponse>(){});
	}
	
	public PartyAuthenticationDocumentEvaluationResponse evaluateDocuments(String crReferenceId, PartyAuthenticationDocumentBasic request){
		return JsonReader.read("evaluate-PartyAuthenticationDocumentEvaluationResponse.json",new TypeReference<PartyAuthenticationDocumentEvaluationResponse>(){});
	}
	
	public PartyAuthenticationPasswordEvaluationResponse evaluatePasswords(String crReferenceId, PartyAuthenticationPasswordBasic request){
		return JsonReader.read("evaluate-PartyAuthenticationPasswordEvaluationResponse.json",new TypeReference<PartyAuthenticationPasswordEvaluationResponse>(){});
	}
	
	public PartyAuthenticationQuestionEvaluationResponse evaluateQuestions(String crReferenceId, PartyAuthenticationQuestionBasic request){
		return JsonReader.read("evaluate-PartyAuthenticationQuestionEvaluationResponse.json",new TypeReference<PartyAuthenticationQuestionEvaluationResponse>(){});
	}
	
	public PartyAuthenticationWithID requestPost(PartyAuthenticationBasic request){
		return JsonReader.read("requestPost-PartyAuthenticationWithID.json",new TypeReference<PartyAuthenticationWithID>(){});
	}
	
	public PartyAuthenticationWithID requestPut(String crReferenceId, PartyAuthenticationBasic request){
		return JsonReader.read("requestPut-PartyAuthenticationWithID.json",new TypeReference<PartyAuthenticationWithID>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public PartyAuthenticationBehavioralComplete retrieveBehaviorals(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PartyAuthenticationBehavioralComplete.json",new TypeReference<PartyAuthenticationBehavioralComplete>(){});
	}
	
	public PartyAuthenticationBiometricComplete retrieveBiometrics(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PartyAuthenticationBiometricComplete.json",new TypeReference<PartyAuthenticationBiometricComplete>(){});
	}
	
	public PartyAuthenticationDeviceComplete retrieveDevices(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PartyAuthenticationDeviceComplete.json",new TypeReference<PartyAuthenticationDeviceComplete>(){});
	}
	
	public PartyAuthenticationDocumentComplete retrieveDocuments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PartyAuthenticationDocumentComplete.json",new TypeReference<PartyAuthenticationDocumentComplete>(){});
	}
	
	public PartyAuthenticationPasswordComplete retrievePasswords(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PartyAuthenticationPasswordComplete.json",new TypeReference<PartyAuthenticationPasswordComplete>(){});
	}
	
	public PartyAuthenticationQuestionComplete retrieveQuestions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PartyAuthenticationQuestionComplete.json",new TypeReference<PartyAuthenticationQuestionComplete>(){});
	}
	
	public PartyAuthenticationComplete retrieve(String crReferenceId){
		return JsonReader.read("retrieve-PartyAuthenticationComplete.json",new TypeReference<PartyAuthenticationComplete>(){});
	}
	
}
