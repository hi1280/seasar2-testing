package app.test.service;

import app.test.entity.Country;
import java.util.List;
import javax.annotation.Generated;

import static app.test.entity.CountryNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Country}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/05/17 14:46:17")
public class CountryService extends AbstractService<Country> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param code
     *            識別子
     * @return エンティティ
     */
    public Country findById(String code) {
        return select().id(code).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Country> findAllOrderById() {
        return select().orderBy(asc(code())).getResultList();
    }
}