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

import id.jrosclient.JRosClientMetrics;

/**
 * List of metrics emitted by <b>jrosservices</b>.
 *
 * <p><b>jrosservices</b> metrics are integrated with <a
 * href="https://opentelemetry.io/">OpenTelemetry</a>.
 *
 * <p>To receive OpenTelemetry metrics users suppose to configure OpenTelemetry exporter. List of
 * Java exporters can be found in <a
 * href="https://opentelemetry.io/ecosystem/registry/?language=java&component=exporter">OpenTelemetry
 * registry</a> or in <a
 * href="https://github.com/lambdaprime/opentelemetry-exporters-pack">opentelemetry-exporters-pack</a>
 *
 * @see JRosClientMetrics
 * @author lambdaprime intid@protonmail.com
 */
public interface JRosServiceClientMetrics {

    String REQUESTS_COUNT_METRIC = "service_sent_requests_total";
    String REQUESTS_COUNT_METRIC_DESCRIPTION = "Number of requests sent to ROS services";

    String RESPONSES_COUNT_METRIC = "service_received_responses_total";
    String RESPONSES_COUNT_METRIC_DESCRIPTION = "Number of responses received from ROS services";

    String GOAL_EXECUTION_TIME_METRIC = "service_exec_time_ms";
    String GOAL_EXECUTION_TIME_METRIC_DESCRIPTION =
            "Time in millis it took ROS service to execute the goal and send the result";
}
