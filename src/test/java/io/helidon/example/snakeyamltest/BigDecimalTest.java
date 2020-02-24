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

import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.StringWriter;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BigDecimalTest {

    @Test
    public void showQuotedOutput() {
        Yaml yaml = new Yaml();
        Data data = new DataImpl();
        data.setA(new BigDecimal(10.0));
        data.setB(new BigDecimal(10.2));
        StringWriter sw = new StringWriter();
        yaml.dump(data, sw);
        assertFalse(sw.toString().contains("'10'"), () -> String.format("Expected unquoted 10 but was quoted: %s", sw.toString()));
    }
}
