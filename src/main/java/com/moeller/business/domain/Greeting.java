package com.moeller.business.domain;

/**
 * Created by Moeller.Bernd on 22.05.2016.
 */
public class Greeting {

  private long id;

  private String text;

  public Greeting(long id, String text) {
    this.id = id;
    this.text = text;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
