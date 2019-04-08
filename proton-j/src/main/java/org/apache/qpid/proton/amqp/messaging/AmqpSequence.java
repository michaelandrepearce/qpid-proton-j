
/*
*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*
*/


package org.apache.qpid.proton.amqp.messaging;

import java.util.List;
import java.util.Objects;

public final class AmqpSequence implements Section
{
    private final List _value;

    public AmqpSequence(List value)
    {
        _value = value;
    }

    public List getValue()
    {
        return _value;
    }

    @Override
    public String toString()
    {
        return "AmqpSequence{" +
               _value +
               '}';
    }

    @Override
    public SectionType getType() {
        return SectionType.AmqpSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AmqpSequence)) return false;
        AmqpSequence that = (AmqpSequence) o;
        return Objects.equals(_value, that._value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_value);
    }
}
