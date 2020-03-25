package com.ycl.movie.service;

import java.util.List;

import com.ycl.movie.domain.Movie;

public interface MovieService {
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
	List<Movie> molist(String zd, String zhi);
	/**
	 * 
	    * @Title: deletMovie
	    * @Description: TODO(批量删除)
	    * @param @param zhi
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	boolean deletMovie(String zhi);
	/**
	 * 
	    * @Title: likelist
	    * @Description: TODO(超级模糊查询+区间查询)
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
	List<Movie> likelist(String mname, String time, String time2, String dao, String price, String price2, String nd,
			String longtime, String longtime2);
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
