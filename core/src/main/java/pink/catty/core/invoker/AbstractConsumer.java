/*
 * Copyright 2020 The Catty Project
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
package pink.catty.core.invoker;

import pink.catty.core.meta.ConsumerMeta;

public abstract class AbstractConsumer
    extends AbstractInvoker
    implements Consumer {

  public AbstractConsumer(Consumer next) {
    super(next);
  }

  @Override
  public ConsumerMeta getMeta() {
    return (ConsumerMeta) next.getMeta();
  }
}
