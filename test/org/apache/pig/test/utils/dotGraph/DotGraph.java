/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.pig.test.utils.dotGraph;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/***
 * This represents graph structure in DOT format
 */
public class DotGraph {

    public String name;
    public List<DotEdge> edges = new ArrayList<DotEdge>() ;
    public List<DotNode> nodes = new ArrayList<DotNode>() ;
    public Map<String, String> attributes = new HashMap<String,String>() ;


    public DotGraph(String name) {
        this.name = name ;
    }

}
