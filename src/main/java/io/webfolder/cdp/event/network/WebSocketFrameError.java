/**
 * The MIT License
 * Copyright © 2017 WebFolder OÜ
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
package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Fired when WebSocket frame error occurs
 */
@Experimental
@Domain("Network")
@EventName("webSocketFrameError")
public class WebSocketFrameError {
    private String requestId;

    private Double timestamp;

    private String errorMessage;

    /**
     * Request identifier.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Request identifier.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Timestamp.
     */
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp.
     */
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * WebSocket frame error message.
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * WebSocket frame error message.
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
