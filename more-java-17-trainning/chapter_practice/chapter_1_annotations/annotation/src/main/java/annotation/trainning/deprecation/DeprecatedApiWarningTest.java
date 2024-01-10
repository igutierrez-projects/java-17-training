package annotation.trainning.deprecation;

public class DeprecatedApiWarningTest {

    //====================Use-site: Not deprecated====================
    /**
     * API: Not deprecated
     * Use-site: Not deprecated
     * Deprecation warning: No warning
     */
    public static void noDeprecated(){
        Box.noDeprecated();
    }

    /**
     * API: Ordinarily Deprecated (forRemoval=false)
     * Use-site: Not deprecated
     * Deprecation warning: Ordinary warning
     */
    public static void ordinarilyDeprecatedApiNotDeprecatedUseSite(){
        Box.deprecatedOrdinarily();
    }

    /**
     * API: Terminally Deprecated (forRemoval=true)
     * Use-site: Not deprecated
     * Deprecation warning: Removal warning
     */
    public static void terminallyDeprecatedApiNotDeprecatedUseSite() {
        Box.deprecatedTerminally();
    }

    //====================Use-site: Ordinarily Deprecated (forRemoval=false)====================
    /**
     * API: Not deprecated
     * Use-site: Ordinarily Deprecated (forRemoval=false)
     * Deprecation warning: No warning
     * @deprecated  Do not use it.
     */
    @Deprecated(since = "11")
    public static void notDeprecatedApiordinarilyDeprecatedUseSite() {
        Box.noDeprecated();
    }

    /**
     * API: Ordinarily Deprecated (forRemoval=false)
     * Use-site: Ordinarily Deprecated (forRemoval=false)
     * Deprecation warning: No warning
     * @deprecated  Do not use it.
     */
    @Deprecated(since = "11")
    public static void ordinarilyDeprecated() {
        Box.deprecatedOrdinarily();
    }

    /**
     * API: Terminally Deprecated (forRemoval=true)
     * Use-site: Ordinarily Deprecated (forRemoval=false)
     * Deprecation warning: Removal warning
     * @deprecated  Do not use it.
     */
    @Deprecated(since = "11")
    public static void terminallyDeprecatedApiOrdinarilyDeprecatedUseSite() {
        Box.deprecatedTerminally();
    }

    //====================Use-site: Terminally Deprecated (forRemoval=true)====================

    /**
     * API: Not deprecated
     * Use-site: Terminally Deprecated (forRemoval=true)
     * Deprecation warning: No warning
     * @deprecated  Going away in a future release
     */
    @Deprecated(since = "11", forRemoval = true)
    public static void notDeprecatedApiTerminallyDeprecatedUseSite() {
        Box.noDeprecated();
    }

    /**
     * API: Ordinarily Deprecated (forRemoval=false)
     * Use-site: Terminally Deprecated (forRemoval=true)
     * Deprecation warning: No warning
     * @deprecated  Going away in a future release
     */
    @Deprecated(since = "11", forRemoval = true)
    public static void ordinarilyDeprecatedApiTerminallyDeprecatedUseSite() {
        Box.deprecatedOrdinarily();
    }

    /**
     * API: Terminally Deprecated (forRemoval=true)
     * Use-site: Terminally Deprecated (forRemoval=true)
     * Deprecation warning: Removal warning
     * @deprecated  Going away in a future release
     */
    @Deprecated(since = "11", forRemoval = true)
    public static void terminallyDeprecated() {
        Box.deprecatedTerminally();
    }

    //==========================SuppressWarnings=================================

    /**
     * API: Ordinarily Deprecated (forRemoval=false) and Terminally Deprecated (forRemoval=true)
     * Use-site: Not deprecated
     * Deprecation warning: Ordinary and removal warning
     */
    public static void ordinarilyAndTerminallyDeprecatedApiNotDeprecatedUseSite() {
        Box.deprecatedOrdinarily();
        Box.deprecatedTerminally();
    }

    /**
     * API: Ordinarily Deprecated (forRemoval=false) and Terminally Deprecated (forRemoval=true)
     * Use-site: Not deprecated
     * Deprecation warning: Removal warning
     * Suppress deprecation warning
     */
    @SuppressWarnings("deprecation")
    public static void ordinarilyAndTerminallyDeprecatedApiNotDeprecatedUseSiteSuppressDeprecation() {
        Box.deprecatedOrdinarily();
        Box.deprecatedTerminally();
    }

    /**
     * API: Ordinarily Deprecated (forRemoval=false) and Terminally Deprecated (forRemoval=true)
     * Use-site: Not deprecated
     * Deprecation warning: Ordinary warning
     * Suppress removal warning
     */
    @SuppressWarnings("removal")
    public static void ordinarilyAndTerminallyDeprecatedApiNotDeprecatedUseSiteSuppressRemoval() {
        Box.deprecatedOrdinarily();
        Box.deprecatedTerminally();
    }

    /**
     * API: Ordinarily Deprecated (forRemoval=false) and Terminally Deprecated (forRemoval=true)
     * Use-site: Not deprecated
     * Deprecation warning: No warnign
     * Suppress all warnings
     */
    @SuppressWarnings({"deprecation","removal"})
    public static void ordinarilyAndTerminallyDeprecatedApiNotDeprecatedUseSiteSuppressall() {
        Box.deprecatedOrdinarily();
        Box.deprecatedTerminally();
    }

/*
|Use-Site \ API             |Not deprecated     |Ordinarily Deprecated      |Terminally Deprecated      |
|Not deprecated             |No warning         |Ordinary warning           |Removal warning            |
|Ordinarily Deprecated      |No warning         |No warning                 |Removal warning            |
|Terminally Deprecated      |No warning         |No warning                 |Removal warning            |

 */


}
