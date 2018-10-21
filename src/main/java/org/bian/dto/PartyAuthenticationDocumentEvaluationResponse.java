package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PartyAuthenticationDocumentEvaluationResponse
 */
public class PartyAuthenticationDocumentEvaluationResponse   {
  private String customerContactAuthenticationRecordReference = null;

  private String customerAuthenticationDocumentTestReference = null;

  private String customerReference = null;

  private String partyReference = null;

  private String authenticationType = null;

  private String authenticationDocumentReference = null;

  private Object authenticationDocumentContent = null;

  private String documentReference = null;

  private String documentContent = null;

  private String authenticationDocumentComparisonResult = null;

  private Object customerContactAuthenticationRecord = null;

  private String customerContactAuthenticationLevel = null;

  private String customerContactAuthenticationGrant = null;

  private Object authenticationDocumentEvaluationResult = null;


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerContactAuthentication 
   * @return customerContactAuthenticationRecordReference
  **/

  public String getCustomerContactAuthenticationRecordReference() {
    return customerContactAuthenticationRecordReference;
  }

  public void setCustomerContactAuthenticationRecordReference(String customerContactAuthenticationRecordReference) {
    this.customerContactAuthenticationRecordReference = customerContactAuthenticationRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerAuthenticationDocumentTestReference
  **/

  public String getCustomerAuthenticationDocumentTestReference() {
    return customerAuthenticationDocumentTestReference;
  }

  public void setCustomerAuthenticationDocumentTestReference(String customerAuthenticationDocumentTestReference) {
    this.customerAuthenticationDocumentTestReference = customerAuthenticationDocumentTestReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerContactPerson.RepresentedCustomer  general-info: Authentication subject can be identification as a customer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerContactPerson.RepresentedCustomer(asRole).Player(asParty) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EwTfUMTGEeChad0JzLk7QA_-1978180945/elements/_EwTfUcTGEeChad0JzLk7QA_434950303) 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticationDataScheme.AuthenticationMethod iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_wcU_wA93EeGeV5vP7Mvdig_-374264443/elements/_FColdsTGEeChad0JzLk7QA_-1070387496) general-info: E.g. by password, token etc. 
   * @return authenticationType
  **/

  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticatingDocument  general-info: Document being used for authentication 
   * @return authenticationDocumentReference
  **/

  public String getAuthenticationDocumentReference() {
    return authenticationDocumentReference;
  }

  public void setAuthenticationDocumentReference(String authenticationDocumentReference) {
    this.authenticationDocumentReference = authenticationDocumentReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  (asAuthentication).SubmittedAuthenticationData(asGenericData).BinaryData  general-info: submitted document content in any appropriate format/media e.g. scan (could be an image, so binary maybe) 
   * @return authenticationDocumentContent
  **/

  public Object getAuthenticationDocumentContent() {
    return authenticationDocumentContent;
  }

  public void setAuthenticationDocumentContent(Object authenticationDocumentContent) {
    this.authenticationDocumentContent = authenticationDocumentContent;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerContactPerson.Player(asPerson).PersonProfile.StoredAuthenticationData.Document  general-info: stored document reference 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerContactPerson.Player(asPerson).PersonProfile.StoredAuthenticationData(asGenericData).BinaryData  general-info: stored document  available in any suitable media for comparison 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * `status: Registered` bian-reference:  (asAuthentication).AuthenticationResult iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_wcU_wA93EeGeV5vP7Mvdig_-374264443/elements/_UqFPkPkdEea0GN7fTO7hmQ) general-info: Result of comparing pressented document to stored value 
   * @return authenticationDocumentComparisonResult
  **/

  public String getAuthenticationDocumentComparisonResult() {
    return authenticationDocumentComparisonResult;
  }

  public void setAuthenticationDocumentComparisonResult(String authenticationDocumentComparisonResult) {
    this.authenticationDocumentComparisonResult = authenticationDocumentComparisonResult;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerContactAuthentication  general-info: record generated by authentication task 
   * @return customerContactAuthenticationRecord
  **/

  public Object getCustomerContactAuthenticationRecord() {
    return customerContactAuthenticationRecord;
  }

  public void setCustomerContactAuthenticationRecord(Object customerContactAuthenticationRecord) {
    this.customerContactAuthenticationRecord = customerContactAuthenticationRecord;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  (asAuthentication).AuthenticationLevel  general-info: value returned as a result of the authentication task, defining the level of identity assurance achieved  valid for the duration of the current contact 
   * @return customerContactAuthenticationLevel
  **/

  public String getCustomerContactAuthenticationLevel() {
    return customerContactAuthenticationLevel;
  }

  public void setCustomerContactAuthenticationLevel(String customerContactAuthenticationLevel) {
    this.customerContactAuthenticationLevel = customerContactAuthenticationLevel;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  TBD general-info: description of allowed access/activities when appropriate 
   * @return customerContactAuthenticationGrant
  **/

  public String getCustomerContactAuthenticationGrant() {
    return customerContactAuthenticationGrant;
  }

  public void setCustomerContactAuthenticationGrant(String customerContactAuthenticationGrant) {
    this.customerContactAuthenticationGrant = customerContactAuthenticationGrant;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   general-info: 
   * @return authenticationDocumentEvaluationResult
  **/

  public Object getAuthenticationDocumentEvaluationResult() {
    return authenticationDocumentEvaluationResult;
  }

  public void setAuthenticationDocumentEvaluationResult(Object authenticationDocumentEvaluationResult) {
    this.authenticationDocumentEvaluationResult = authenticationDocumentEvaluationResult;
  }


}

