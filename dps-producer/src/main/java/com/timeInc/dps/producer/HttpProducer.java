/*******************************************************************************
 * Copyright 2014 Time Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.timeInc.dps.producer;

import com.timeInc.dps.producer.http.request.DownloadRequest;
import com.timeInc.dps.producer.http.request.ProducerRequest;
import com.timeInc.dps.producer.response.Status;

/**
 * Responsible for sending Adobe Folio DPS requests and returning the response.
 *
 */
interface HttpProducer {
	/**
	 * Send a producer request whose response is a subtype of Status
	 * @param request the request to send
	 * @return the response
	 */
	<V extends Status> V sendRequest(ProducerRequest<V> request);
	
	/**
	 * Send a download request
	 * @param request the request to send
	 * @return a byte array of the response
	 */
	byte[] retrieve(DownloadRequest request);
}
