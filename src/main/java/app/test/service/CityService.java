package app.test.service;

import app.test.entity.City;
import java.util.List;
import javax.annotation.Generated;

import static app.test.entity.CityNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link City}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/05/17 14:46:17")
public class CityService extends AbstractService<City> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public City findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<City> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}