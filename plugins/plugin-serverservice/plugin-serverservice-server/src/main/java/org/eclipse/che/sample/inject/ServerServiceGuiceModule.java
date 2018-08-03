/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.che.sample.inject;

import com.google.inject.AbstractModule;
import org.eclipse.che.inject.DynaModule;
import org.eclipse.che.sample.MyService;

/** Server service example Guice module for setting up a simple service. */
@DynaModule
public class ServerServiceGuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(MyService.class);
  }
}
