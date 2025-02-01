/*
 * Copyright 2021 jrosservices project
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

import id.jrosmessages.Message;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * Client which allows to interact with ROS Services.
 *
 * @see <a href="https://github.com/pinorobotics/jros2services">jros2services (ROS2
 *     implementation)</a>
 * @see <a href="https://github.com/pinorobotics/jros1services">jros1services (ROS1
 *     implementation)</a>
 * @see <a
 *     href="https://docs.ros.org/en/galactic/Tutorials/Services/Understanding-ROS2-Services.html">ROS2
 *     Services</a>
 * @see <a href="http://wiki.ros.org/Services">ROS1 Services</a>
 * @param <R> service request message type
 * @param <A> service response message type
 * @author lambdaprime intid@protonmail.com
 */
public interface JRosServiceClient<R extends Message, A extends Message> extends AutoCloseable {

    /**
     * Send request to ROS service and return a {@link Future} which completes when service executes
     * the request and sends the response back.
     */
    CompletableFuture<A> sendRequestAsync(R requestMessage);
}
