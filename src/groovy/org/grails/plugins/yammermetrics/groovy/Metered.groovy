package org.grails.plugins.yammermetrics.groovy

import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Any method marked with this annotation will undergo AST Transformation to
 * wrap the method call in a metering block using the Timer api.
 */
@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.METHOD])
@GroovyASTTransformationClass(["org.grails.plugins.yammermetrics.groovy.ast.YMeteredASTTransformation"])
public @interface Metered {
    String name() default "";

}
