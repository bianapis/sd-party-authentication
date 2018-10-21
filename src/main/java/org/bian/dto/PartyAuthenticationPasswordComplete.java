package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PartyAuthenticationPasswordComplete
 */
public class PartyAuthenticationPasswordComplete   {
  private String customerContactAuthenticationRecordReference = null;

  private String customerAuthenticationPasswordTestReference = null;

  private String customerReference = null;

  private String partyReference = null;

  private String authenticationType = null;

  private String authenticationReferenceDataReference = null;

  private String authenticationReferenceDataType = null;

  private Object authenticationReferenceDataValue = null;

  private String authenticationPasswordReference = null;

  private String authenticationPasswordTemplate = null;

  private String authenticationPasswordValue = null;

  private String authenticationPasswordValidFromToDate = null;

  private Object customerContactAuthenticationRecord = null;

  private String customerContactAuthenticationLevel = null;

  private String customerContactAuthenticationGrant = null;


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
   * @return customerAuthenticationPasswordTestReference
  **/

  public String getCustomerAuthenticationPasswordTestReference() {
    return customerAuthenticationPasswordTestReference;
  }

  public void setCustomerAuthenticationPasswordTestReference(String customerAuthenticationPasswordTestReference) {
    this.customerAuthenticationPasswordTestReference = customerAuthenticationPasswordTestReference;
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
   * `status: Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticationDataScheme.AuthenticationMethod iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_wcU_wA93EeGeV5vP7Mvdig_-374264443/elements/_FColdsTGEeChad0JzLk7QA_-1070387496) general-info: E.g. by password, token etc. 
   * @return authenticationType
  **/

  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticationDataScheme(asGenericDataScheme).Label  general-info: Refers to reference data item to be compared with submitted value 
   * @return authenticationReferenceDataReference
  **/

  public String getAuthenticationReferenceDataReference() {
    return authenticationReferenceDataReference;
  }

  public void setAuthenticationReferenceDataReference(String authenticationReferenceDataReference) {
    this.authenticationReferenceDataReference = authenticationReferenceDataReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticationDataScheme(asGenericDataScheme).Format  general-info: Defines reference data item type submitted 
   * @return authenticationReferenceDataType
  **/

  public String getAuthenticationReferenceDataType() {
    return authenticationReferenceDataType;
  }

  public void setAuthenticationReferenceDataType(String authenticationReferenceDataType) {
    this.authenticationReferenceDataType = authenticationReferenceDataType;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData(asGenericData).BinaryData `status: Provisionally Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData(asGenericData).TextualData  general-info: Customer provided value is matched to bank maintained value 
   * @return authenticationReferenceDataValue
  **/

  public Object getAuthenticationReferenceDataValue() {
    return authenticationReferenceDataValue;
  }

  public void setAuthenticationReferenceDataValue(Object authenticationReferenceDataValue) {
    this.authenticationReferenceDataValue = authenticationReferenceDataValue;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerContactPerson(asRole).Player(asPerson).PersonProfile.StoredAuthenticationData 
   * @return authenticationPasswordReference
  **/

  public String getAuthenticationPasswordReference() {
    return authenticationPasswordReference;
  }

  public void setAuthenticationPasswordReference(String authenticationPasswordReference) {
    this.authenticationPasswordReference = authenticationPasswordReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticationDataScheme(asGenericDataScheme).Format  general-info: Defines allowed values/format 
   * @return authenticationPasswordTemplate
  **/

  public String getAuthenticationPasswordTemplate() {
    return authenticationPasswordTemplate;
  }

  public void setAuthenticationPasswordTemplate(String authenticationPasswordTemplate) {
    this.authenticationPasswordTemplate = authenticationPasswordTemplate;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerContactPerson(asRole).Player(asPerson).PersonProfile.StoredAuthenticationData(asGenericData).BinaryData `status: Provisionally Registered` bian-reference:  CustomerContactPerson(asRole).Player(asPerson).PersonProfile.StoredAuthenticationData(asGenericData).TextualData  general-info: Can be customer provided or bank generated value - encryption applies 
   * @return authenticationPasswordValue
  **/

  public String getAuthenticationPasswordValue() {
    return authenticationPasswordValue;
  }

  public void setAuthenticationPasswordValue(String authenticationPasswordValue) {
    this.authenticationPasswordValue = authenticationPasswordValue;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerContactPerson(asRole).Player(asPerson).PersonProfile.StoredAuthenticationData(asGenericData).ValidityPeriod 
   * @return authenticationPasswordValidFromToDate
  **/

  public String getAuthenticationPasswordValidFromToDate() {
    return authenticationPasswordValidFromToDate;
  }

  public void setAuthenticationPasswordValidFromToDate(String authenticationPasswordValidFromToDate) {
    this.authenticationPasswordValidFromToDate = authenticationPasswordValidFromToDate;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerContactAuthentication `status: Provisionally Registered` bian-reference:  CustomerContactAuthentication  general-info: record generated by authentication task 
   * @return customerContactAuthenticationRecord
  **/

  public Object getCustomerContactAuthenticationRecord() {
    return customerContactAuthenticationRecord;
  }

  public void setCustomerContactAuthenticationRecord(Object customerContactAuthenticationRecord) {
    this.customerContactAuthenticationRecord = customerContactAuthenticationRecord;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).AuthenticationLevel `status: Registered` bian-reference:  (asAuthentication).AuthenticationResult iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_wcU_wA93EeGeV5vP7Mvdig_-374264443/elements/_UqFPkPkdEea0GN7fTO7hmQ)   general-info: value returned as a result of the authentication task, defining the level of identity assurance achieved  valid for the duration of the current contact 
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


}

