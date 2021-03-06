/**
 * Copyright (C) 2012 - 2013 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.kraken.dto.trade;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KrakenOpenOrder {

  /**
   * @param opentm
   * @param description
   * @param volume
   * @param volumeExecuted
   */
  public KrakenOpenOrder(@JsonProperty("opentm") Double opentm, @JsonProperty("descr") KrakenOrderDescription description, @JsonProperty("vol") BigDecimal volume,
      @JsonProperty("vol_exec") BigDecimal volumeExecuted) {

    this.opentm = opentm;
    this.description = description;
    this.volume = volume;
    this.volumeExecuted = volumeExecuted;
  }

  public Double getOpentm() {

    return opentm;
  }

  public KrakenOrderDescription getDescription() {

    return description;
  }

  public BigDecimal getVolume() {

    return volume;
  }

  public BigDecimal getVolumeExecuted() {

    return volumeExecuted;
  }

  private Double opentm;
  private KrakenOrderDescription description;
  private BigDecimal volume;
  private BigDecimal volumeExecuted;

}
