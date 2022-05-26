package p159f.p166c.p209h;

import android.util.Log;
import java.util.Locale;

/* renamed from: f.c.h.a */
/* compiled from: Lg */
public class C4575a {
    /* renamed from: a */
    private static String m19987a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 4) {
            return str;
        }
        StackTraceElement stackTraceElement = stackTrace[4];
        return String.format(Locale.US, "%s.%s(%s:%d) %s", new Object[]{stackTraceElement.getClassName().substring(stackTraceElement.getClassName().lastIndexOf(".") + 1), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), str});
    }

    /* renamed from: b */
    public static void m19988b(String str) {
        Log.d("[TAGF]", m19987a(str));
    }

    /* renamed from: c */
    public static void m19989c(String str) {
        Log.e("[TAGF]", m19987a(str));
    }

    /* renamed from: d */
    public static void m19990d(String str) {
        Log.i("[TAGF]", m19987a(str));
    }

    /* renamed from: e */
    public static void m19991e(Exception exc) {
        Log.e("[TAGF]", m19987a("------> FATAL EXCEPTION:" + exc.getMessage()));
    }

    /* renamed from: f */
    public static void m19992f(String str) {
        Log.v("[TAGF]", m19987a(str));
    }

    /* renamed from: g */
    public static void m19993g(String str) {
        Log.w("[TAGF]", m19987a(str));
    }
}
