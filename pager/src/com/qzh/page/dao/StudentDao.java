package com.qzh.page.dao;

import com.qzh.page.model.Pager;
import com.qzh.page.model.Student;


/**
* @ClassName:  StudentDao   
 * @Description:TODO   
 * @author: quanziheng
 * @date:   2018年8月2日 下午2:51:33   
 *    
 */
public interface StudentDao {
	
	/**
	 * 根据查询条件，查询学生分页信息
	 * 
	 * @param searchModel
	 *            封装查询条件
	 * @param pageNum
	 *            查询第几页数据
	 * @param pageSize
	 *            每页显示多少条记录
	 * @return 查询结果
	 */
	public Pager<Student> findStudent(Student searchModel, int pageNum,
			int pageSize);
}
