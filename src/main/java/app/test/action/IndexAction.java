package app.test.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import app.test.service.IndexService;

public class IndexAction {
	
	@Resource
	protected IndexService indexService;

	@Execute(validator = false)
	public String index() {
		System.out.println(indexService.index());
		return "index.jsp";
	}
}