package retrofit.mime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public final class MimeUtil {
    private static final Pattern CHARSET = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);

    private MimeUtil() {
    }

    @Deprecated
    public static String parseCharset(String str) {
        return parseCharset(str, "UTF-8");
    }

    public static String parseCharset(String str, String str2) {
        Matcher matcher = CHARSET.matcher(str);
        return matcher.find() ? matcher.group(1).replaceAll("[\"\\\\]", BuildConfig.FLAVOR) : str2;
    }
}
