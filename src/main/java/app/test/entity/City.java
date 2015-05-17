package app.test.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Cityエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/05/17 14:46:08")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** nameプロパティ */
    @Column(length = 35, nullable = false, unique = false)
    public String name;

    /** countrycodeプロパティ */
    @Column(length = 3, nullable = false, unique = false)
    public String countrycode;

    /** districtプロパティ */
    @Column(length = 20, nullable = false, unique = false)
    public String district;

    /** populationプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer population;

    /** country関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    public Country country;
}