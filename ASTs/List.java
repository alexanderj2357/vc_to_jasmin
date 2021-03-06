package VC.ASTs;

import VC.Scanner.SourcePosition;

public abstract class List extends AST {

  public List (SourcePosition position) {
    super (position);
  }

  public boolean isEmptyArgList() {
    return this instanceof EmptyArgList;
  }

  public boolean isEmptyParaList() {
    return this instanceof EmptyParaList;
  }

  public boolean isEmptyStmtList() {
    return this instanceof EmptyStmtList;
  }

  public boolean isEmptyExprList() {
    return this instanceof EmptyExprList;
  }

  public boolean isEmptyDeclList() {
    return this instanceof EmptyDeclList;
  }

  public boolean isEmpty() {
    return isEmptyArgList() || isEmptyParaList() || isEmptyStmtList() 
           || isEmptyExprList() || isEmptyDeclList();
  }

}
