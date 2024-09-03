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
package pinorobotics.jrosservices.std_srvs;

import id.jrosmessages.Message;
import id.jrosmessages.MessageMetadata;
import id.jrosmessages.RosInterfaceType;

/** Definition for std_srvs/EmptyServiceRequest */
@MessageMetadata(
        name = EmptyRequestMessage.NAME,
        interfaceType = RosInterfaceType.SERVICE,
        md5sum = "d41d8cd98f00b204e9800998ecf8427e")
public class EmptyRequestMessage implements Message {

    static final String NAME = "std_srvs/EmptyServiceRequest";
}
