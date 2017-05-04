/*
 *  Copyright 2017 The Symphony Software Foundation
 *
 *  Licensed to The Symphony Software Foundation (SSF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.symphonyoss.vb.mail;

/**
 * Created by Frank on 1/24/2016.
 */
public class MailerWorker implements Runnable {

    String to;
    String from;
    String subject;
    String body;

    public MailerWorker(String to, String from, String subject, String body){

        this.to = to;
        this.body = body;
        this.from = from;
        this.subject = subject;

    }

    @Override
    public void run() {

        Mailer.send(mailer -> mailer
                .to(to)
                .from(from)
                .subject(subject)
                .body(body)
        );

    }
}
