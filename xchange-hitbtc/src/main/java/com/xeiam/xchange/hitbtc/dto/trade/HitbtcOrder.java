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
package com.xeiam.xchange.hitbtc.dto.trade;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HitbtcOrder {

  private final long orderId;
  private final String orderStatus;
  private final long lastTimestamp;
  private final BigDecimal orderPrice;
  private final BigDecimal orderQuantity;
  private final BigDecimal avgPrice;
  private final BigDecimal quantityLeaves;
  private final String type;
  private final String timeInForce;
  private final BigDecimal cumQuantity;
  private final String clientOrderId;
  private final String symbol;
  private final String side;
  private final BigDecimal execQuantity;

  public HitbtcOrder(@JsonProperty("orderId") long orderId, @JsonProperty("orderStatus") String orderStatus, @JsonProperty("lastTimestamp") long lastTimestamp,
      @JsonProperty("orderPrice") BigDecimal orderPrice, @JsonProperty("orderQuantity") BigDecimal orderQuantity, @JsonProperty("avgPrice") BigDecimal avgPrice,
      @JsonProperty("quantityLeaves") BigDecimal quantityLeaves, @JsonProperty("type") String type, @JsonProperty("timeInForce") String timeInForce,
      @JsonProperty("cumQuantity") BigDecimal cumQuantity, @JsonProperty("clientOrderId") String clientOrderId, @JsonProperty("symbol") String symbol, @JsonProperty("side") String side,
      @JsonProperty("execQuantity") BigDecimal execQuantity) {

    super();
    this.orderId = orderId;
    this.orderStatus = orderStatus;
    this.lastTimestamp = lastTimestamp;
    this.orderPrice = orderPrice;
    this.orderQuantity = orderQuantity;
    this.avgPrice = avgPrice;
    this.quantityLeaves = quantityLeaves;
    this.type = type;
    this.timeInForce = timeInForce;
    this.cumQuantity = cumQuantity;
    this.clientOrderId = clientOrderId;
    this.symbol = symbol;
    this.side = side;
    this.execQuantity = execQuantity;
  }

  public long getOrderId() {

    return orderId;
  }

  public String getOrderStatus() {

    return orderStatus;
  }

  public long getLastTimestamp() {

    return lastTimestamp;
  }

  public BigDecimal getOrderPrice() {

    return orderPrice;
  }

  public BigDecimal getOrderQuantity() {

    return orderQuantity;
  }

  public BigDecimal getAvgPrice() {

    return avgPrice;
  }

  public BigDecimal getQuantityLeaves() {

    return quantityLeaves;
  }

  public String getType() {

    return type;
  }

  public String getTimeInForce() {

    return timeInForce;
  }

  public BigDecimal getCumQuantity() {

    return cumQuantity;
  }

  public String getClientOrderId() {

    return clientOrderId;
  }

  public String getSymbol() {

    return symbol;
  }

  public String getSide() {

    return side;
  }

  public BigDecimal getExecQuantity() {

    return execQuantity;
  }

  @Override
  public String toString() {

    StringBuilder builder = new StringBuilder();
    builder.append("HitbtcOrderResponse [orderId=");
    builder.append(orderId);
    builder.append(", orderStatus=");
    builder.append(orderStatus);
    builder.append(", lastTimestamp=");
    builder.append(lastTimestamp);
    builder.append(", orderPrice=");
    builder.append(orderPrice);
    builder.append(", orderQuantity=");
    builder.append(orderQuantity);
    builder.append(", avgPrice=");
    builder.append(avgPrice);
    builder.append(", quantityLeaves=");
    builder.append(quantityLeaves);
    builder.append(", type=");
    builder.append(type);
    builder.append(", timeInForce=");
    builder.append(timeInForce);
    builder.append(", cumQuantity=");
    builder.append(cumQuantity);
    builder.append(", clientOrderId=");
    builder.append(clientOrderId);
    builder.append(", symbol=");
    builder.append(symbol);
    builder.append(", side=");
    builder.append(side);
    builder.append(", execQuantity=");
    builder.append(execQuantity);
    builder.append("]");
    return builder.toString();
  }
}
