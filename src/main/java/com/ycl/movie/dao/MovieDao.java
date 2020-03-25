package com.ycl.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ycl.movie.domain.Movie;

public interface MovieDao {
	/**
	 * @param zhi 
	 * @param zd 
	 * 
	    * @Title: molist
	    * @Description: TODO(查询所有)
	    * @param @return    参数
	    * @return List<Movie>    返回类型
	    * @throws
	 */
	List<Movie> molist(@Param("zd")String zd,@Param("zhi")String zhi);
	/**
	 * 
	    * @Title: deleteMovie
	    * @Description: TODO(批量删除)
	    * @param @param zhi
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	boolean deleteMovie(@Param("id")String zhi);
	/**
	 * 
	    * @Title: likelist
	    * @Description: TODO(超级模糊查新+区间查询)
	    * @param @param mname
	    * @param @param time
	    * @param @param time2
	    * @param @param dao
	    * @param @param price
	    * @param @param price2
	    * @param @param nd
	    * @param @param longtime
	    * @param @param longtime2
	    * @param @return    参数
	    * @return List<Movie>    返回类型
	    * @throws
	 */
	List<Movie> likelist(@Param("mname")String mname,@Param("time")String time,@Param("time2")String time2,@Param("dao")String dao,@Param("price")String price,@Param("price2")String price2,@Param("nd")String nd,
			@Param("longtime")String longtime,@Param("longtime2")String longtime2);
	/**
	 * 
	    * @Title: updateMovieSj
	    * @Description: TODO(上架修改)
	    * @param @param id    参数
	    * @return void    返回类型
	    * @throws
	 */
	void updateMovieSj(Integer id);
	/**
	 * 
	    * @Title: updateMovieXj
	    * @Description: TODO(下架修改)
	    * @param @param id    参数
	    * @return void    返回类型
	    * @throws
	 */
	void updateMovieXj(Integer id);
}
