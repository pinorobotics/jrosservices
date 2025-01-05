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
package pinorobotics.jrosservices.msgs;

import id.jrosmessages.Message;
import id.jrosmessages.MessageDescriptor;
import pinorobotics.jrosservices.JRosServiceClient;

/**
 * Service definition.
 *
 * <p>In ROS, messages which are used to communicate with ROS Services are defined in srv/*.srv
 * files. For each service it needs to have 2 messages: Request, Response.
 *
 * <p>This interface acts similar to *.srv files. Users describe messages for communicating with
 * each ROS Service by implementing it. Later {@link JRosServiceClient} is using these definitions
 * to send a requests to ROS Services and receive results from them.
 *
 * <p>Since there are many message types involved it is easy to accidently mix-up message types from
 * different ROS Services. This interface helps to address this too. It consolidates all message
 * types for each ROS Service and helps to detect any type issues during compile time.
 *
 * @param <R> request message type
 * @param <A> response message type
 * @see <a
 *     href="https://docs.ros.org/en/humble/Tutorials/Beginner-Client-Libraries/Custom-ROS2-Interfaces.html">Defining
 *     services in ROS2</a>
 * @see <a href="http://wiki.ros.org/srv">Defining services in ROS1</a>
 * @author lambdaprime intid@protonmail.com
 */
public interface ServiceDefinition<R extends Message, A extends Message> {

    MessageDescriptor<R> getServiceRequestMessage();

    MessageDescriptor<A> getServiceResponseMessage();
}
