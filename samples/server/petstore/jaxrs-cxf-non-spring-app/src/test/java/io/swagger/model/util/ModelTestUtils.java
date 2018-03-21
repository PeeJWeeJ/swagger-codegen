/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.model.util;


import java.io.File;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Model test utils.
 */
public class ModelTestUtils {

    /**
     * Creates an instance of required class.
     */
    public static <T> T getInstanceOf(Class<T> clazz) {
        if (clazz.isAssignableFrom(Boolean.class)) {
            return (T) Boolean.TRUE;
        }
        if (clazz.isAssignableFrom(String.class)) {
            return (T) "Test value.";
        }
        if (Integer.class.isAssignableFrom(clazz)) {
            return (T) Integer.valueOf(1);
        }
        if (Number.class.isAssignableFrom(clazz)) {
            return (T) Double.valueOf(12);
        }
        if (Long.class.isAssignableFrom(clazz)) {
            return (T) Long.valueOf(123);
        }
        if (Float.class.isAssignableFrom(clazz)) {
            return (T) Float.valueOf(1234);
        }
        if (Double.class.isAssignableFrom(clazz)) {
            return (T) Double.valueOf(12345);
        }
        if (List.class.isAssignableFrom(clazz)) {
            return (T) new ArrayList();
        }
        if (Map.class.isAssignableFrom(clazz)) {
            return (T) new HashMap();
        }
        if (Set.class.isAssignableFrom(clazz)) {
            return (T) new HashSet();
        }
        if (File.class.isAssignableFrom(clazz)) {
            return (T) new File(".");
        }
        if (byte[].class.isAssignableFrom(clazz)) {
            return (T) new byte[1];
        }
        if (UUID.class.isAssignableFrom(clazz)) {
            return (T) UUID.randomUUID();
        }
        if (Enum.class.isAssignableFrom(clazz)) {
            // throw new RuntimeException("Enum not implemented.");
            return null;
        }
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}