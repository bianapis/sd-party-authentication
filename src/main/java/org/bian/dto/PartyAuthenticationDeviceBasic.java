package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PartyAuthenticationDeviceBasic
 */
public class PartyAuthenticationDeviceBasic   {
  private String customerReference = null;

  private String partyReference = null;

  private String authenticationType = null;

  private String authenticationDeviceReference = null;

  private String authenticationDevicePropertyValue = null;

  private String issuedDeviceReference = null;

  private String issuedDevicePropertyValue = null;

  private Object customerContactAuthenticationRecord = null;

  private String customerContactAuthenticationLevel = null;

  private String customerContactAuthenticationGrant = null;


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
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EwTfUMTGEeChad0JzLk7QA_-1978180945/elements/_EwTfUcTGEeChad0JzLk7QA_434950303) general-info: Authentication subject can be identified as a party or legal entity 
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
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).AuthenticationTool  general-info: Device being used for authentication 
   * @return authenticationDeviceReference
  **/

  public String getAuthenticationDeviceReference() {
    return authenticationDeviceReference;
  }

  public void setAuthenticationDeviceReference(String authenticationDeviceReference) {
    this.authenticationDeviceReference = authenticationDeviceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: property of the device being used to authticate e.g. phone number, URL 
   * @return authenticationDevicePropertyValue
  **/

  public String getAuthenticationDevicePropertyValue() {
    return authenticationDevicePropertyValue;
  }

  public void setAuthenticationDevicePropertyValue(String authenticationDevicePropertyValue) {
    this.authenticationDevicePropertyValue = authenticationDevicePropertyValue;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  (asAuthentication).AuthenticationTool(asResource).CurrentAllocation   general-info: Registered customer device reference           
   * @return issuedDeviceReference
  **/

  public String getIssuedDeviceReference() {
    return issuedDeviceReference;
  }

  public void setIssuedDeviceReference(String issuedDeviceReference) {
    this.issuedDeviceReference = issuedDeviceReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).AuthenticationTool.StoredData.BinaryData `status: Provisionally Registered` bian-reference:  (asAuthentication).AuthenticationTool.StoredData.TextualData  general-info: Registered customer device properties  mainted by SDIssued Device Administration 
   * @return issuedDevicePropertyValue
  **/

  public String getIssuedDevicePropertyValue() {
    return issuedDevicePropertyValue;
  }

  public void setIssuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
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
   * `status: Provisionally Registered` bian-reference:  (asAuthentication).AuthenticationLevel  general-info: value returned as a result of the authentication task, defining the level of identity assurance achieved  valid for the duration of the current contact 
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

