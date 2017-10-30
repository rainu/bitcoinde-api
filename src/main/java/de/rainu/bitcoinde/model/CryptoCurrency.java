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

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Kryptowährung
 */
public enum CryptoCurrency {
  
  BITCOIN("btc"),
  
  BITCOIN_CASH("bch"),
  
  ETHEREUM("eth");

  private String value;

  CryptoCurrency(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CryptoCurrency fromValue(String text) {
    for (CryptoCurrency b : CryptoCurrency.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
