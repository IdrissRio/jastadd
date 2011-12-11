package test;

import java.util.*;
import test.ast.*;

public class Test162 {

  public static void main(String[] args) {

    B b1 = new B();
    A a = new A(b1);

    // Compute NTAs
    System.out.println("computing a.d()");
    a.d();
    System.out.println("computing a.makeB()");
    B b = a.makeB();
    System.out.println("computing b.a()");
    b.a();
    
    System.out.println("-- Dependencies/Cache after a.makeB and b.a:");
    a.dumpDependencies();
    a.dumpCachedValues();
    b.dumpDependencies();
    b.dumpCachedValues();
    b1.dumpDependencies();
    b1.dumpCachedValues();


    // Change
    a.setName("b");
  
    System.out.println("-- Dependencies/Cache after a.setName:");
    a.dumpDependencies();
    a.dumpCachedValues();
    b.dumpDependencies();
    b.dumpCachedValues();
    b1.dumpDependencies();
    b1.dumpCachedValues();
  
  }
}
