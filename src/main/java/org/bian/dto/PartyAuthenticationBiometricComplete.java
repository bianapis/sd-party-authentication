package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PartyAuthenticationBiometricComplete
 */
public class PartyAuthenticationBiometricComplete   {
  private String customerContactAuthenticationRecordReference = null;

  private String customerAuthenticationBiometricTestReference = null;

  private String customerReference = null;

  private String partyReference = null;

  private String authenticationType = null;

  private String authenticationBiometricType = null;

  private Object authenticationBiometricRecord = null;

  private String registeredBiometricReference = null;

  private String registeredBiometricRecord = null;

  private Object customerContactAuthenticationRecord = null;

  private String customerContactAuthenticationLevel = null;

  private String customerContactAuthenticationGrant = null;


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerContactAuthentication  general-info: 
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
   * @return customerAuthenticationBiometricTestReference
  **/

  public String getCustomerAuthenticationBiometricTestReference() {
    return customerAuthenticationBiometricTestReference;
  }

  public void setCustomerAuthenticationBiometricTestReference(String customerAuthenticationBiometricTestReference) {
    this.customerAuthenticationBiometricTestReference = customerAuthenticationBiometricTestReference;
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
   * `status: Provisionally Registered`  bian-reference:  (asAuthentication).SubmittedAuthenticationData.AuthenticationDataScheme(asGenericDataScheme).Format  general-info: Type of biometric record being used 
   * @return authenticationBiometricType
  **/

  public String getAuthenticationBiometricType() {
    return authenticationBiometricType;
  }

  public void setAuthenticationBiometricType(String authenticationBiometricType) {
    this.authenticationBiometricType = authenticationBiometricType;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).SubmittedAuthenticationData(asGenericData).BinaryData  general-info: Biometric record submitted for authetication e.g. face scan 
   * @return authenticationBiometricRecord
  **/

  public Object getAuthenticationBiometricRecord() {
    return authenticationBiometricRecord;
  }

  public void setAuthenticationBiometricRecord(Object authenticationBiometricRecord) {
    this.authenticationBiometricRecord = authenticationBiometricRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Registered customer biometric record reference 
   * @return registeredBiometricReference
  **/

  public String getRegisteredBiometricReference() {
    return registeredBiometricReference;
  }

  public void setRegisteredBiometricReference(String registeredBiometricReference) {
    this.registeredBiometricReference = registeredBiometricReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Registered customer biometric record  mainted by SDIssued Device Administration 
   * @return registeredBiometricRecord
  **/

  public String getRegisteredBiometricRecord() {
    return registeredBiometricRecord;
  }

  public void setRegisteredBiometricRecord(String registeredBiometricRecord) {
    this.registeredBiometricRecord = registeredBiometricRecord;
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

