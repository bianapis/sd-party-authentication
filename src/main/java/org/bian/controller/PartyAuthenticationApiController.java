/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class PartyAuthenticationApiController {

	@Autowired
	PartyAuthenticationApiService service;
	
	@Assess.Evaluate
	public BianResponse<PartyAuthenticationEvaluationResponse> evaluate(@RequestBody BianRequest<PartyAuthenticationBasic> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(bianRequest.getData()));
	}
	
	@BQ("behaviorals")
	@Assess.Evaluate
	public BianResponse<PartyAuthenticationBehavioralEvaluationResponse> evaluateBehaviorals(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PartyAuthenticationBehavioralBasic> bianRequest) {
		return BianResponse.forSuccess(service.evaluateBehaviorals(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("biometrics")
	@Assess.Evaluate
	public BianResponse<PartyAuthenticationBiometricEvaluationResponse> evaluateBiometrics(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PartyAuthenticationBiometricBasic> bianRequest) {
		return BianResponse.forSuccess(service.evaluateBiometrics(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("devices")
	@Assess.Evaluate
	public BianResponse<PartyAuthenticationDeviceEvaluationResponse> evaluateDevices(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PartyAuthenticationDeviceBasic> bianRequest) {
		return BianResponse.forSuccess(service.evaluateDevices(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("documents")
	@Assess.Evaluate
	public BianResponse<PartyAuthenticationDocumentEvaluationResponse> evaluateDocuments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PartyAuthenticationDocumentBasic> bianRequest) {
		return BianResponse.forSuccess(service.evaluateDocuments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("passwords")
	@Assess.Evaluate
	public BianResponse<PartyAuthenticationPasswordEvaluationResponse> evaluatePasswords(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PartyAuthenticationPasswordBasic> bianRequest) {
		return BianResponse.forSuccess(service.evaluatePasswords(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("questions")
	@Assess.Evaluate
	public BianResponse<PartyAuthenticationQuestionEvaluationResponse> evaluateQuestions(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PartyAuthenticationQuestionBasic> bianRequest) {
		return BianResponse.forSuccess(service.evaluateQuestions(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.RequestPost
	public BianResponse<PartyAuthenticationWithID> requestPost(@RequestBody BianRequest<PartyAuthenticationBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Assess.RequestPut
	public BianResponse<PartyAuthenticationWithID> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PartyAuthenticationBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("behaviorals")
	@Assess.Retrieve
	public BianResponse<PartyAuthenticationBehavioralComplete> retrieveBehaviorals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBehaviorals(crReferenceId, bqReferenceId));
	}
	
	@BQ("biometrics")
	@Assess.Retrieve
	public BianResponse<PartyAuthenticationBiometricComplete> retrieveBiometrics(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBiometrics(crReferenceId, bqReferenceId));
	}
	
	@BQ("devices")
	@Assess.Retrieve
	public BianResponse<PartyAuthenticationDeviceComplete> retrieveDevices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevices(crReferenceId, bqReferenceId));
	}
	
	@BQ("documents")
	@Assess.Retrieve
	public BianResponse<PartyAuthenticationDocumentComplete> retrieveDocuments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDocuments(crReferenceId, bqReferenceId));
	}
	
	@BQ("passwords")
	@Assess.Retrieve
	public BianResponse<PartyAuthenticationPasswordComplete> retrievePasswords(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePasswords(crReferenceId, bqReferenceId));
	}
	
	@BQ("questions")
	@Assess.Retrieve
	public BianResponse<PartyAuthenticationQuestionComplete> retrieveQuestions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveQuestions(crReferenceId, bqReferenceId));
	}
	
	@Assess.Retrieve
	public BianResponse<PartyAuthenticationComplete> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
}
