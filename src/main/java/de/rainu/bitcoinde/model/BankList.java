/*
 * bitcoin.de API
 * This specification describe the public api of bitcoin.de
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.rainu.bitcoinde.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Bankenländerliste
 */
public enum BankList {
  
  AT("AT"),
  
  BE("BE"),
  
  BG("BG"),
  
  CH("CH"),
  
  CY("CY"),
  
  CZ("CZ"),
  
  DE("DE"),
  
  DK("DK"),
  
  EE("EE"),
  
  ES("ES"),
  
  FI("FI"),
  
  FR("FR"),
  
  GB("GB"),
  
  GR("GR"),
  
  HR("HR"),
  
  HU("HU"),
  
  IE("IE"),
  
  IS("IS"),
  
  IT("IT"),
  
  LI("LI"),
  
  LT("LT"),
  
  LU("LU"),
  
  LV("LV"),
  
  MT("MT"),
  
  MQ("MQ"),
  
  NL("NL"),
  
  NO("NO"),
  
  PL("PL"),
  
  PT("PT"),
  
  RO("RO"),
  
  SE("SE"),
  
  SI("SI"),
  
  SK("SK");

  private String value;

  BankList(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BankList fromValue(String text) {
    for (BankList b : BankList.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

