/**
 * Copyright © 2019 Marcelo Caldas (mscaldas@gmail.com)
 *
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
package com.github.jcustenborder.kafka.connect.spooldir;

import java.util.Objects;

/**
* Adding Basic FileInfo to each record being generated!
*
*/

public class FileInfo {
  private String fileName;
  private long processTime;
  private long rowNumber;

  public FileInfo() {
  }

  public FileInfo(String fileName, long processTime, long rowNumber) {
    this.fileName = fileName;
    this.processTime = processTime;
    this.rowNumber = rowNumber;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public long getProcessTime() {
    return processTime;
  }

  public void setProcessTime(long processTime) {
    this.processTime = processTime;
  }

  public long getRowNumber() {
    return rowNumber;
  }

  public void setRowNumber(long rowNumber) {
    this.rowNumber = rowNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileInfo fileInfo = (FileInfo) o;
    return rowNumber == fileInfo.rowNumber &&
       Objects.equals(fileName, fileInfo.fileName) &&
       Objects.equals(processTime, fileInfo.processTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, processTime, rowNumber);
  }

  @Override
  public String toString() {
    return "FileInfo{" +
      "fileName='" + fileName + '\'' +
      ", processTime=" + processTime +
      ", rowNumber=" + rowNumber +
      '}';
  }
}
