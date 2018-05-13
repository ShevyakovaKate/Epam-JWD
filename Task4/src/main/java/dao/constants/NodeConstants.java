package dao.constants;

import java.util.regex.Pattern;

public final class NodeConstants {
    public final static String OPEN_BRACKET = "<";
    public final static String LAST_BRACKET = ">";
    public final static String LINE_FEED_CHARACTER = "\n";
    public final static String CARRIAGE_RETURN_CHARACTER = "\r";
    public final static int BEGIN_OF_LINE = 0;
    public final static int INCLUDING_LAST = 1;
    public final static Pattern XML_DECLARATION = Pattern.compile("(<\\?.*\\?>)");

    private NodeConstants(){}
}
