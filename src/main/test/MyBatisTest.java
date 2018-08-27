import com.mybatis.Employee;
import com.mybatis.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName MyBatisTest
 * @Description
 * @Author martind
 * @Date 2018/8/8 17:09
 **/
public class MyBatisTest {
//    @Test
//    public void test() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession openSession = sqlSessionFactory.openSession();
//        try{
//            List<Employee> employees = openSession.selectList("EmpMapper.getEmpById",1);
//            System.out.println(employees);
//        }finally {
//            openSession.close();
//        }
//
//    }

    @Test
    public void test1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession openSession = sqlSessionFactory.openSession();

        try{
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);

            Employee employee = mapper.getEmpById(1);
            System.out.println(employee);
        }finally {
            openSession.close();
        }
//        System.out.println("hello");
    }
}
