/**
 * The MIT License
 * Copyright (c) 2012 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.xeiam.xchange.bter.dto.account;

import java.math.BigDecimal;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xeiam.xchange.bter.dto.BTERBaseResponse;

public class BTERFunds extends BTERBaseResponse {

  private final Map<String, BigDecimal> availableFunds;
  private final Map<String, BigDecimal> lockedFunds;

  /**
   * Constructor
   * 
   * @param aResult
   * @param theAvailableFunds
   * @param theLockedFunds
   */
  public BTERFunds(@JsonProperty("available_funds") Map<String, BigDecimal> theAvailableFunds, @JsonProperty("locked_funds") Map<String, BigDecimal> theLockedFunds,
      @JsonProperty("result") boolean result, @JsonProperty("message") final String message) {

    super(result, message);
    availableFunds = theAvailableFunds;
    lockedFunds = theLockedFunds;

  }

  public Map<String, BigDecimal> getAvailableFunds() {

    return availableFunds;
  }

  public Map<String, BigDecimal> getLockedFunds() {

    return lockedFunds;
  }

  @Override
  public String toString() {

    return "BTERAccountInfoReturn [availableFunds=" + availableFunds + ", lockedFunds=" + lockedFunds + "]";
  }

}
