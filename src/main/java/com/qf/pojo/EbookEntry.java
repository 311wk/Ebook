package com.qf.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class EbookEntry {

  private long id;
  private long categoryId;
  private String title;
  private String summary;
  private String uploaduser;
  private Date createdate;
  private String name;



}
