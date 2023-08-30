package com.aurionpro.model;

public enum Builder { 

  Yash, Nitesh, Akash, Rohit, OLSON, RYAN, PRS, ANY;

  public String toString() {
    switch(this) {
      case Yash:   return "Yash";
      case Nitesh:   return "Nitesh";
      case Akash:   return "Akash";
      case Rohit: return "Rohit";
      case OLSON:    return "Olson";
      case RYAN:     return "Ryan";
      case PRS :     return "PRS";
      default:       return "Unspecified";
    }
  }
}