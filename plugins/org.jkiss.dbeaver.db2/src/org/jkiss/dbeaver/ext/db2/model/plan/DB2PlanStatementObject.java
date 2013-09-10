/*
 * Copyright (C) 2013      Denis Forveille titou10.titou10@gmail.com
 * Copyright (C) 2010-2013 Serge Rieder serge@jkiss.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.jkiss.dbeaver.ext.db2.model.plan;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

/**
 * DB2 EXPLAIN_OBJECT table
 * 
 * @author Denis Forveille
 * 
 */
public class DB2PlanStatementObject {

   private DB2PlanStatement db2PlanStatement;

   private String           objectSchema;
   private String           objectName;
   private String           objectType;

   // TODO DF: and many many more

   // ------------
   // Constructors
   // ------------

   public DB2PlanStatementObject(JDBCResultSet dbResult, DB2PlanStatement db2PlanStatement) {
      this.db2PlanStatement = db2PlanStatement;

      this.objectSchema = JDBCUtils.safeGetString(dbResult, "OBJECT_SCHEMA");
      this.objectName = JDBCUtils.safeGetString(dbResult, "OBJECT_NAME");
      this.objectType = JDBCUtils.safeGetString(dbResult, "OBJECT_TYPE");
   }

   // ----------------
   // Standard Getters
   // ----------------
   public DB2PlanStatement getDb2PlanStatement() {
      return db2PlanStatement;
   }

   public String getObjectSchema() {
      return objectSchema;
   }

   public String getObjectName() {
      return objectName;
   }

   public String getObjectType() {
      return objectType;
   }

}
