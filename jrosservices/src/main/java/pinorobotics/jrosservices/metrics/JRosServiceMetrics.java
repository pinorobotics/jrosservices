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
package pinorobotics.jrosservices.metrics;

/**
 * List of metrics emitted by JRosService.
 *
 * @author lambdaprime intid@protonmail.com
 */
public interface JRosServiceMetrics {

    String REQUESTS_RECEIVED_COUNT_METRIC = "service_received_requests_total";
    String REQUESTS_RECEIVED_COUNT_METRIC_DESCRIPTION =
            "Number of requests received by the service";

    String REQUESTS_FAILED_COUNT_METRIC = "service_failed_requests_total";
    String REQUESTS_FAILED_COUNT_METRIC_DESCRIPTION = "Number of failed requests";

    String SERVICE_GOAL_EXECUTION_TIME_METRIC = "service_exec_time_ms";
    String SERVICE_GOAL_EXECUTION_TIME_METRIC_DESCRIPTION =
            "Time in millis it took ROS service to execute the goal";
}
