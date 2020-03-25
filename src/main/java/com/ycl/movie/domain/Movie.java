package com.ycl.movie.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
    * @ClassName: Movie
    * @Description: TODO(私有类)
    * @author 袁成龙
    * @date 2020年3月23日
    *
 */
public class Movie implements Serializable{
	
	private Integer id;
	private String mname;
	private String dao;
	private String price;
	private String time;
	private String longtime;
	private String lx;
	private String nd;
	private String qy;
	private String zt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDao() {
		return dao;
	}
	public void setDao(String dao) {
		this.dao = dao;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLongtime() {
		return longtime;
	}
	public void setLongtime(String longtime) {
		this.longtime = longtime;
	}
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
	public String getNd() {
		return nd;
	}
	public void setNd(String nd) {
		this.nd = nd;
	}
	public String getQy() {
		return qy;
	}
	public void setQy(String qy) {
		this.qy = qy;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", mname=" + mname + ", dao=" + dao + ", price=" + price + ", time=" + time
				+ ", longtime=" + longtime + ", lx=" + lx + ", nd=" + nd + ", qy=" + qy + ", zt=" + zt + "]";
	}
	public Movie(Integer id, String mname, String dao, String price, String time, String longtime, String lx, String nd,
			String qy, String zt) {
		super();
		this.id = id;
		this.mname = mname;
		this.dao = dao;
		this.price = price;
		this.time = time;
		this.longtime = longtime;
		this.lx = lx;
		this.nd = nd;
		this.qy = qy;
		this.zt = zt;
	}
	
	
	
}
