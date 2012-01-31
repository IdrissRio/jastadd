package test;

import java.util.*;
import test.ast.*;

public class Test165 {

  public static void main(String[] args) {

    B b1 = new B();
    B b2 = new B();
    A a = new A(b2, b1);

    // Compute NTAs
    a.d();
    B b = a.getNode();
    b.a();
    
    System.out.println("-- Dependencies/Cache after a.d, a.getNode and b.a:");
    a.dumpDependencies();
    a.dumpCachedValues();
    b.dumpDependencies();
    b.dumpCachedValues();
    b1.dumpDependencies();
    b1.dumpCachedValues();

    // Change
    a.setNode(null);
  
    System.out.println("-- Dependencies/Cache after a.setNode:");
    a.dumpDependencies();
    a.dumpCachedValues();
    b.dumpDependencies();
    b.dumpCachedValues();
    b1.dumpDependencies();
    b1.dumpCachedValues();
  }
}
