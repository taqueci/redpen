/**
 * DocumentValidator
 * Copyright (c) 2013-, Takahiko Ito, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package org.unigram.docvalidator.store;

import java.util.Iterator;
import java.util.Vector;

/**
 * Represent List in semi-structured format such as wiki.
 */
public final class List implements Block {
  /**
   * Constructor.
   */
  public List() {
    super();
    this.listElements = new Vector<ListElement>();
  }

  /**
   * get iterator of list elements.
   * @return Iterator of ListElement
   */
  public Iterator<ListElement> getListElements() {
    return listElements.iterator();
  }

  /**
   * get the number of list elements.
   * @return number of list elements
   */
  public int getNumberOfListElements() {
    return listElements.size();
  }

  public int getBlockID() {
    return BlockTypes.LIST;
  }

  /**
   * Append ListElement.
   * @param level indentation level
   * @param content content of list element
   */
  public void appendElement(int level, String content) {
    listElements.add(new ListElement(level, content));
  }

  public int extractSummary() {
    return 0;
  }

  private Vector<ListElement> listElements;
}
