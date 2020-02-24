/*
 * Copyright (c) 2020 Oracle and/or its affiliates. All rights reserved.
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
 *
 */
package io.helidon.example.snakeyamltest;

import java.math.BigDecimal;

public class DataImpl implements Data {

    private BigDecimal a;
    private BigDecimal b;

    public BigDecimal getA() {
        return a;
    }

    public void setA(BigDecimal value) {
        a = value;
    }

    @Override
    public BigDecimal getB() {
        return b;
    }

    @Override
    public void setB(BigDecimal value) {
        b = value;
    }


}
