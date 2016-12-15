/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.apache.tinkerpop.gremlin.process.actor;

import org.apache.tinkerpop.gremlin.process.Processor;
import org.apache.tinkerpop.gremlin.structure.Partitioner;

import java.util.concurrent.Future;

/**
 * GraphActors is a message-passing based graph {@link Processor} that is:
 * asynchronous, distributed, and partition centric.
 *
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public interface GraphActors<R> extends Processor {

    public GraphActors<R> program(final ActorProgram<R> program);

    public GraphActors<R> partitioner(final Partitioner partitioner);

    public Future<R> submit();
}
