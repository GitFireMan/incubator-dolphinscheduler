/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dolphinscheduler.service.queue;


import java.util.concurrent.TimeUnit;

public interface TaskPriorityQueue {

    /**
     * put task info
     *
     * @param taskInfo taskInfo
     * @throws Exception
     */
    void put(String taskInfo) throws Exception;

    /**
     * take taskInfo
     * @return taskInfo
     * @throws Exception
     */
    String take()throws Exception;

    /**
     * @param timeout
     * @param unit
     * @return taskInfo
     * @throws Exception
     */
    String poll(long timeout, TimeUnit unit)throws Exception;

    /**
     * size
     *
     * @return size
     * @throws Exception
     */
    int size() throws Exception;
}