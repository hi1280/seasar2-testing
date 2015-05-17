package app.test.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

public class IndexService {
	
	@Resource
	protected JdbcManager jdbcManager;

	@SuppressWarnings("unchecked")
	public HashMap<String, Object> index(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		Map<String,Object> result = jdbcManager.selectBySql(HashMap.class, "select * from City where id = ?", 1).getSingleResult();
		map.put("list", result);
		return map;
	}
}
