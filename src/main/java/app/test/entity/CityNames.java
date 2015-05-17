package app.test.entity;

import app.test.entity.CountryNames._CountryNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link City}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/05/17 14:46:13")
public class CityNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * countrycodeのプロパティ名を返します。
     * 
     * @return countrycodeのプロパティ名
     */
    public static PropertyName<String> countrycode() {
        return new PropertyName<String>("countrycode");
    }

    /**
     * districtのプロパティ名を返します。
     * 
     * @return districtのプロパティ名
     */
    public static PropertyName<String> district() {
        return new PropertyName<String>("district");
    }

    /**
     * populationのプロパティ名を返します。
     * 
     * @return populationのプロパティ名
     */
    public static PropertyName<Integer> population() {
        return new PropertyName<Integer>("population");
    }

    /**
     * countryのプロパティ名を返します。
     * 
     * @return countryのプロパティ名
     */
    public static _CountryNames country() {
        return new _CountryNames("country");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CityNames extends PropertyName<City> {

        /**
         * インスタンスを構築します。
         */
        public _CityNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CityNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _CityNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * countrycodeのプロパティ名を返します。
         *
         * @return countrycodeのプロパティ名
         */
        public PropertyName<String> countrycode() {
            return new PropertyName<String>(this, "countrycode");
        }

        /**
         * districtのプロパティ名を返します。
         *
         * @return districtのプロパティ名
         */
        public PropertyName<String> district() {
            return new PropertyName<String>(this, "district");
        }

        /**
         * populationのプロパティ名を返します。
         *
         * @return populationのプロパティ名
         */
        public PropertyName<Integer> population() {
            return new PropertyName<Integer>(this, "population");
        }

        /**
         * countryのプロパティ名を返します。
         * 
         * @return countryのプロパティ名
         */
        public _CountryNames country() {
            return new _CountryNames(this, "country");
        }
    }
}