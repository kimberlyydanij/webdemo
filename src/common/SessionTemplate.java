package common;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionTemplate {
	
	private SessionTemplate() {
	
	}
	
	private static SessionTemplate sTemplate = new SessionTemplate();
	
	public static SessionTemplate getTemplate() {
		return sTemplate;
	}
	
	public static SqlSession getSqlSession() {
		SqlSession session =null;
		
			//1. 트랜잭션이 설정되어 있는 파일의 경로를 정의한다.
			String resource = "config/configuration.xml";
			
			//2. 설정 파일을 로딩하기 위해 입출력스트림과 연결한다.
			try(Reader reader = Resources.getResourceAsReader(resource)) {
			
			//3. 설정 파일을 저장하기 위한 팩토리를 생성해 줄 수 있는 빌더를 생성한다.
				SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();
				
			//4. 설정 파일의 정보를 읽어와  sqlBuilder에 생성한다.
				SqlSessionFactory factory = sqlBuilder.build(reader);
			
			//5. 쿼리문에 접근할 수 있도록 sqlSession 객체를 리턴한다.
				//openSession()의 기본값은  false이다.
				//자동 커밋을 설정하고 싶으면 openSession(ture)로 설정한다.
				//실무에서는 자동 커밋을 사용하지 않는다.
				session = factory.openSession(true);  //자동커밋
				
			} catch (IOException e) {
				e.printStackTrace();
			} // end catch
			
			return session;
	} // end getSqlSession
	
} // end class
