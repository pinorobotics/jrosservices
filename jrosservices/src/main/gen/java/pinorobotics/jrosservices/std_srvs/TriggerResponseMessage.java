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
import id.jrosmessages.std_msgs.StringMessage;
import id.xfunction.XJson;
import java.util.Objects;

/** Definition for std_srvs/TriggerServiceResponse */
@MessageMetadata(
        name = TriggerResponseMessage.NAME,
        interfaceType = RosInterfaceType.SERVICE,
        fields = {"success", "message"},
        md5sum = "937c9679a518e3a18d831e57125ea522")
public class TriggerResponseMessage implements Message {

    static final String NAME = "std_srvs/TriggerServiceResponse";

    /** indicate successful run of triggered service */
    public boolean success;

    /** informational, e.g. for error messages */
    public StringMessage message = new StringMessage();

    public TriggerResponseMessage withSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public TriggerResponseMessage withMessage(StringMessage message) {
        this.message = message;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, message);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TriggerResponseMessage other)
            return success == other.success && Objects.equals(message, other.message);
        return false;
    }

    @Override
    public String toString() {
        return XJson.asString(
                "success", success,
                "message", message);
    }
}
