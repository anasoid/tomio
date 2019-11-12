/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.anasoid.tomio.valves;

import java.io.IOException;
import javax.servlet.ServletException;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;

/**
 *  TomioValve : main valve for Tomio.
 * @author anasoid
 * @since 1.0
 */
public class TomioValve extends ValveBase {

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.catalina.Valve#invoke(org.apache.catalina.connector.Request,
   * org.apache.catalina.connector.Response)
   */
  @Override
  public void invoke(Request request, Response response) throws IOException, ServletException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Auto-generated method stub");
  }

}
