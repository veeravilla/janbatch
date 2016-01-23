package com.test.util;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.apache.commons.collections.bidimap.UnmodifiableBidiMap;

public class BidiMapExample {
  public static void main(String args[]) {

    BidiMap agentToCode = new DualHashBidiMap();
    agentToCode.put("007", "Bond");
    agentToCode.put("006", "Joe");

    agentToCode = UnmodifiableBidiMap.decorate(agentToCode);
    agentToCode.put("002", "Fairbanks"); // throws Exception
    agentToCode.remove("007"); // throws Exception
    agentToCode.removeValue("Bond"); // throws Exception
  }
}