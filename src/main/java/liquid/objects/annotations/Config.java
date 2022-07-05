package liquid.objects.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * New config system
 *
 * Usage:
 *
 * &#064;Config
 * public static boolean example = true;
 *
 * in json:
 * {
 *   "common": {
 *     "example": {
 *       "comment": "automatically generated by liquid core",
 *       "value": true
 *     }
 *   }
 * }
 *
 * Ported from fabric
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Config {
    String configBranch() default "common";
    String comment() default "automatically generated by liquid core";
}
