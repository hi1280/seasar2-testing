package app.test.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Countrylanguageエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/05/17 14:46:09")
public class Countrylanguage implements Serializable {

    private static final long serialVersionUID = 1L;

    /** countrycodeプロパティ */
    @Id
    @Column(length = 3, nullable = false, unique = false)
    public String countrycode;

    /** languageプロパティ */
    @Id
    @Column(length = 30, nullable = false, unique = false)
    public String language;

    /** isofficialプロパティ */
    @Column(length = 2, nullable = false, unique = false)
    public String isofficial;

    /** percentageプロパティ */
    @Column(precision = 4, scale = 1, nullable = false, unique = false)
    public Float percentage;

    /** country関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    public Country country;
}