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

import id.jrosmessages.MessageDescriptor;
import pinorobotics.jrosservices.msgs.ServiceDefinition;

/** Definition for std_srvs/srv/Trigger */
public class TriggerServiceDefinition
        implements ServiceDefinition<TriggerRequestMessage, TriggerResponseMessage> {

    @Override
    public MessageDescriptor<TriggerRequestMessage> getServiceRequestMessage() {
        return new MessageDescriptor<>(TriggerRequestMessage.class);
    }

    @Override
    public MessageDescriptor<TriggerResponseMessage> getServiceResponseMessage() {
        return new MessageDescriptor<>(TriggerResponseMessage.class);
    }
}
