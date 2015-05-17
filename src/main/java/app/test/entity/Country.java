package app.test.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Countryエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/05/17 14:46:09")
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    /** codeプロパティ */
    @Id
    @Column(length = 3, nullable = false, unique = true)
    public String code;

    /** nameプロパティ */
    @Column(length = 52, nullable = false, unique = false)
    public String name;

    /** continentプロパティ */
    @Column(length = 13, nullable = false, unique = false)
    public String continent;

    /** regionプロパティ */
    @Column(length = 26, nullable = false, unique = false)
    public String region;

    /** surfaceareaプロパティ */
    @Column(precision = 10, scale = 2, nullable = false, unique = false)
    public Float surfacearea;

    /** indepyearプロパティ */
    @Column(precision = 5, nullable = true, unique = false)
    public Short indepyear;

    /** populationプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer population;

    /** lifeexpectancyプロパティ */
    @Column(precision = 3, scale = 1, nullable = true, unique = false)
    public Float lifeexpectancy;

    /** gnpプロパティ */
    @Column(precision = 10, scale = 2, nullable = true, unique = false)
    public Float gnp;

    /** gnpoldプロパティ */
    @Column(precision = 10, scale = 2, nullable = true, unique = false)
    public Float gnpold;

    /** localnameプロパティ */
    @Column(length = 45, nullable = false, unique = false)
    public String localname;

    /** governmentformプロパティ */
    @Column(length = 45, nullable = false, unique = false)
    public String governmentform;

    /** headofstateプロパティ */
    @Column(length = 60, nullable = true, unique = false)
    public String headofstate;

    /** capitalプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer capital;

    /** code2プロパティ */
    @Column(length = 2, nullable = false, unique = false)
    public String code2;

    /** cityList関連プロパティ */
    @OneToMany(mappedBy = "country")
    public List<City> cityList;

    /** countrylanguageList関連プロパティ */
    @OneToMany(mappedBy = "country")
    public List<Countrylanguage> countrylanguageList;
}