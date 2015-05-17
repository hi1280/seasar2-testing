package app.test.service;

import app.test.entity.Countrylanguage;
import java.util.List;
import javax.annotation.Generated;

import static app.test.entity.CountrylanguageNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Countrylanguage}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/05/17 14:46:17")
public class CountrylanguageService extends AbstractService<Countrylanguage> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param countrycode
     *            識別子
     * @param language
     *            識別子
     * @return エンティティ
     */
    public Countrylanguage findById(String countrycode, String language) {
        return select().id(countrycode, language).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Countrylanguage> findAllOrderById() {
        return select().orderBy(asc(countrycode()), asc(language())).getResultList();
    }
}