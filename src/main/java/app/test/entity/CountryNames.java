package app.test.entity;

import app.test.entity.CityNames._CityNames;
import app.test.entity.CountrylanguageNames._CountrylanguageNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Country}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/05/17 14:46:13")
public class CountryNames {

    /**
     * codeのプロパティ名を返します。
     * 
     * @return codeのプロパティ名
     */
    public static PropertyName<String> code() {
        return new PropertyName<String>("code");
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
     * continentのプロパティ名を返します。
     * 
     * @return continentのプロパティ名
     */
    public static PropertyName<String> continent() {
        return new PropertyName<String>("continent");
    }

    /**
     * regionのプロパティ名を返します。
     * 
     * @return regionのプロパティ名
     */
    public static PropertyName<String> region() {
        return new PropertyName<String>("region");
    }

    /**
     * surfaceareaのプロパティ名を返します。
     * 
     * @return surfaceareaのプロパティ名
     */
    public static PropertyName<Float> surfacearea() {
        return new PropertyName<Float>("surfacearea");
    }

    /**
     * indepyearのプロパティ名を返します。
     * 
     * @return indepyearのプロパティ名
     */
    public static PropertyName<Short> indepyear() {
        return new PropertyName<Short>("indepyear");
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
     * lifeexpectancyのプロパティ名を返します。
     * 
     * @return lifeexpectancyのプロパティ名
     */
    public static PropertyName<Float> lifeexpectancy() {
        return new PropertyName<Float>("lifeexpectancy");
    }

    /**
     * gnpのプロパティ名を返します。
     * 
     * @return gnpのプロパティ名
     */
    public static PropertyName<Float> gnp() {
        return new PropertyName<Float>("gnp");
    }

    /**
     * gnpoldのプロパティ名を返します。
     * 
     * @return gnpoldのプロパティ名
     */
    public static PropertyName<Float> gnpold() {
        return new PropertyName<Float>("gnpold");
    }

    /**
     * localnameのプロパティ名を返します。
     * 
     * @return localnameのプロパティ名
     */
    public static PropertyName<String> localname() {
        return new PropertyName<String>("localname");
    }

    /**
     * governmentformのプロパティ名を返します。
     * 
     * @return governmentformのプロパティ名
     */
    public static PropertyName<String> governmentform() {
        return new PropertyName<String>("governmentform");
    }

    /**
     * headofstateのプロパティ名を返します。
     * 
     * @return headofstateのプロパティ名
     */
    public static PropertyName<String> headofstate() {
        return new PropertyName<String>("headofstate");
    }

    /**
     * capitalのプロパティ名を返します。
     * 
     * @return capitalのプロパティ名
     */
    public static PropertyName<Integer> capital() {
        return new PropertyName<Integer>("capital");
    }

    /**
     * code2のプロパティ名を返します。
     * 
     * @return code2のプロパティ名
     */
    public static PropertyName<String> code2() {
        return new PropertyName<String>("code2");
    }

    /**
     * cityListのプロパティ名を返します。
     * 
     * @return cityListのプロパティ名
     */
    public static _CityNames cityList() {
        return new _CityNames("cityList");
    }

    /**
     * countrylanguageListのプロパティ名を返します。
     * 
     * @return countrylanguageListのプロパティ名
     */
    public static _CountrylanguageNames countrylanguageList() {
        return new _CountrylanguageNames("countrylanguageList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CountryNames extends PropertyName<Country> {

        /**
         * インスタンスを構築します。
         */
        public _CountryNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CountryNames(final String name) {
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
        public _CountryNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * codeのプロパティ名を返します。
         *
         * @return codeのプロパティ名
         */
        public PropertyName<String> code() {
            return new PropertyName<String>(this, "code");
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
         * continentのプロパティ名を返します。
         *
         * @return continentのプロパティ名
         */
        public PropertyName<String> continent() {
            return new PropertyName<String>(this, "continent");
        }

        /**
         * regionのプロパティ名を返します。
         *
         * @return regionのプロパティ名
         */
        public PropertyName<String> region() {
            return new PropertyName<String>(this, "region");
        }

        /**
         * surfaceareaのプロパティ名を返します。
         *
         * @return surfaceareaのプロパティ名
         */
        public PropertyName<Float> surfacearea() {
            return new PropertyName<Float>(this, "surfacearea");
        }

        /**
         * indepyearのプロパティ名を返します。
         *
         * @return indepyearのプロパティ名
         */
        public PropertyName<Short> indepyear() {
            return new PropertyName<Short>(this, "indepyear");
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
         * lifeexpectancyのプロパティ名を返します。
         *
         * @return lifeexpectancyのプロパティ名
         */
        public PropertyName<Float> lifeexpectancy() {
            return new PropertyName<Float>(this, "lifeexpectancy");
        }

        /**
         * gnpのプロパティ名を返します。
         *
         * @return gnpのプロパティ名
         */
        public PropertyName<Float> gnp() {
            return new PropertyName<Float>(this, "gnp");
        }

        /**
         * gnpoldのプロパティ名を返します。
         *
         * @return gnpoldのプロパティ名
         */
        public PropertyName<Float> gnpold() {
            return new PropertyName<Float>(this, "gnpold");
        }

        /**
         * localnameのプロパティ名を返します。
         *
         * @return localnameのプロパティ名
         */
        public PropertyName<String> localname() {
            return new PropertyName<String>(this, "localname");
        }

        /**
         * governmentformのプロパティ名を返します。
         *
         * @return governmentformのプロパティ名
         */
        public PropertyName<String> governmentform() {
            return new PropertyName<String>(this, "governmentform");
        }

        /**
         * headofstateのプロパティ名を返します。
         *
         * @return headofstateのプロパティ名
         */
        public PropertyName<String> headofstate() {
            return new PropertyName<String>(this, "headofstate");
        }

        /**
         * capitalのプロパティ名を返します。
         *
         * @return capitalのプロパティ名
         */
        public PropertyName<Integer> capital() {
            return new PropertyName<Integer>(this, "capital");
        }

        /**
         * code2のプロパティ名を返します。
         *
         * @return code2のプロパティ名
         */
        public PropertyName<String> code2() {
            return new PropertyName<String>(this, "code2");
        }

        /**
         * cityListのプロパティ名を返します。
         * 
         * @return cityListのプロパティ名
         */
        public _CityNames cityList() {
            return new _CityNames(this, "cityList");
        }

        /**
         * countrylanguageListのプロパティ名を返します。
         * 
         * @return countrylanguageListのプロパティ名
         */
        public _CountrylanguageNames countrylanguageList() {
            return new _CountrylanguageNames(this, "countrylanguageList");
        }
    }
}