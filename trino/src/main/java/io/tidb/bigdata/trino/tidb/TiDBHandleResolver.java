/*
 * Copyright 2021 TiDB Project Authors.
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
 */

package io.tidb.bigdata.trino.tidb;

import io.trino.spi.connector.ColumnHandle;
//import io.trino.spi.connector.ConnectorHandleResolver;
import io.trino.spi.connector.ConnectorInsertTableHandle;
import io.trino.spi.connector.ConnectorOutputTableHandle;
import io.trino.spi.connector.ConnectorSplit;
import io.trino.spi.connector.ConnectorTableHandle;
import io.trino.spi.connector.ConnectorTransactionHandle;

//public final class TiDBHandleResolver implements ConnectorHandleResolver {
//
//  @Override
//  public Class<? extends ConnectorTableHandle> getTableHandleClass() {
//    return TiDBTableHandle.class;
//  }
//
//  @Override
//  public Class<? extends ColumnHandle> getColumnHandleClass() {
//    return TiDBColumnHandle.class;
//  }
//
//  @Override
//  public Class<? extends ConnectorSplit> getSplitClass() {
//    return TiDBSplit.class;
//  }
//
//  @Override
//  public Class<? extends ConnectorTransactionHandle> getTransactionHandleClass() {
//    return TiDBTransactionHandle.class;
//  }
//
//  @Override
//  public Class<? extends ConnectorOutputTableHandle> getOutputTableHandleClass() {
//    return TiDBTableHandle.class;
//  }
//
//  @Override
//  public Class<? extends ConnectorInsertTableHandle> getInsertTableHandleClass() {
//    return TiDBTableHandle.class;
//  }
//}
