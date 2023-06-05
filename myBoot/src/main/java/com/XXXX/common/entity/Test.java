package com.XXXX.common.entity;

import lombok.Data;

@Data
public class Test {

  private long id;
  private long datetime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDatetime() {
    return datetime;
  }

  public void setDatetime(long datetime) {
    this.datetime = datetime;
  }

}
