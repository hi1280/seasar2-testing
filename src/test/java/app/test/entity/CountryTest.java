package app.test.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static app.test.entity.CountryNames.*;

/**
 * {@link Country}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2015/05/17 14:46:19")
public class CountryTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(Country.class).id("aaa").getSingleResult();
    }

    /**
     * cityListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_cityList() throws Exception {
        jdbcManager.from(Country.class).leftOuterJoin(cityList()).id("aaa").getSingleResult();
    }

    /**
     * countrylanguageListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_countrylanguageList() throws Exception {
        jdbcManager.from(Country.class).leftOuterJoin(countrylanguageList()).id("aaa").getSingleResult();
    }
}