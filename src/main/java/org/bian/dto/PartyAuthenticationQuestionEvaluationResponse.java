package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PartyAuthenticationQuestionEvaluationResponse
 */
public class PartyAuthenticationQuestionEvaluationResponse   {
  private String customerContactAuthenticationRecordReference = null;

  private String customerAuthenticationQuestionTestReference = null;

  private String customerReference = null;

  private String partyReference = null;

  private String authenticationType = null;

  private String authenticationSecretQuestionReference = null;

  private String authenticationSecretQuestionTemplate = null;

  private String authenticationSecretQuestionValue = null;

  private Object customerContactAuthenticationRecord = null;

  private String customerContactAuthenticationLevel = null;

  private String customerContactAuthenticationGrant = null;

  private Object authenticationSecretQuestionEvaluationResult = null;


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerContactAuthentication 
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
   * @return customerAuthenticationQuestionTestReference
  **/

  public String getCustomerAuthenticationQuestionTestReference() {
    return customerAuthenticationQuestionTestReference;
  }

  public void setCustomerAuthenticationQuestionTestReference(String customerAuthenticationQuestionTestReference) {
    this.customerAuthenticationQuestionTestReference = customerAuthenticationQuestionTestReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerContactPerson.RepresentedCustomer  general-info: Authentication subject can be identification as a customer 
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
   * general-info: E.g. by password, token etc. `status: Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticationDataScheme.AuthenticationMethod iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_wcU_wA93EeGeV5vP7Mvdig_-374264443/elements/_FColdsTGEeChad0JzLk7QA_-1070387496) 
   * @return authenticationType
  **/

  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerContactPerson(asRole).Player(asPerson).PersonProfile.StoredAuthenticationData 
   * @return authenticationSecretQuestionReference
  **/

  public String getAuthenticationSecretQuestionReference() {
    return authenticationSecretQuestionReference;
  }

  public void setAuthenticationSecretQuestionReference(String authenticationSecretQuestionReference) {
    this.authenticationSecretQuestionReference = authenticationSecretQuestionReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticationDataScheme(asGenericDataScheme).Format  general-info: Question text and expected customer response - given value is compared 
   * @return authenticationSecretQuestionTemplate
  **/

  public String getAuthenticationSecretQuestionTemplate() {
    return authenticationSecretQuestionTemplate;
  }

  public void setAuthenticationSecretQuestionTemplate(String authenticationSecretQuestionTemplate) {
    this.authenticationSecretQuestionTemplate = authenticationSecretQuestionTemplate;
  }


  /**
   * general-info: Provided value is compared to expected response `status: Provisionally Registered` bian-reference:  CustomerContactPerson(asRole).Player(asPerson).PersonProfile.StoredAuthenticationData(asGenericData).BinaryData `status: Provisionally Registered` bian-reference:  CustomerContactPerson(asRole).Player(asPerson).PersonProfile.StoredAuthenticationData(asGenericData).ValidityPeriod 
   * @return authenticationSecretQuestionValue
  **/

  public String getAuthenticationSecretQuestionValue() {
    return authenticationSecretQuestionValue;
  }

  public void setAuthenticationSecretQuestionValue(String authenticationSecretQuestionValue) {
    this.authenticationSecretQuestionValue = authenticationSecretQuestionValue;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerContactAuthentication  general-info: record generated by authentication task 
   * @return customerContactAuthenticationRecord
  **/

  public Object getCustomerContactAuthenticationRecord() {
    return customerContactAuthenticationRecord;
  }

  public void setCustomerContactAuthenticationRecord(Object customerContactAuthenticationRecord) {
    this.customerContactAuthenticationRecord = customerContactAuthenticationRecord;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).AuthenticationLevel `status: Registered` bian-reference:  (asAuthentication).AuthenticationResult iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_wcU_wA93EeGeV5vP7Mvdig_-374264443/elements/_UqFPkPkdEea0GN7fTO7hmQ)  general-info: value returned as a result of the authentication task, defining the level of identity assurance achieved  valid for the duration of the current contact 
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
   * @return authenticationSecretQuestionEvaluationResult
  **/

  public Object getAuthenticationSecretQuestionEvaluationResult() {
    return authenticationSecretQuestionEvaluationResult;
  }

  public void setAuthenticationSecretQuestionEvaluationResult(Object authenticationSecretQuestionEvaluationResult) {
    this.authenticationSecretQuestionEvaluationResult = authenticationSecretQuestionEvaluationResult;
  }


}

