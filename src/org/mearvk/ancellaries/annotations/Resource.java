package org.mearvk.ancellaries.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.FIELD})
public @interface Resource
{
    String tie() default "$tie";

    String name() default "$name";

    String value() default "$value";

    String resolver() default "$resolver";

    String frame() default "$frame";

    String init() default "$init";

    String initfile() default "$initfile";

    String rules() default "$rules";

    String[] rmi() default "$rmi";

    String pilot() default "$pilot";

    String monitor() default "$monitor";

    String security() default "$security";

    String[] circuits() default "$circuits";
}
