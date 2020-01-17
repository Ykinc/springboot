/*
 * smart-doc https://github.com/shalousun/smart-doc
 *
 * Copyright (C) 2019-2020 smart-doc
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
 */
package com.smartdoc.chain;

import org.apache.maven.artifact.Artifact;

/**
 * @author yu 2020/1/13.
 */
public class CommonArtifactFilterChain implements FilterChain {

    private FilterChain filterChain;

    @Override
    public void setNext(FilterChain nextInChain) {
        this.filterChain = nextInChain;
    }

    @Override
    public boolean ignoreArtifactById(Artifact artifact) {
        String artifactId = artifact.getArtifactId();
        switch (artifactId) {
            case "bcprov-jdk15on":
            case "lombok":
            case "jsqlparser":
            case "disruptor":
            case "commons-codec":
            case "snakeyaml":
            case "spring-boot-autoconfigure":
            case "HikariCP":
            case "mysql-connector-java":
            case "classmate":
            case "commons-lang3":
            case "spring-web":
            case "spring-webmvc":
            case "hibernate-validator":
            case "xstream":
            case "guava":
            case "spring-tx":
                return true;
            default:
                return false;
        }
    }
}