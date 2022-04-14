package core.liquid.objects.annotations;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
public @interface NotWorking {
    /*
    * This annotation working like {@code @Deprecated}, but when this class annotated,
    * element not considered deprecated, and just temporarily not working.
    */
}
