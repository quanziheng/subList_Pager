/**
 * @Title:  SubListStudentServiceImpl.java   
 * @Package com.qzh.page.service   
 * @Description:    TODO  
 * @author: quanziheng 
 * @date:   2018年8月1日 下午11:48:33   
 * @version V1.0 
 * 
 */
package com.qzh.page.service;

import com.qzh.page.dao.StudentDao;
import com.qzh.page.dao.SubListStudentDaoImpl;
import com.qzh.page.model.Pager;
import com.qzh.page.model.Student;

/**
* @ClassName:  SubListStudentServiceImpl   
 * @Description:TODO   
 * @author: quanziheng
 * @date:   2018年8月1日 下午11:48:33   
 *    
 */
public class SublistStudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	public SublistStudentServiceImpl(){
		
		//创建service实现类时，初始化dao 对象
		studentDao = new SubListStudentDaoImpl();
		
	}
	
	
	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	/* (non-Javadoc)
	 * <p>Title: findStudent</p>   
	 * <p>Description: </p>   
	 * @param searchModel
	 * @param pageNum
	 * @param pageSize
	 * @return   
	 * @see com.qzh.page.service.StudentService#findStudent(com.qzh.page.model.Student, int, int)  
	 */
	@Override
	public Pager<Student> findStudent(Student searchModel, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		Pager<Student> result = studentDao.findStudent(searchModel, pageNum, pageSize);
		return result;
	}

}
