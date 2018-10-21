package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PartyAuthenticationBehavioralEvaluationResponse
 */
public class PartyAuthenticationBehavioralEvaluationResponse   {
  private String customerContactAuthenticationRecordReference = null;

  private String customerAuthenticationBehavioralTestReference = null;

  private String customerReference = null;

  private String partyReference = null;

  private String authenticationType = null;

  private String authenticationBehavioralType = null;

  private String authenticationBehavioralRecord = null;

  private String registeredBehavioralReference = null;

  private String registeredBehavioralRecord = null;

  private Object customerContactAuthenticationRecord = null;

  private String customerContactAuthenticationLevel = null;

  private String customerContactAuthenticationGrant = null;

  private Object authenticationBehavioralEvaluationResult = null;


  /**
   * `status: Provisionally Registered`   bian-reference:  CustomerContactPerson.RepresentedCustomer   general-info: 
   * @return customerContactAuthenticationRecordReference
  **/

  public String getCustomerContactAuthenticationRecordReference() {
    return customerContactAuthenticationRecordReference;
  }

  public void setCustomerContactAuthenticationRecordReference(String customerContactAuthenticationRecordReference) {
    this.customerContactAuthenticationRecordReference = customerContactAuthenticationRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 
   * @return customerAuthenticationBehavioralTestReference
  **/

  public String getCustomerAuthenticationBehavioralTestReference() {
    return customerAuthenticationBehavioralTestReference;
  }

  public void setCustomerAuthenticationBehavioralTestReference(String customerAuthenticationBehavioralTestReference) {
    this.customerAuthenticationBehavioralTestReference = customerAuthenticationBehavioralTestReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerContactPerson.RepresentedCustomer    general-info: Authentication subject can be identification as a customer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerContactPerson.RepresentedCustomer(asRole).Player(asParty) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EwTfUMTGEeChad0JzLk7QA_-1978180945/elements/_EwTfUcTGEeChad0JzLk7QA_434950303) general-info: Authentication subject can be identified as a party or legal entity 
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
   * `status: Provisionally Registered`   bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticationDataScheme(asGenericDataScheme).Format   general-info: Type of behavioral record being used 
   * @return authenticationBehavioralType
  **/

  public String getAuthenticationBehavioralType() {
    return authenticationBehavioralType;
  }

  public void setAuthenticationBehavioralType(String authenticationBehavioralType) {
    this.authenticationBehavioralType = authenticationBehavioralType;
  }


  /**
   * `status: Provisionally Registered`   bian-reference:  (asAuthentication).SubmittedAuthenticationData(asGenericData).BinaryData   general-info: Behavioral record submitted for authetication    
   * @return authenticationBehavioralRecord
  **/

  public String getAuthenticationBehavioralRecord() {
    return authenticationBehavioralRecord;
  }

  public void setAuthenticationBehavioralRecord(String authenticationBehavioralRecord) {
    this.authenticationBehavioralRecord = authenticationBehavioralRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Registered customer behavioral record reference 
   * @return registeredBehavioralReference
  **/

  public String getRegisteredBehavioralReference() {
    return registeredBehavioralReference;
  }

  public void setRegisteredBehavioralReference(String registeredBehavioralReference) {
    this.registeredBehavioralReference = registeredBehavioralReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Registered customer behavioral record  mainted by SDIssued Device Administration 
   * @return registeredBehavioralRecord
  **/

  public String getRegisteredBehavioralRecord() {
    return registeredBehavioralRecord;
  }

  public void setRegisteredBehavioralRecord(String registeredBehavioralRecord) {
    this.registeredBehavioralRecord = registeredBehavioralRecord;
  }


  /**
   * `status: Provisionally Registered`   bian-reference:  CustomerContactAuthentication   general-info: record generated by authentication task 
   * @return customerContactAuthenticationRecord
  **/

  public Object getCustomerContactAuthenticationRecord() {
    return customerContactAuthenticationRecord;
  }

  public void setCustomerContactAuthenticationRecord(Object customerContactAuthenticationRecord) {
    this.customerContactAuthenticationRecord = customerContactAuthenticationRecord;
  }


  /**
   * `status: Provisionally Registered`   bian-reference:  (asAuthentication).AuthenticationLevel   general-info: value returned as a result of the authentication task, defining the level of identity assurance achieved  valid for the duration of the current contact 
   * @return customerContactAuthenticationLevel
  **/

  public String getCustomerContactAuthenticationLevel() {
    return customerContactAuthenticationLevel;
  }

  public void setCustomerContactAuthenticationLevel(String customerContactAuthenticationLevel) {
    this.customerContactAuthenticationLevel = customerContactAuthenticationLevel;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: description of allowed access/activities when appropriate 
   * @return customerContactAuthenticationGrant
  **/

  public String getCustomerContactAuthenticationGrant() {
    return customerContactAuthenticationGrant;
  }

  public void setCustomerContactAuthenticationGrant(String customerContactAuthenticationGrant) {
    this.customerContactAuthenticationGrant = customerContactAuthenticationGrant;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return authenticationBehavioralEvaluationResult
  **/

  public Object getAuthenticationBehavioralEvaluationResult() {
    return authenticationBehavioralEvaluationResult;
  }

  public void setAuthenticationBehavioralEvaluationResult(Object authenticationBehavioralEvaluationResult) {
    this.authenticationBehavioralEvaluationResult = authenticationBehavioralEvaluationResult;
  }


}

