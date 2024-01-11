/*
 * Copyright 2023 jrosservices project
 * 
 * Website: https://github.com/pinorobotics/jrosservices
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pinorobotics.jrosservices;

/**
 * List of metrics emitted by <b>jrosservices</b>.
 *
 * @author lambdaprime intid@protonmail.com
 */
public interface JRosServiceClientMetrics {

    String REQUESTS_METRIC = "service_sent_requests";
    String REQUESTS_METRIC_DESCRIPTION = "Number of requests sent to ROS services";

    String RESPONSES_METRIC = "service_received_responses";
    String RESPONSES_METRIC_DESCRIPTION = "Number of responses received from ROS services";

    String GOAL_EXECUTION_TIME_METRIC = "service_exec_time_ms";
    String GOAL_EXECUTION_TIME_METRIC_DESCRIPTION =
            "Time in millis it took ROS service to execute the goal and send the result";
}
