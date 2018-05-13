package service.constants;

import java.util.regex.Pattern;

public final class TagConstants {
    public final static Pattern OPEN_TAG = Pattern.compile("[<]([A-z0-9-]+)([ A-z0-9='\"]*)[>]");
    public final static Pattern CLOSE_TAG = Pattern.compile("([<][/]([A-z0-9]+)[>])");
    public final static Pattern TAG_WITHOUT_BODY = Pattern.compile("([<]([A-z0-9]+)[/][>])");
}
