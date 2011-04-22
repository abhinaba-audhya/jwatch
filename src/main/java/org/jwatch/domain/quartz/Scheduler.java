/**
 * JWatch - Quartz Monitor: http://code.google.com/p/jwatch/
 * Copyright (C) 2011 Roy Russo and the original author or authors.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 **/
package org.jwatch.domain.quartz;

/**
 * Maps to org.quartz.Scheduler interface.
 *
 * @author <a href="mailto:royrusso@gmail.com">Roy Russo</a>
 *         Date: Apr 13, 2011 4:16:22 PM
 */
public class Scheduler
{
   private String instanceUUID;
   private String name;
   private String instanceId;
   private boolean started;
   private boolean shutdown;
   private boolean standByMode;
   private String version;
   private String jobStoreClassName;
   private int threadPoolSize;

   public String getInstanceUUID()
   {
      return instanceUUID;
   }

   public void setInstanceUUID(String instanceUUID)
   {
      this.instanceUUID = instanceUUID;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getInstanceId()
   {
      return instanceId;
   }

   public void setInstanceId(String instanceId)
   {
      this.instanceId = instanceId;
   }

   public boolean isStarted()
   {
      return started;
   }

   public void setStarted(boolean started)
   {
      this.started = started;
   }

   public boolean isShutdown()
   {
      return shutdown;
   }

   public void setShutdown(boolean shutdown)
   {
      this.shutdown = shutdown;
   }

   public boolean isStandByMode()
   {
      return standByMode;
   }

   public void setStandByMode(boolean standByMode)
   {
      this.standByMode = standByMode;
   }

   public String getVersion()
   {
      return version;
   }

   public void setVersion(String version)
   {
      this.version = version;
   }

   public String getJobStoreClassName()
   {
      return jobStoreClassName;
   }

   public void setJobStoreClassName(String jobStoreClassName)
   {
      this.jobStoreClassName = jobStoreClassName;
   }

   public int getThreadPoolSize()
   {
      return threadPoolSize;
   }

   public void setThreadPoolSize(int threadPoolSize)
   {
      this.threadPoolSize = threadPoolSize;
   }
}
