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
/**
 * Interfaces and classes which are agnostic to ROS version of ROS Services.
 *
 * <p>For usage examples see <a href="http://pinoweb.freetzi.com/jrosservices">Documentation</a>
 *
 * @see <a href="https://github.com/pinorobotics/jros2services">Java client for ROS2 Services</a>
 * @see <a href="https://github.com/pinorobotics/jros1services">Java client for ROS1 Services</a>
 * @see <a
 *     href="https://github.com/pinorobotics/jrosservices/blob/main/jrosservices/release/CHANGELOG.md">Releases</a>
 * @see <a href="https://github.com/pinorobotics/jrosservices">GitHub repository</a>
 * @author lambdaprime intid@protonmail.com
 */
module jrosservices {

    // since many of our API relies on jrosclient classes we need to ensure
    // that all modules reading this module also read jrosclient
    requires transitive jrosclient;
    requires id.xfunction;

    exports pinorobotics.jrosservices;
    exports pinorobotics.jrosservices.msgs;
    exports pinorobotics.jrosservices.exceptions;
    exports pinorobotics.jrosservices.std_srvs;
    exports pinorobotics.jrosservices.metrics;
}
