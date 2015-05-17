package app.test.entity;

import app.test.entity.CountryNames._CountryNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Countrylanguage}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/05/17 14:46:13")
public class CountrylanguageNames {

    /**
     * countrycodeのプロパティ名を返します。
     * 
     * @return countrycodeのプロパティ名
     */
    public static PropertyName<String> countrycode() {
        return new PropertyName<String>("countrycode");
    }

    /**
     * languageのプロパティ名を返します。
     * 
     * @return languageのプロパティ名
     */
    public static PropertyName<String> language() {
        return new PropertyName<String>("language");
    }

    /**
     * isofficialのプロパティ名を返します。
     * 
     * @return isofficialのプロパティ名
     */
    public static PropertyName<String> isofficial() {
        return new PropertyName<String>("isofficial");
    }

    /**
     * percentageのプロパティ名を返します。
     * 
     * @return percentageのプロパティ名
     */
    public static PropertyName<Float> percentage() {
        return new PropertyName<Float>("percentage");
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
    public static class _CountrylanguageNames extends PropertyName<Countrylanguage> {

        /**
         * インスタンスを構築します。
         */
        public _CountrylanguageNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CountrylanguageNames(final String name) {
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
        public _CountrylanguageNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * languageのプロパティ名を返します。
         *
         * @return languageのプロパティ名
         */
        public PropertyName<String> language() {
            return new PropertyName<String>(this, "language");
        }

        /**
         * isofficialのプロパティ名を返します。
         *
         * @return isofficialのプロパティ名
         */
        public PropertyName<String> isofficial() {
            return new PropertyName<String>(this, "isofficial");
        }

        /**
         * percentageのプロパティ名を返します。
         *
         * @return percentageのプロパティ名
         */
        public PropertyName<Float> percentage() {
            return new PropertyName<Float>(this, "percentage");
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