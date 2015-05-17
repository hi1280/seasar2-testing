package app.test.service;

import java.io.File;

import net.arnx.jsonic.JSON;

import org.apache.commons.io.FileUtils;
import org.seasar.extension.unit.S2TestCase;
import org.seasar.framework.util.ResourceUtil;
import org.skyscreamer.jsonassert.JSONAssert;

/**
 * {@link CityService}のテストクラスです。
 * 
 */
public class IndexServiceTest extends S2TestCase {

    private IndexService indexService;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("app.dicon");
    }

    /**
     * {@link #indexService}が利用可能であることをテストします。
     * 
     * @throws Exception
     */
    public void test検索テスト() throws Exception {
		JSONAssert.assertEquals(FileUtils.readFileToString(getFile()),JSON.encode(indexService.index().get("list")),false);
    }
    
    private static File getFile(){
    	return ResourceUtil.getResourceAsFile(ResourceUtil.convertPath("index.json", IndexServiceTest.class));
    }
    
}