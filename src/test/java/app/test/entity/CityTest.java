package app.test.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static app.test.entity.CityNames.*;

/**
 * {@link City}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2015/05/17 14:46:19")
public class CityTest extends S2TestCase {

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
        jdbcManager.from(City.class).id(1).getSingleResult();
    }

    /**
     * countryとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_country() throws Exception {
        jdbcManager.from(City.class).leftOuterJoin(country()).id(1).getSingleResult();
    }
}