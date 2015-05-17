package app.test.entity;

import app.test.entity.CityNames._CityNames;
import app.test.entity.CountryNames._CountryNames;
import app.test.entity.CountrylanguageNames._CountrylanguageNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2015/05/17 14:46:13")
public class Names {

    /**
     * {@link City}の名前クラスを返します。
     * 
     * @return Cityの名前クラス
     */
    public static _CityNames city() {
        return new _CityNames();
    }

    /**
     * {@link Country}の名前クラスを返します。
     * 
     * @return Countryの名前クラス
     */
    public static _CountryNames country() {
        return new _CountryNames();
    }

    /**
     * {@link Countrylanguage}の名前クラスを返します。
     * 
     * @return Countrylanguageの名前クラス
     */
    public static _CountrylanguageNames countrylanguage() {
        return new _CountrylanguageNames();
    }
}