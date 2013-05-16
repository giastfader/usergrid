/*******************************************************************************
 * Copyright 2012 Apigee Corporation
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
package org.usergrid.batch;

import java.util.UUID;

/**
 * Interface to define all operations possible during a job's specific runtime
 * @author tnine
 * 
 */
public interface JobRuntime {

  /**
   * Set the transaction id for this job's runtime
   * @param transactionId
   */
  public void setTransactionId(UUID transactionId);
  
  /**
   * Get the transaction id of the run time
   * @return
   */
  public UUID getTransactionId();
  
  /**
   * Get the delay of the run time
   * @return
   */
  public long getDelay();
  
  /**
   * Get the job execution
   * @return
   */
  public JobExecution getExecution();
}
