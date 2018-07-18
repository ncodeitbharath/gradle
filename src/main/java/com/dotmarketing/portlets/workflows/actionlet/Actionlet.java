package com.dotmarketing.portlets.workflows.actionlet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Encapsulates configuration for an Actionlet
 * @author jsanca
 */
@Target({ ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Actionlet {

    /**
     * Set this to true if the actionlet saves a content
     */
    boolean save()    default false;

    /**
     * Set this to true if the actionlet publish a content
     */
    boolean publish() default false;

    /**
     * Set this to true if the actionlet push publish a content
     */
    boolean pushPublish() default false;
}
